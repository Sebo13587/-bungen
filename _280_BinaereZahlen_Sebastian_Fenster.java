package uebungen;

import javax.swing.*;
import java.awt.*;

public class _280_BinaereZahlen_Sebastian_Fenster {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Binaere Zahlen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500, 500);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(16, 16));

        for (int i = 0; i <= 255; i++) {
            String binary = Integer.toBinaryString(i);
            while (binary.length() < 8) {
                binary = "0" + binary;
            }
            JLabel label = new JLabel( i + ": " + binary);
            panel.add(label);
        }

        frame.add(panel);
        frame.setVisible(true);
    }
}




