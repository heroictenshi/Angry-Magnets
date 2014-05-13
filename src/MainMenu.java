import javax.swing.*;

/**
 * Created by Jeffry Lien on 12/05/2014.
 */
public class MainMenu extends JPanel
{
    GroupLayout group = new GroupLayout(this);
    JButton newGame;
    ImageIcon newGameIcon;
    JButton quitGame;
    ImageIcon quitGameIcon;
    JButton highScores;
    ImageIcon highScoresIcon;
    JButton instructions;
    ImageIcon instructionsIcon;
    JButton help;
    ImageIcon helpIcon;

    public MainMenu ()
    {
        super(group);
        createFrame ();
        newGameIcon =
        newGame = new JButton())
    }


    public void createFrame ()
    {
        JFrame frame = new JFrame("Angry Magnets");
        frame.setSize(800,600);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.add (new MainMenu());
    }

    public static void main (String [] args)
    {
        new MainMenu();
    }
}
