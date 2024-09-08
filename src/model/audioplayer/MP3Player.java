package model.audioplayer;

public class MP3Player implements AudioPlayer {
    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + filename);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
