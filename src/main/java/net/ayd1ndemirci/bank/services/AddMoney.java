package net.ayd1ndemirci.bank.services;

import net.ayd1ndemirci.bank.cache.Cache;

import javax.swing.*;

public class AddMoney {

    public AddMoney() {
        String input = JOptionPane.showInputDialog(null, "Yatırılacak Miktarı Girin:", "Para Yatır", JOptionPane.PLAIN_MESSAGE);
        if (input == null) {return;}
        try {
            double amount = Double.parseDouble(input);
            Cache.addMoney(amount);
            JOptionPane.showMessageDialog(null, "Para Başarıyla Yatırıldı!", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Geçersiz Miktar Girdiniz. Lütfen tekrar deneyin.", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }
}
