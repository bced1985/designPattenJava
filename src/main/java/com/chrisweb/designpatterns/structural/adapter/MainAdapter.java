package com.chrisweb.designpatterns.structural.adapter;

public class MainAdapter {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "kumama.mp3");
        audioPlayer.play("mp4", "Adorons l'Eternel.mp4");
        audioPlayer.play("vlc", "Nkembo");
        audioPlayer.play("avi", "inconnu.avi");
    }
}
