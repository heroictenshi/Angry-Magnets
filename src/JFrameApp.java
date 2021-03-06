
import javax.swing.*;

/**
 * The "JFrameApp" class. (WIP) At the moment, creates a new instance of the main
 * menu ("MainMenu" class) and adds it to a new JFrame, may be changed in functionality later.
 * 
 * @author Jeffry Lien
 */
public class JFrameApp extends JFrame
{
    public JFrameApp()
    {
        super("Angry Magnets!");

        MainMenu menu = new MainMenu();

        add (menu);
        setSize(800,600);
        setVisible(true);
        setResizable (false);
        setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main (String [] args)
    {
        new JFrameApp();
    }
}
