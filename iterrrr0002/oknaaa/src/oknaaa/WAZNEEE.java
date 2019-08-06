package oknaaa;
import javax.swing.JButton;
import javax.swing.JFrame;
//http://staticvoidgames.com/tutorials/swing/layouts
public class WAZNEEE {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Null Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null); //NULLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL

        JButton button1 = new JButton("One");
        button1.setSize(100, 50);
        button1.setLocation(200, 400);

        JButton button2 = new JButton("Two");
        button2.setSize(100, 200);
        button2.setLocation(350, 50);

        JButton button3 = new JButton("Three");
        button3.setSize(200, 200);
        button3.setLocation(50, 100);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}