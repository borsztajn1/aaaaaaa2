package oknaaa;
import java.awt.*;
//http://www.codejava.net/search?searchword=jtable&searchphrase=all
/*JTable table = new JTable();
 
    if (table.getCellSelectionEnabled()) {
      table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      int rowIndex = table.getSelectedRow();
      int colIndex = table.getSelectedColumn();
 
    }
 * */
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

//import konst.fffg;

public class PokTab extends JFrame
                {
private JPanel topPanel ;
private JTable table;
private JScrollPane scrollPane;
private String[] columnNames= new String[3];
private String[][] dataValues=new String[3][3] ;


public PokTab()
    {
setTitle("JTable Cell Click");
setSize(300,300);
topPanel= new JPanel();
topPanel.setLayout(new BorderLayout());
getContentPane().add(topPanel);
setDefaultCloseOperation(EXIT_ON_CLOSE);
columnNames=new String[] {"Column 1" , "Column 2" , "Column 3"};
dataValues = new String[][] {{"1","2","3"},{"4","5","6"}, {"7","8","9"}};
 
 TableModel model=new myTableModel();
 table =new JTable( );
 table.setRowHeight(50);
 table.setModel(model);
 scrollPane=new JScrollPane(table);
  topPanel.add(scrollPane,BorderLayout.CENTER);   
  table.addMouseListener(new java.awt.event.MouseAdapter()
            {
public void mouseClicked(java.awt.event.MouseEvent e)
{
int row=table.rowAtPoint(e.getPoint());
int col= table.columnAtPoint(e.getPoint());
int rowIndex = table.getSelectedRow();
System.out.println(rowIndex);
JOptionPane.showMessageDialog(null,"Value in the cell clicked :"+ " " +table.getValueAt(row,col).toString());
System.out.println(" Value in the cell clicked :"+  "" +table.getValueAt(row,col).toString());
}
}
);
}
            public class myTableModel extends DefaultTableModel
                                                                                    {
                                                    myTableModel( )
                                                 {
                                                   super(dataValues,columnNames);
                                                   System.out.println("Inside myTableModel");
                                                 }
                                    public boolean isCellEditable(int row,int cols)
                                     {
                                   return false;                                                                                         
                                    }
                                    }         
            public static void main(String args[])
            {
            PokTab mainFrame=new PokTab();
            mainFrame.setVisible(true);
            }         
                        




public static void SimpleTableTest2() {
	// TODO Auto-generated method stub
	
	//PokTab aaaa=new PokTab();
	PokTab aaaa=new PokTab();
	aaaa.setVisible(true);
}
}
