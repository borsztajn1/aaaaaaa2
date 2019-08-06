package oknaaa;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ColoredPanels {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JPanel gui = new JPanel(new BorderLayout(3,3));
                gui.setBackground(Color.BLUE);
                gui.setBorder(new EmptyBorder(5,5,5,5));

                JPanel panel1 = new JPanel();
                panel1.setPreferredSize(new Dimension(300,20));
                panel1.setBackground(Color.RED);
                gui.add(panel1, BorderLayout.NORTH);

                JPanel panel2 = new JPanel();
                panel2.setPreferredSize(new Dimension(300,10));
                panel2.setBackground(Color.ORANGE);
                gui.add(panel2, BorderLayout.CENTER);

                JPanel panel3 = new JPanel();
                panel3.setPreferredSize(new Dimension(300,50));
                panel3.setBackground(Color.YELLOW);
                gui.add(panel3, BorderLayout.SOUTH);

                // a frame would need pack() etc.
                JOptionPane.showMessageDialog(null, gui);
            }
        });
    }
}