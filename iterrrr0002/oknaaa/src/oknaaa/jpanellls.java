package oknaaa;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class jpanellls extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().setLayout(new BorderLayout());

        JPanel green = new JPanel();
        green.setPreferredSize(new Dimension(800, 150));
        green.setBackground(Color.GREEN);
green.add(new Button("aaa"));

        JPanel yellow = new JPanel();
        //green.setPreferredSize(new Dimension(800, 150));
        yellow.setBackground(Color.YELLOW);

        frame.getContentPane().add(green, BorderLayout.PAGE_START);
        frame.getContentPane().add(yellow, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}