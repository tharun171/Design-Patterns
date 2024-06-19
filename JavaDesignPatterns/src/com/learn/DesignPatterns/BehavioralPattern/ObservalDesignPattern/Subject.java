package com.learn.DesignPatterns.BehavioralPattern.ObservalDesignPattern;

public interface Subject {

	void Subscribe(Subscriber sub);

	//register, unregister and notify
	void unsubscribe(Observer sub);

	//notify all subscriber
	void notifySubscriber();

	void upload(String title);

}