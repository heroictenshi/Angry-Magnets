import java.applet.*;
import javax.swing.*;
import java.io.*;
import java.net.*;

/**
 * The "AudioApp" class is able to play sound files such as .wav and .mid files.
 * TO BE IMPLEMENTED (WIP)
 * 
 * @author WolfCoder of dreamincode.net
 */
public class Audioapp extends JApplet
{
  public class Sound
  {
    /**
     * AudioClip - Clip that contains the sound to be played.
     */
    private AudioClip song;
    /**
     * songPath - Location of the sound.
     */
    private URL songPath;
    
    Sound (String filename)
    {
      try
      {
        songPath = new URL(getCodeBase(),filename);
        song = Applet.newAudioClip(songPath);
      }
      catch (Exception e){}
    }
    
    /**
     * Loops the sound that is in the AudioClip.
     */
    public void playSound ()
    {
      song.loop();
    }
    
    /**
     * Stops the sound that is being looped by playSound().
     */
    public void stopSound()
    {
      song.stop();
    }
    
    /**
     * Plays the sound in the AudioClip once.
     */
    public void playSoundOnce()
    {
      song.play();
    }
  }
  
  public void init ()
  {
    Sound testsong = new Sound ("th08_19.mid");
    testsong.playSound();
  }
}