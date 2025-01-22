package net.ayd1ndemirci.bank.services;

import net.ayd1ndemirci.bank.cache.Cache;

import javax.swing.*;

public class TakeMoney {

    public TakeMoney() {
        String input = JOptionPane.showInputDialog(null, "Çekilecek Miktar Girin:", "Para Çek", JOptionPane.PLAIN_MESSAGE);
        if (input == null) {return;}

        try {
            double amount = Double.parseDouble(input);
            double current = Cache.getBalance();
            if (current < amount) {
                JOptionPane.showMessageDialog(null, "Paranız Yetersiz.", "Hata", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Cache.takeMoney(amount);
            JOptionPane.showMessageDialog(null, "Para Başarıyla Çekildi!", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Geçersiz Miktar Girdiniz. Lütfen tekrar deneyin.", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }
}
