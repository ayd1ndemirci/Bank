package net.ayd1ndemirci.bank.listener;

import net.ayd1ndemirci.bank.cache.Cache;
import net.ayd1ndemirci.bank.services.AddMoney;
import net.ayd1ndemirci.bank.services.SeeMoney;
import net.ayd1ndemirci.bank.services.TakeMoney;
import net.ayd1ndemirci.bank.services.Transactions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.List;

public class BankButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        if (command.equals("Parana Bak")) {
            new SeeMoney();
        } else if (command.equals("Para Yatır")) {
           new AddMoney();
        } else if (command.equals("Para Çek")) {
            new TakeMoney();
        } else if (command.equals("Hesap Geçmişi")) {
            new Transactions();
        }
    }
}
