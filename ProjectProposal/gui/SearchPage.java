package ProjectProposal.gui;

import ProjectProposal.data.AppData;
import ProjectProposal.system.ChickenParts;
import ProjectProposal.system.Exportable;
import ProjectProposal.system.WholeChicken;

import javax.swing.*;
import java.awt.*;

public class SearchPage extends JFrame {

    private JComboBox<String> criteriaCombo;
    private JTextField valueField;
    private JTextArea resultArea;

    public SearchPage() {
        setTitle("Search");
        setSize(720, 420);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        getRootPane().setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setLayout(new BorderLayout(10, 10));

        add(createSearchPanel(), BorderLayout.NORTH);
        add(createResultPanel(), BorderLayout.CENTER);
        add(createBottomPanel(), BorderLayout.SOUTH);
    }

    private JPanel createSearchPanel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 8));
        panel.setBorder(BorderFactory.createTitledBorder("Search Criteria"));

        criteriaCombo = new JComboBox<>(new String[] {
                "Batch ID", "Destination Country", "Number of Birds", "Part Type" });
        valueField = new JTextField(15);
        JButton searchButton = new JButton("Search");

        searchButton.addActionListener(e -> search());

        panel.add(new JLabel("Search by:"));
        panel.add(criteriaCombo);
        panel.add(new JLabel("Value:"));
        panel.add(valueField);
        panel.add(searchButton);
        return panel;
    }

    private JPanel createResultPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createTitledBorder("Results"));

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        resultArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));

        panel.add(new JScrollPane(resultArea), BorderLayout.CENTER);
        return panel;
    }

    private JPanel createBottomPanel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> dispose());
        panel.add(backButton);

        return panel;
    }

    private void search() {
        String criterion = (String) criteriaCombo.getSelectedItem();
        String value = valueField.getText().trim();

        try {
            if (value.isEmpty()) {
                throw new IllegalArgumentException("Please enter a search value.");
            }

            int birds = 0;
            if (criterion.equals("Number of Birds")) {
                try {
                    birds = Integer.parseInt(value);
                } catch (NumberFormatException ex) {
                    throw new IllegalArgumentException("Number of birds must be a whole number.");
                }
            }

            StringBuilder results = new StringBuilder();
            int count = 0;
            for (Exportable item : AppData.getProducts()) {
                if (matches(item, criterion, value, birds)) {
                    results.append(item.getDescription()).append("\n\n");
                    count++;
                }
            }

            if (count == 0) {
                resultArea.setText("No results found.");
            } else {
                resultArea.setText("Found " + count + " result(s):\n\n" + results);
            }
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "Invalid input", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean matches(Exportable item, String criterion, String value, int birds) {
        switch (criterion) {
            case "Batch ID":
                return item.getBatchId().equalsIgnoreCase(value);
            case "Destination Country":
                return item.getDestinationCountry().equalsIgnoreCase(value);
            case "Number of Birds":
                if (item instanceof WholeChicken) {
                    return ((WholeChicken) item).getNumberOfBirds() == birds;
                }
                return false;
            case "Part Type":
                if (item instanceof ChickenParts) {
                    return ((ChickenParts) item).getPartType().equalsIgnoreCase(value);
                }
                return false;
            default:
                return false;
        }
    }
}
