package oknaaa;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cobie{// extends JFrame{
//    JButton rectButton = new JButton("Rectangle");
//    JButton ovalButton = new JButton("Oval");
//
//    JPanel buttonPanel = new JPanel();
//    JPanel paintSurface = new JPanel();
//
//    public Cobie(){
//        setLayout(new GridLayout(2,1));
//        buttonPanel.setBackground(Color.RED);
//        paintSurface.setBackground(Color.BLUE);
//        buttonPanel.add(rectButton);
//        buttonPanel.add(ovalButton);
//        add(buttonPanel);
//        add(paintSurface);
//    }
//
//    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable(){
//            public void run(){
//                Cobie c = new Cobie();
//                c.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//                c.setSize(600,400); //Avoid using this method
//                c.setVisible(true);
//            }
//        });
//
//    }
	
 public static void main(String args[])
  { 
   double x=5.1;
   int n=10;
    System.out.println(Abs(10));
    System.out.println(Abs(-1.2));
  }
 static int Abs(int n)  {    return n>0 ? n:-n;  //10
  }
 static double Abs(double x)  {    return x>0 ? x:-x;   //1.2
  }
}  

