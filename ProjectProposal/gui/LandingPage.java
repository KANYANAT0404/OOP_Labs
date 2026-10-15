package ProjectProposal.gui;

import javax.swing.*;
import java.awt.*;

public class LandingPage extends JFrame {

    public LandingPage() {
        setTitle("Chicken Export Batch Management");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JLabel titleLabel = new JLabel("Fresh Chicken Export Management System", SwingConstants.CENTER);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));
        add(titleLabel, BorderLayout.NORTH);

        JButton dataEntryButton = new JButton("Data Entry");
        JButton searchButton = new JButton("Search");
        JButton exitButton = new JButton("Exit");

        JPanel buttonPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 100, 30, 100));
        buttonPanel.add(dataEntryButton);
        buttonPanel.add(searchButton);
        buttonPanel.add(exitButton);
        add(buttonPanel, BorderLayout.CENTER);

        dataEntryButton.addActionListener(e -> new DataEntryPage().setVisible(true));
        searchButton.addActionListener(e -> new SearchPage().setVisible(true));
        exitButton.addActionListener(e -> System.exit(0));
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {

        }
        SwingUtilities.invokeLater(() -> new LandingPage().setVisible(true));
    }
}