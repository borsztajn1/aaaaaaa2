package konst;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;

//http://www.java2s.com/Code/Java/Swing-JFC/UsesreflectiontocreategroupsofdifferenttypesofAbstractButton.htm

public class okno001 {

	public class OknoLoty extends JFrame 
	//public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

public OknoLoty() {
JPanel panelWyszukiwania = stworzPanelWyszukiwania();
add(panelWyszukiwania, BorderLayout.NORTH);
pack();
setVisible(true);
}
private JPanel stworzPanelWys¿ukiwania(){
JPanel panel = new JPanel();
panel.add(new JLabel(""));
return null;
}
	}

}
