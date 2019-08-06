package oknaaa;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ExpandingPanel extends JPanel
{
    private JPanel expanding;

    public ExpandingPanel(String text, Color color)
    {
        setLayout( new BorderLayout() );

        JButton button = new JButton( text );
        add(button, BorderLayout.NORTH);

        expanding = new JPanel();
        expanding.setBackground( color );
        expanding.setVisible( false );
        add(expanding, BorderLayout.CENTER);

        button.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                expanding.setVisible( !expanding.isVisible() );

                Container parent = ExpandingPanel.this.getParent();
                LayoutManager2 layout = (LayoutManager2)parent.getLayout();

                if (expanding.isVisible())
                    layout.addLayoutComponent(ExpandingPanel.this, new Float(1));
                else
                    layout.addLayoutComponent(ExpandingPanel.this, null);

                revalidate();
                repaint();
            }
        });
    }

    private static void createAndShowGUI()
    {
        RelativeLayout rl = new RelativeLayout(RelativeLayout.Y_AXIS);
        rl.setFill( true );

        JPanel content = new JPanel( rl );
        content.add( new ExpandingPanel("Red", Color.RED) );
        content.add( new ExpandingPanel("Blue", Color.BLUE) );
        content.add( new ExpandingPanel("Green", Color.GREEN) );

        JFrame frame = new JFrame("Expanding Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add( content);
        frame.setLocationByPlatform( true );
        frame.setSize(200, 300);
        frame.setVisible( true );
    }

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowGUI();
            }
        });
    }
}