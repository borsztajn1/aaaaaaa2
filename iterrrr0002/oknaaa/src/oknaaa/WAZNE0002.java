package oknaaa;

//WYKRESY
//http://www.fromdev.com/2012/09/Free-Open-Source-Java-Charting-Library.html

import javax.swing.*;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.JScrollPane;
//http://www.macs.hw.ac.uk/cs/java-swing-guidebook/?name=JPanel&page=2
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Point;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.TitledBorder;

import konst.fffg;


//import konst.fffg;

public class WAZNE0002{
    
     public JPanel createContentPane (){
        
        // We create a bottom JPanel to place everything on.
        JPanel totalGUI = new JPanel();
        
        // We set the Layout Manager to null so we can manually place
        // the Panels.
        totalGUI.setLayout(null);
        
        // Now we create a new panel, size it, shape it,color it red.
        // then add it to the bottom JPanel.
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setLocation(10, 10);
        redPanel.setSize(150,500);
        redPanel.add(new Button("qqq11q"));
        
//        JScrollPane scrollpane;
//
        String[] stringArray = {"Testing","This","Stuff","This","Stuff","This","Stuff","This","Stuff"};
//        JList<String> rowList = new JList<String>(stringArray);
//        listScrollPane = new JScrollPane();
//        listScrollPane.getViewport().setView(rowList);

        JScrollPane listScroller = new JScrollPane();
//        listScroller.setViewportView(listArea);
//        listArea.setLayoutOrientation(JList.VERTICAL);
//        panel.add(listScroller);

        JList<String> list = new JList<>(stringArray);
        list.setVisibleRowCount(5);
        JScrollPane scrollPane_1 = new JScrollPane(list);
  //      scrollPane_1.setMaximumSize(new Dimension(200, 200));
    //    scrollPane_1.setMinimumSize (new Dimension (200,200));
       // panel.add(scrollPane_1 , BorderLayout.CENTER);
        
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
              if (evt.getValueIsAdjusting())
                return;
              System.out.println("Selected from " + evt.getFirstIndex() + " to " + evt.getLastIndex());
            }
          });
        
        JPanel panel = new JPanel(new BorderLayout()); 
        redPanel.add(scrollPane_1,BorderLayout.CENTER);
        
          //  bluePanel.add(list);
        totalGUI.add(redPanel);
        ///////////////////////////////////////////
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setLocation(10, 510);
        bluePanel.setSize(750, 150);
        
        
        bluePanel.add(new Button("qqq1111q"));
        
        JPanel guiCenter = new JPanel(new BorderLayout(2,2));
        guiCenter.setBorder(new TitledBorder("BorderLayout2"));
        JPanel buttonConstrain = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonConstrain.setBorder(new TitledBorder("FlowLayout2"));
        buttonConstrain.add( new JButton("Click Me2") );
        guiCenter.add( buttonConstrain, BorderLayout.NORTH );
        bluePanel.add( guiCenter, BorderLayout.NORTH );
        bluePanel.add(new JTextField(10));
 
        totalGUI.add(bluePanel);
        ///////////////////////////////////////////////////////
        JPanel bluePane3 = new JPanel();
        bluePane3.setBackground(Color.blue);
        bluePane3.setLocation(200, 150);
        bluePane3.setSize(550, 350);
       
        

        JPanel gui = new JPanel(new BorderLayout(2,2));
 
        JPanel labelFields = new JPanel(new BorderLayout(2,2));
        labelFields.setBorder(new TitledBorder("BorderLayout"));
 
        JPanel labels = new JPanel(new GridLayout(0,1,1,1));
        labels.setBorder(new TitledBorder("GridLayout"));
        JPanel fields = new JPanel(new GridLayout(0,1,1,1));
        fields.setBorder(new TitledBorder("GridLayout"));
 
        for (int ii=1; ii<4; ii++) {
            labels.add(new JLabel("Label            " + ii));
            // if these were of different size, it would be necessary to
            // constrain them using another panel
            fields.add(new JTextField(20));
        }
 
        labelFields.add(labels, BorderLayout.CENTER);
        labelFields.add(fields, BorderLayout.EAST);
        bluePane3.add(labelFields); //////
        // bluePane3.add(new JScrollPane(new JTextArea(5,30)));
 
       // bluePane3.add(new Button("qqqq"));
 
        //bluePane3.add(new Button("qqqq"));
        String[] columns = new String[] {"Id", "Name", "Hourly Rate", "Part Time"};
 Object[][] data = new Object[][] {{1, "John", 40.0, false },{2, "Rambo", 70.0, false },{3, "Zorro", 60.0, true },};
 JTable table = new JTable(data, columns);
 
 bluePane3.add(table); //////
        totalGUI.add(bluePane3);
        
