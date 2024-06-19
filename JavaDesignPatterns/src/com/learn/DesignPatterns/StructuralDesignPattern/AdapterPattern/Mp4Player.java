package com.learn.DesignPatterns.StructuralDesignPattern.AdapterPattern;

public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		//Does nothing
		//THis is a mp4 player
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		
		System.out.println("Playing mp4 filename: "+fileName);
	}
	
	

}
