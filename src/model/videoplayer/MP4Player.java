package model.videoplayer;

public class MP4Player implements VideoPlayer{

    @Override
    public void playMKV(String filename) {
        return;
    }

    @Override
    public void playMP4(String filename) {
        System.out.println(String.format("Video Player MP4 Playing %s", filename));
    }

}
