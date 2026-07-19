package com.access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();


        speaker.volumeUp(); // 볼륨 증가 더이상 안됨!
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeDown();
        speaker.showVolume();

        //필드에 직접 접근
        System.out.println("볼륨 필드에 직접 접근해서 수정");
        // speaker.getVolume()=200;
        speaker.showVolume();
    }
}
