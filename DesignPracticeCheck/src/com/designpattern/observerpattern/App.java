package com.designpattern.observerpattern;

public class App {

	public static void main(String[] args) {
		INotificationService service = new NotificationService();

		INotificationObserver steve = new SteveObserver();
		INotificationObserver john = new JohnObserver();

		// adding Subscriber
		service.addSubscriber(steve);
		service.addSubscriber(john);

		//notifying Subscriber
		service.notifySubscriber();

		// removing one Subscriber
		service.removeSubscriber(john);
	}

}
