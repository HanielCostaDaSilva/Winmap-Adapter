package model;
import model.adapter.VideoToAudioAdapter;
import model.audioplayer.AudioPlayer;
import model.audioplayer.MP3Player;

public class Winamp {
    private AudioPlayer audioPlayer;

    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("mp3")) {
            audioPlayer = new MP3Player();
        } else if(audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("mkv")) {
            audioPlayer = new VideoToAudioAdapter(audioType); 
        } else {
            System.out.println("Formato não suportado: " + audioType);
            return;
        }

        audioPlayer.play(audioType, filename);
    }
}