//////////////////////////////////////////////////////////////////////
        table.addMouseListener(new java.awt.event.MouseAdapter()
        {
        	
        
public void mouseClicked(java.awt.event.MouseEvent e)
{
	JPopupMenu popupMenu = new JPopupMenu();
	JMenuItem menuItemAdd = new JMenuItem("Add New Row");
	JMenuItem menuItemRemove = new JMenuItem("Remove Current Row");
	JMenuItem menuItemRemoveAll = new JMenuItem("Remove All Rows");
	 
	popupMenu.add(menuItemAdd);
	popupMenu.add(menuItemRemove);
	popupMenu.add(menuItemRemoveAll);
// Right mouse click
 if ( SwingUtilities.isRightMouseButton( e ))  {
	 System.out.println("aaaa");
	 int row2=table.rowAtPoint(e.getPoint());
	 int co2l= table.columnAtPoint(e.getPoint());
	 int rowIndex2 = table.getSelectedRow();
	 
	 table.setComponentPopupMenu(popupMenu);
	 
	 System.out.println(rowIndex2);
	 //JOptionPane.showMessageDialog(null,"Value in the cell clicked :"+ " " +table.getValueAt(row,col).toString());
	 System.out.println(" Value in the cell clicked222 :"+  "" +table.getValueAt(row2,co2l).toString());
}
	if ( SwingUtilities.isLeftMouseButton( e ) )	{     
int row=table.rowAtPoint(e.getPoint());
int col= table.columnAtPoint(e.getPoint());
int rowIndex = table.getSelectedRow();
System.out.println(rowIndex);
//JOptionPane.showMessageDialog(null,"Value in the cell clicked :"+ " " +table.getValueAt(row,col).toString());
System.out.println(" Value in the cell clicked :"+  "" +table.getValueAt(row,col).toString());
}
}}
);
/////////////////////////////////////////////////////////////////////////
        
        // Finally we return the JPanel.
        totalGUI.setOpaque(true);
        return totalGUI;
    }
 
    private static void createAndShowGUI() {
 
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("[=] There's 3 JPanels in here! [=]");

      
        JMenuBar menuBar = new JMenuBar();

        // File Menu, F - Mnemonic
        JMenu fileMenu = new JMenu("File");
        JMenu fileMenu2 = new JMenu("File2");

        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);
        menuBar.add(fileMenu2);

        // File->New, N - Mnemonic
        JMenuItem newMenuItem = new JMenuItem("New", KeyEvent.VK_N);
        JMenuItem newMenuItem2 = new JMenuItem("New", KeyEvent.VK_N);

        fileMenu.add(newMenuItem);
        fileMenu.add(newMenuItem2);

        //Create and set up the content pane.
        WAZNE0002 demo = new WAZNE0002();
        frame.setContentPane(demo.createContentPane());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.add(menuBar);
        frame.setJMenuBar(menuBar);

        frame.setSize(800, 700);
        frame.setVisible(true);
    }
 


    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        //fffg tte=new fffg();
         //tte.q();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            //	  PokTab iiii = new PokTab();
              //   iiii.SimpleTableTest2();
                  
                createAndShowGUI();
            }
        });
    }
}