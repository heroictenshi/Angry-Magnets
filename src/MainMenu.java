import javax.swing.*;
import java.awt.*;

/**
 * Created by Jeffry Lien on 12/05/2014.
 */
public class MainMenu extends JPanel
{
    FlowLayout gridbag = new FlowLayout();
    GridBagConstraints constraints = new GridBagConstraints();

    ImageIcon newGameIcon = new ImageIcon();
    ImageIcon quitGameIcon = new ImageIcon();
    ImageIcon highScoresIcon = new ImageIcon();
    ImageIcon instructionsIcon = new ImageIcon();
    ImageIcon helpIcon = new ImageIcon();

    JButton newGame;
    JButton quitGame;
    JButton highScores;
    JButton instructions;

    JButton help;


    public MainMenu ()
    {
        setLayout(gridbag);
        constraints.gridx = 1;
        constraints.gridy = 5;

        instructions = new JButton();
        newGame = new JButton("Cake");
        quitGame = new JButton();
        highScores = new JButton();
        help = new JButton();

        addToPanel();
    }

    public void addToPanel()
    {
        add (newGame);
        add (instructions);
        add(highScores);
        add (help);
        add (quitGame);
    }
}
