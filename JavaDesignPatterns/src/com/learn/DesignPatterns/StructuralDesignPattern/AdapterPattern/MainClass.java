package com.learn.DesignPatterns.StructuralDesignPattern.AdapterPattern;

public class MainClass {

	public static void main(String[] args) {
		
		//we have 2 interfaces, with diff methods
		//interface 1 - MediaPlayer
		//interface 2 - AdvancedMediaPLayer
		
		AudioPlayer audioPlayer = new AudioPlayer();

		
		//This is a form of mediaplayer interface
		//we converted the another interface methods to have the first interface pattern
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
	}

}
