package OOPInterfaces;

public class Main {

    public static void main(String[] args) {
        MusicPlayer mPlayer = new MusicPlayer();
        Playable vPlayer = new VideoPlayer();

        MediaController mediaCnt = new MediaController();

        mediaCnt.playMedia(mPlayer);
        mediaCnt.playMedia(vPlayer);
    }
}
