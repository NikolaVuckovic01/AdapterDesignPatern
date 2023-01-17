package Klase;
import interfejsi.*;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc media file");
    }
    @Override
    public void playMp4(String fileName) {

    }
}
