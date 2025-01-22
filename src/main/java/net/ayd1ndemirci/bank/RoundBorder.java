package net.ayd1ndemirci.bank;

import javax.swing.border.Border;
import java.awt.*;

public class RoundBorder implements Border {
    private final int radius;

    public RoundBorder(int radius) {
        this.radius = radius;
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(radius, radius, radius, radius);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.setColor(c.getForeground());
        g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
    }
}