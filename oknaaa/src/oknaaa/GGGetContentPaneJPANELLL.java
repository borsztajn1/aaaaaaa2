package oknaaa;
import java.awt.*;
import javax.swing.*;
public class GGGetContentPaneJPANELLL {
    public static void main(String[] args) {
    JFrame frame = new JFrame("HelloWorldSwing");
    Container pane = frame.getContentPane();
    pane.setLayout(new BorderLayout()); 
    pane.add(new JButton("W"), BorderLayout.NORTH);
    pane.add(new JButton("E"), BorderLayout.SOUTH);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
    }
}

/*
 * import java.awt.*;
import javax.swing.*;
public class HelloWorldSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloWorldSwing");
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());        
        panel.add(new JButton("W"), BorderLayout.NORTH);
        panel.add(new JButton("E"), BorderLayout.SOUTH);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


I believe the reason is because Swing was built off of AWT, and Container is a top level AWT object.
 It really isn't the greatest design choice, though, since you generally don't want to mix AWT (heavyweight) 
 objects with Swing (lightweight).

I think the best way to handle it is to always cast the contentPane to a JPanel::::
-----JPanel contentPanel = (JPanel)aFrame.getContentPane();

It's not two competing mechanisms - a JPanel is a Container (just look at the class hierarchy at the top of the JPanel
 javadocs).  JFrame.getContentPane() just returns a Container to place the Components that you want to display in the JFrame. Internally, it's using a JPanel (by default - you can change this by calling setContentPane()) As for why it's returning a Container instead of a JPanel - it's because you should program to an interface, not an implementation - at that level, all that you need to care about is that you can add Components to something - and even though Container is a class rather than an interface - it provides the interface needed to do exactly that.

As for why both JFrame.add() and JFrame.getContentPane().add() both do the same thing - JFrame.add() is overridden to call 
JFrame.getContentPane().add(). This wasn't always the case - pre-JDK 1.5 you always had to specify 
JFrame.getContentPane().add() explicitly and JFrame.add() threw a RuntimeException if you called it, 
but due to many complaints, this was changed in JDK 1.5 to do what you'd expect.
 * */
 