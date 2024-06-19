package com.learn.DesignPatterns.StructuralDesignPattern.AdapterPattern;

public class AudioPlayer implements MediaPlayer{

	private MediaAdapter mediaAdapter;
	
	
	@Override
	public void play(String audioType, String fileName) {
		
		//inbuilt support for mp3 files
		//we dont have this in AdvancedMediaPlayer
		if(audioType.equalsIgnoreCase("mp3"))
		{
			System.out.println("playing mp3 file - fileName: "+fileName);
		}
		else if(
				audioType.equalsIgnoreCase("vlc") ||
				audioType.equalsIgnoreCase("mp4"))
		{
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}
		else 
		{
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
	}

}
