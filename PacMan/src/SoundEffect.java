import javafx.animation.Animation;


import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.applet.AudioClip;
import java.io.File;
import java.io.IOException;
import java.rmi.server.ExportException;

public class SoundEffect implements  Sound {

    private AudioClip clip;
    public void play() {


        clip.play();
    }

    @Override
    public void loop() {
        clip.loop();

    }

    @Override
    public void stop() {
        clip.stop();
    }

    static void PlaySound(File Sound) {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();

            Thread.sleep(5000);


        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) throws Exception {
            File Clap = new File("pacman_beginning.wav");
            File Clap2 = new File("pacman_chomp.wav");
            File Clap3 = new File("pacman_death.wav");
            File Clap4 = new File("pacman_eatfruit.wav");
            File Clap5 = new File("pacman_eatghost.wav");
            File Clap6 = new File("pacman_extrapac.wav");
            File Clap7 = new File("pacman_intermission.wav");
            PlaySound(Clap2);



    }
}

