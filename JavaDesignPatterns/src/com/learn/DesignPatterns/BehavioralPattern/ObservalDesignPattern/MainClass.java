package com.learn.DesignPatterns.BehavioralPattern.ObservalDesignPattern;

public class MainClass {

	public static void main(String[] args) {
		
		Channel telusko = new Channel();
		
		
		Subscriber s1 = new Subscriber("subone");
		Subscriber s2 = new Subscriber("subtwo");
		Subscriber s3 = new Subscriber("subthree");
		Subscriber s4 = new Subscriber("subfour");
		Subscriber s5 = new Subscriber("subfive");
		
		
		telusko.Subscribe(s1);
		telusko.Subscribe(s2);
		telusko.Subscribe(s3);
		telusko.Subscribe(s4);
		telusko.Subscribe(s5);
		
		telusko.unsubscribe(s3);
		
		s1.subsribeChannel(telusko);
		s2.subsribeChannel(telusko);
		s3.subsribeChannel(telusko);
		s4.subsribeChannel(telusko);
		s5.subsribeChannel(telusko);
		
		telusko.upload("new video 1");
		
		
		
		

		
	}

}
