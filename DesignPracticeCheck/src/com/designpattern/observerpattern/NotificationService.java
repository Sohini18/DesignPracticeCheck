package com.designpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {

	List<INotificationObserver> observers;

	public NotificationService() {
		observers = new ArrayList<INotificationObserver>();
	}

	@Override
	public void addSubscriber(INotificationObserver observer) {
		observers.add(observer);
		System.out.println("List of Subscriber after Modification");
		observers.forEach(System.out::println);

	}

	@Override
	public void removeSubscriber(INotificationObserver observer) {
		observers.remove(observer);
		System.out.println("List of Subscriber after Modification");
		observers.forEach(System.out::println);

	}

	@Override
	public void notifySubscriber() {
		for (INotificationObserver observer : observers)
			observer.onServerDown();
	}

}
