        package ProjectProposal.gui;
      
        import ProjectProposal.data.AppData;
        import ProjectProposal.system.ChickenParts;
        import ProjectProposal.system.Exportable;
        import ProjectProposal.system.WholeChicken;
        import javax.swing.*;
        import java.awt.*;

            public class DataEntryPage extends JFrame {

            private JComboBox<String> typeCombo;
            private JTextField batchIdField;
            private JTextField countryField;
            private JTextField weightField;
            private JTextField priceField;

            
            private JLabel specificLabel;
            private JPanel specificPanel;
            private CardLayout specificCards;
            private JTextField birdsField;
            private JComboBox<String> partCombo;

            private JTextArea displayArea;

            public DataEntryPage() {
                setTitle("Data Entry");
                setSize(780, 420);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                setLocationRelativeTo(null);
                getRootPane().setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                setLayout(new GridLayout(1, 2, 10, 10));

                add(createFormPanel());
                add(createDisplayPanel());

                refreshDisplay();
            }

            private JPanel createFormPanel() {
                JPanel panel = new JPanel(new BorderLayout(10, 10));
                panel.setBorder(BorderFactory.createTitledBorder("New Batch"));

                
                typeCombo = new JComboBox<>(new String[]{"Whole Chicken", "Chicken Parts"});
                JPanel typePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
                typePanel.add(new JLabel("Product type:"));
                typePanel.add(typeCombo);

                
                batchIdField = new JTextField();
                countryField = new JTextField();
                weightField = new JTextField();
                priceField = new JTextField();

                
                birdsField = new JTextField();
                partCombo = new JComboBox<>(new String[]{"Breast", "Wing", "Drumstick", "Thigh"});
                specificCards = new CardLayout();
                specificPanel = new JPanel(specificCards);
                specificPanel.add(birdsField, "WHOLE");
                specificPanel.add(partCombo, "PARTS");
                specificLabel = new JLabel("Number of birds:");

                typeCombo.addActionListener(e -> updateSpecificFields());

                JPanel formPanel = new JPanel(new GridLayout(5, 2, 8, 8));
                formPanel.add(new JLabel("Batch ID:"));
                formPanel.add(batchIdField);
                formPanel.add(new JLabel("Destination country:"));
                formPanel.add(countryField);
                formPanel.add(new JLabel("Weight (kg):"));
                formPanel.add(weightField);
                formPanel.add(new JLabel("Price per kg:"));
                formPanel.add(priceField);
                formPanel.add(specificLabel);
                formPanel.add(specificPanel);

                
                JPanel formWrapper = new JPanel(new BorderLayout());
                formWrapper.add(formPanel, BorderLayout.NORTH);

                
                JButton addButton = new JButton("Add");
                JButton backButton = new JButton("Back");
                addButton.addActionListener(e -> JOptionPane.showMessageDialog(this,
                        "GUI preview only. The add logic will be implemented later."));
                backButton.addActionListener(e -> dispose());
                addButton.addActionListener(e -> addProduct());

                JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
                buttonPanel.add(addButton);
                buttonPanel.add(backButton);

                panel.add(typePanel, BorderLayout.NORTH);
                panel.add(formWrapper, BorderLayout.CENTER);
                panel.add(buttonPanel, BorderLayout.SOUTH);
                return panel;
            }

            private JPanel createDisplayPanel() {
                JPanel panel = new JPanel(new BorderLayout());
                panel.setBorder(BorderFactory.createTitledBorder("All Batches"));

                displayArea = new JTextArea("No batches yet.");
                displayArea.setEditable(false);
                displayArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));

                panel.add(new JScrollPane(displayArea), BorderLayout.CENTER);
                return panel;
            }

            
            private void updateSpecificFields() {
                if (typeCombo.getSelectedIndex() == 0) {
                    specificLabel.setText("Number of birds:");
                    specificCards.show(specificPanel, "WHOLE");
                } else {
                    specificLabel.setText("Part type:");
                    specificCards.show(specificPanel, "PARTS");
                }
            }
            private void addProduct() {
        try {
            String batchId = batchIdField.getText().trim();
            String country = countryField.getText().trim();
            if (batchId.isEmpty() || country.isEmpty()) {
                throw new IllegalArgumentException("Batch ID and destination country must not be empty.");
            }
            double weight = parsePositiveNumber(weightField.getText(), "Weight");
            double price = parsePositiveNumber(priceField.getText(), "Price per kg");
 
            
            Exportable product;
            if (typeCombo.getSelectedIndex() == 0) {
                int birds = parsePositiveInt(birdsField.getText(), "Number of birds");
                product = new WholeChicken(batchId, country, weight, price, birds);
            } else {
                String partType = (String) partCombo.getSelectedItem();
                product = new ChickenParts(batchId, country, weight, price, partType);
            }
 
            AppData.getProducts().add(product);
            refreshDisplay();
            clearFields();
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "Invalid input", JOptionPane.ERROR_MESSAGE);
        }
    }
 
    
    private double parsePositiveNumber(String text, String fieldName) {
        double value;
        try {
            value = Double.parseDouble(text.trim());
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException(fieldName + " must be a number.");
        }
        if (Double.isNaN(value) || Double.isInfinite(value) || value <= 0) {
            throw new IllegalArgumentException(fieldName + " must be greater than zero.");
        }
        return value;
    }
 
   
    private int parsePositiveInt(String text, String fieldName) {
        int value;
        try {
            value = Integer.parseInt(text.trim());
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException(fieldName + " must be a whole number.");
        }
        if (value <= 0) {
            throw new IllegalArgumentException(fieldName + " must be greater than zero.");
        }
        return value;
    }
 
    
    private void refreshDisplay() {
        StringBuilder text = new StringBuilder();
        for (Exportable item : AppData.getProducts()) {
            text.append(item.getDescription()).append("\n\n");
        }
        displayArea.setText(text.length() == 0 ? "No batches yet." : text.toString());
    }
 
    private void clearFields() {
        batchIdField.setText("");
        countryField.setText("");
        weightField.setText("");
        priceField.setText("");
        birdsField.setText("");
        partCombo.setSelectedIndex(0);
    }
}
        
