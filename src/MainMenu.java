import javax.swing.*;
import java.awt.*;

/**
 * The "MainMenu" class, creates the main menu of the program contained in
 * a JPanel.
 * 
 * @author Jeffry Lien
 */
public class MainMenu extends JPanel
{
  /**
   * group - Layout manager of the Main Menu.
   */
    GroupLayout group = new GroupLayout(this);

    /**
     * newGameIcon - Picture to be used for the newGame JButton.
     */
    ImageIcon newGameIcon = new ImageIcon("Folder/2cake.jpg");
    
    /**
     * quitGameIcon - Picture to be used for the quitGame JButton.
     */
    ImageIcon quitGameIcon = new ImageIcon();
    
    /**
     * highScoresIcon - Picture to be used for the highScores JButton.
     */
    ImageIcon highScoresIcon = new ImageIcon();
    
    /**
     * instructionsIcon - Picture to be used for the instructions JButton.
     */
    ImageIcon instructionsIcon = new ImageIcon();
    
    /**
     * helpIcon - Picture to be used for the help JButton.
     */
    ImageIcon helpIcon = new ImageIcon();

    /**
     * newGame - (TO BE IMPLEMENTED) Starts a new game.
     */
    JButton newGame;
    
    /**
     * quitGame - (TO BE IMPLEMENTED) Closes the program.
     */
    JButton quitGame;
    
    /**
     * highScres - (TO BE IMPLEMENTED) Displays the game's high scores.
     */
    JButton highScores;
    
    /**
     * instructions - (TO BE IMPLEMENTED) Displays the instructions of the game.
     */
    JButton instructions;
    
    /**
     * help - (TO BE IMPLEMENTED) Opens the help file.
     */
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

    /**
     * Adds the buttons to the panel.
     */
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
