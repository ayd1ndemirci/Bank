package net.ayd1ndemirci.bank.services;

import net.ayd1ndemirci.bank.cache.Cache;

import javax.swing.*;

public class SeeMoney {

    public SeeMoney() {
        JOptionPane.showMessageDialog(null,
                String.format("Paran %s TL", Cache.getBalance()),
                "Parana Bak", JOptionPane.INFORMATION_MESSAGE);

    }
}
