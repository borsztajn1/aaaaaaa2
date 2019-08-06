package oknaaa;
import javax.swing.*;

public class ShowInputDialogExample1
{
  public static void main(String[] args)
  {
	// tworzenie ramki
    JFrame frame = new JFrame("InputDialog");
    
//  ---------------------------------
    // okna dialogowe showInputDialog
    
    // okienko standardowe, domyslna nazwa "Input"
    String dane1 = JOptionPane.showInputDialog(frame, "Podaj dane");
    System.out.println("Podales \n" + dane1);

    // okienko z nazwa i ikona
    String dane2 = JOptionPane.showInputDialog(frame, 
            "Podaj dane", 				// tekst zaproszenia
            "Okienko 1", 				// nazwa okna
         JOptionPane.WARNING_MESSAGE);	// okreslenie rodzaju ikony
    // Cancel oznacza pusty lancuch (null)
    System.out.println("Podales \n" + dane2);
    
    // okienko z lista wyboru tzw. Combobox
    final String[] dzialanie = { "Dodawanie", "Odejmowanie", "Mnozenie", "Dzielenie" };
    String dane3 = (String) JOptionPane.showInputDialog(frame, 
          "Wybierz z listy",			// tekst zaproszenia
          "Okienko z wyborem",			// nazwa okna
          JOptionPane.QUESTION_MESSAGE, // okreslenie rodzaju ikony
          null,		// wskazana ikona np. new ImageIcon("icon1.png") , null - brak
          dzialanie, 					// nazwa tablicy
          dzialanie[0]);				// element domyslny
      System.out.println("Wybrales \n" + dane3);
    
    System.exit(0);
  }
}
