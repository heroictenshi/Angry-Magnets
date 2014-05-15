import java.applet.*;
import javax.swing.*;
import java.io.*;
import java.net.*;

//http://www.dreamincode.net/forums/topic/14083-incredibly-easy-way-to-play-sounds/

public class Audioapp extends JApplet
{
  public class Sound
  {
    private AudioClip song;
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
    
    public void playSound ()
    {
      song.loop();
    }
    
    public void stopSound()
    {
      song.stop();
    }
    
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