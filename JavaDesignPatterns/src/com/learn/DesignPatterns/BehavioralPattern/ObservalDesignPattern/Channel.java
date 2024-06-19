package com.learn.DesignPatterns.BehavioralPattern.ObservalDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	
	
	private String title;

	List<Subscriber> subscribers = new ArrayList<Subscriber>();
	
	@Override
	//argument can be observer too
	public void Subscribe(Subscriber sub)
	{
		subscribers.add(sub);
	}
	
	//register, unregister and notify
	@Override
	public void unsubscribe(Observer sub)
	{
		subscribers.remove(sub);
	}
	
	
	//notify all subscriber
	@Override
	public void notifySubscriber()
	{
		for(Observer sub:subscribers)
		{
			sub.update();
		}
	}
	
	@Override
	public void upload(String title)
	{
		this.title = title;
		notifySubscriber();
	}

	

	//getter setter for title
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
