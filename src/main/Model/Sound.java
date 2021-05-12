package main.Model;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;

public class Sound {

	public Sound(String filePath) throws InterruptedException {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Test Sound");
		f.setSize(300, 200);
		f.setVisible(false);

		try {
			// Open an audio input stream.
//          File soundFile = new File(pen); 
			URL resource = getClass().getClassLoader().getResource(filePath);
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(resource);
			Clip clip = AudioSystem.getClip();

			clip.open(audioIn);
			clip.start();
			clip.loop(Clip.LOOP_CONTINUOUSLY);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}