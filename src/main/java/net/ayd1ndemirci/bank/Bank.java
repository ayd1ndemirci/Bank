package net.ayd1ndemirci.bank;

import net.ayd1ndemirci.bank.listener.BankButton;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Bank {

    public static JFrame frame;
    public static JTextField textField;

    public Bank() {
        frame = new JFrame("Banka Menüsü");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setEditable(false);
        frame.add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 2, 15, 15));

        String[][] buttons = {
                {"Parana Bak", "Para Yatır"},
                {"Para Çek", "Hesap Geçmişi"}
        };

        for (String[] row : buttons) {
            for (String text : row) {
                JButton button = new JButton(text);
                button.setBackground(new Color(33, 150, 243));
                button.setForeground(Color.WHITE);
                button.setFont(new Font("Segoe UI", Font.BOLD, 16));
                button.setFocusPainted(false);
                button.setBorder(new RoundBorder(15));

                button.addActionListener(new BankButton());
                buttonPanel.add(button);
            }
        }

        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Bank();
    }
}
