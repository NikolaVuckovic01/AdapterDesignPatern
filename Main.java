package Klase;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","Song 1");
        audioPlayer.play("mp4","Song 2");
        audioPlayer.play("vlc","Song 3");
        audioPlayer.play("avi","Song 4");
    }
}
