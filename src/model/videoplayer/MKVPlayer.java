package model.videoplayer;

public class MKVPlayer implements VideoPlayer{

    @Override
    public void playMKV(String filename) {
        System.out.println(String.format("Video Player MKV Playing %s", filename));
    }

    @Override
    public void playMP4(String filename) {
    }

}
