package net.ayd1ndemirci.bank.services;

import net.ayd1ndemirci.bank.cache.Cache;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Map;

public class Transactions {

    public Transactions() {
        JFrame frame = new JFrame("Hesap Geçmişi");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        List<Map.Entry<String, String>> transactions = Cache.getTransactions().entrySet().stream().toList();

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : transactions) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }

        textArea.setText(sb.toString());

        frame.setVisible(true);
    }
}
