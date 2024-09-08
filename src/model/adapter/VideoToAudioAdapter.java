package model.adapter;

import model.videoplayer.MKVPlayer;
import model.videoplayer.MP4Player;
import model.videoplayer.VideoPlayer;
import model.audioplayer.AudioPlayer;

public class VideoToAudioAdapter implements AudioPlayer {
    VideoPlayer videoPlayer;

    public VideoToAudioAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("mp4")) {
            videoPlayer = new MP4Player(); // Adapta MP4 para áudio
        } else if (audioType.equalsIgnoreCase("mkv")) {
            videoPlayer = new MKVPlayer(); // Adapta MKV para áudio
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("mp4")) {
            videoPlayer.playMP4(filename); // Reproduz áudio de MP4
        } else if(audioType.equalsIgnoreCase("mkv")) {
            videoPlayer.playMKV(filename); // Reproduz áudio de MKV
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
