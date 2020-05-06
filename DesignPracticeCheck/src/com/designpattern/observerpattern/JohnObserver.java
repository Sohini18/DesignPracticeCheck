package com.designpattern.observerpattern;

public class JohnObserver implements INotificationObserver {

	private final String name="John";
	
	@Override
	public void onServerDown() {
		System.out.println("Hello "+name+" Notification received");
	}

	@Override
	public String toString() {
		return "INotificationObserver [name=" + name + "]";
	}
	
}
