package com.learn.DesignPatterns.BehavioralPattern.ObservalDesignPattern;

public class Subscriber implements Observer {
	
	private String name;
	private Channel channel = new Channel();
	//assume one subscriber to one channel
	
	@Override
	public void update()
	{
		System.out.println("hey "+name+", video uploaded -> "+channel.getTitle());
	}
	
	@Override
	public void subsribeChannel(Channel ch)
	{
		channel = ch;
	}
	
	public Subscriber(String name)
	{
		this.name = name;
	}

}
