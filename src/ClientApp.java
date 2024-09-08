import model.Winamp;

public class ClientApp {
    public static void main(String[] args) {

        Winamp winamp = new Winamp();

        // Reproduz um arquivo MP3
        winamp.play("mp3", "song.mp3");

        // Reproduz o áudio de um arquivo MP4
        winamp.play("mp4", "movie.mp4");

        // Reproduz o áudio de um arquivo MKV
        winamp.play("mkv", "video.mkv");
    }
}