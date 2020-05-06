package com.designpattern.abstractfactory;

public class MiniCar extends Car {

	public MiniCar(Location location) {
		super(CarType.MICRO, location);
		construct();
	}

	@Override
	void construct() {
		System.out.println("Connecting to Mini Car....");
	}

}
