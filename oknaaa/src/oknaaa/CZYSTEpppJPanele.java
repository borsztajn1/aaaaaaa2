package oknaaa;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;

//http://www.wideskills.com/java-tutorial/java-jlabel-class-example
//http://www.mathcs.emory.edu/~cheung/Courses/377/Syllabus/8-JDBC/GUI/layout.html
//https://vaadin.com/forum#!/thread/1256732
//https://www.ulozto.net/hledej?q=vaadin
//ozgvt.Udemy..Building.a.Rich.Internet.Application.with.Vaadin.part1.rar

//http://programistajava.com/warsztat/metodologia
//http://yaqzi.pl/2014/02/kurs-mavena-cz-02-tworzenie-modulow/

//http://www.macs.hw.ac.uk/cs/java-swing-guidebook/?name=Layouts&page=4
//http://www.macs.hw.ac.uk/cs/java-swing-guidebook/?name=JPanel&page=2
//http://staticvoidgames.com/tutorials/swing/layouts
//http://www.codejava.net/java-se/swing/jpanel-basic-tutorial-and-examples
	
public class CZYSTEpppJPanele {

    public static void main(String[] args) {

        JFrame frame = new JFrame("JPanels");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BorderLayout layout = new BorderLayout();
        frame.setLayout(layout);

        JPanel northPanel = new JPanel();
        JPanel westPanel = new JPanel();
        JPanel centerPanel = new JPanel();
        JPanel eastPanel = new JPanel();
        JPanel southPanel = new JPanel();

        JButton button1 = new JButton("A JButton");
        //button1.centerPanel();
        //LUB: northPanel.add(new JButton("A"));
        centerPanel.add(button1);

        northPanel.setBackground(Color.RED);
        westPanel.setBackground(Color.BLUE);
        centerPanel.setBackground(Color.GREEN);
        eastPanel.setBackground(Color.ORANGE);
        southPanel.setBackground(Color.CYAN);

        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(westPanel, BorderLayout.WEST);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(eastPanel, BorderLayout.EAST);
        frame.add(southPanel, BorderLayout.SOUTH);

        frame.setSize(250, 250);
        frame.setVisible(true);
    }
}
