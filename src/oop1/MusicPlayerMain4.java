package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        // 기능 안에 어떤게 있는지 몰라도 상관없음
        player.on();
        player.volumeUp();
        player.volumeDown();
        player.showStatus();
        player.off();
    }
}
