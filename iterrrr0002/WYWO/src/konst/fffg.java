package konst;


import java.awt.event.ActionListener;

//import javax.persistence.Entity;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
import javax.swing.JFrame;
//import javax.persistence.Persistence;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class fffg extends JFrame implements ActionListener {

//https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-annotations-example/
//http://websystique.com/hibernate/hibernate-many-to-one-unidirectional-annotation-example/
// http://howtodoinjava.com/jpa/spring-hibernate-jpa-configuration-example/
//https://forum.4programmers.net/Java/179890-wyswietlenie_jpanelu_w_nowym_oknie	
// http://www.informit.com/articles/article.aspx?p=1671224&seqNum=2
//https://www.youtube.com/watch?v=3Sg3H-bEFRk
	
//http://outbottle.com/java-hibernate-manytomany-tutorial-with-add-and-delete-examples/
//http://howtodoinjava.com/hibernate/hibernate-many-to-many-mapping-using-annotations/
	
	
//    northFlowLayoutPanel.add(northButton);
//    northFlowLayoutPanel.setBorder(BorderFactory.createTitledBorder("Flow Layout"));
//
//    northButton.addActionListener(new ActionListener()
//    {
//      public void actionPerformed(ActionEvent e)
//      {
//        // display/center the jdialog when the button is pressed
//    	  gggh tte=new gggh();
//          tte.q();
//      }
//    });

	//    fffg tte=new fffg();
//  tte.q();
    
    public fffg(){

    	
        //setTitle(title);
        setBounds(300, 300, 600, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();

        JTextField text1 = new JTextField("11111");
        text1.setPreferredSize(new Dimension(200, 15));

        JTextField text2 = new JTextField("222222");
        text2.setPreferredSize(new Dimension(200, 80));

        JTextField text3 = new JTextField("333333");
        text3.setPreferredSize(new Dimension(100, 40));

        JTextField text4 = new JTextField("4444444");
        text4.setFont(new Font("555555", Font.PLAIN, 30));
        text4.setPreferredSize(new Dimension(200, 20));

        
        
        JLabel lastName=new JLabel("Last Name");
        JTextField lastNameE=new JTextField("Martian",20);
        JLabel firstName=new JLabel("First Name");
        JTextField firstNameE=new JTextField("Marvin",20);
        JLabel phone=new JLabel("Phone");
        JTextField phoneE=new JTextField("805-123-4567",20);
        JLabel email=new JLabel("Email");
        JTextField emailE=new JTextField("marvin@wb.com",20);
        JLabel address1=new JLabel("Address1");
        JTextField address1E=new JTextField("1001001010110 Martian Way ",30);
        JLabel address2=new JLabel("Addres2");
        JTextField address2E=new JTextField("Suite 101101011 ",30);
        JLabel city=new JLabel("City");
        JTextField cityE=new JTextField("Ventura ",20);
        JLabel state=new JLabel("State");
        JTextField stateE=new JTextField("CA ",20);
        JLabel country=new JLabel("Country");
        JTextField countryE=new JTextField("USA",20);
        JLabel postal=new JLabel("Postal Code");
        JTextField postalE=new JTextField("93001 ",20);
        JButton b1=new JButton("New");
        JButton b2=new JButton("Delete");
        JButton b3=new JButton("Edit");
        JButton b4=new JButton("Save");
        JButton b5=new JButton("Cancel");
        
//        p.add(text1);
//        p.add(text2);
//        p.add(text3);
//        p.add(text4);
        
        p.add(lastName,BorderLayout.LINE_START);
        p.add(lastNameE,BorderLayout.LINE_START); 
        
        p.add(firstName,BorderLayout.LINE_END);
        p.add(firstNameE,BorderLayout.LINE_END);
        p.add(phone);
        p.add(phoneE);
        
        p.add(email);
        p.add(emailE);
        p.add(address1);
        p.add(address1E);
        
        p.add(address2);
        p.add(address2E);
        p.add(city);
        p.add(cityE);
        
        p.add(country);
        p.add(countryE);
        p.add(state);
        p.add(stateE);
        
        p.add(country);
        p.add(countryE);
        p.add(postal);
        p.add(postalE);
        
               p.setLayout(new GridLayout(20, 2));
               p.add(b1);
               p.add(b2);
           p.add(b3); 
           p.add(b4);
               p.add(b5);
               
               
        Container contentPane = getContentPane();
        contentPane.add(p);
      
    }
        public void actionPerformed(ActionEvent ae){
            String s = ae.getActionCommand();
                if(s.equals("Insert"))
                    {          System.out.println("Button pressed");

                    }
        } 
//======================================================================
        public static void q() {
            fffg JF = new fffg();
            JF.setTitle("GUI for JDBC");
            JF.setSize(400,600);
            JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JF.setVisible(true);
        }
  

    public static void main(String[] args) {
    	///gggh2 JF2 = new gggh2();
    	q();     }
}