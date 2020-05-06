package com.designpattern.observerpattern;

public class SteveObserver implements INotificationObserver {

	private final String name = "Steve";

	@Override
	public void onServerDown() {
		System.out.println("Hello " + name + " Notification received");
	}

	@Override
	public String toString() {
		return "INotificationObserver [name=" + name + "]";
	}

}
