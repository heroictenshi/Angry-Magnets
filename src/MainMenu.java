import javax.swing.*;
import java.awt.*;

/**
 * Created by Jeffry Lien on 12/05/2014.
 */
public class MainMenu extends JPanel
{
    GroupLayout group = new GroupLayout(this);
  
    ImageIcon newGameIcon = new ImageIcon("2cake.png");
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
        setLayout(group);
        group.setHonorsVisibility(true);
        group.setAutoCreateGaps(true);
        group.setAutoCreateContainerGaps(true);
        instructions = new JButton();
        newGame = new JButton(newGameIcon);
        quitGame = new JButton();
        highScores = new JButton();
        help = new JButton();

        addToPanel();
    }

    public void addToPanel()
    {
      group.setVerticalGroup (group.createSequentialGroup()
                                .addComponent (newGame)
                                .addComponent (instructions)
                                .addComponent (highScores)
                                .addComponent (help)
                                .addComponent (quitGame));
      group.setHorizontalGroup (group.createParallelGroup ()
                                .addComponent (newGame)
                                .addComponent (instructions)
                                .addComponent (highScores)
                                .addComponent (help)
                                .addComponent (quitGame));
    }
}
