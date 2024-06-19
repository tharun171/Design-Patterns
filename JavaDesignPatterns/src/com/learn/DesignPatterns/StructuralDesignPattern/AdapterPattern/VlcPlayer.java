package com.learn.DesignPatterns.StructuralDesignPattern.AdapterPattern;

public class VlcPlayer implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		System.out.println("playing vlc filename: "+fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		//Does Nothing
		//This is vlcPlayer
	}

}
