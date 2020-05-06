package com.designpattern.abstractfactory;

public class CarFactory {

	public static Car buildCar(CarType model, Location location) {
		if(location==Location.USA) {
			return new UsaFactory().getCar(model); 
		} else if(location==Location.INDIA){
			return new IndiaFactory().getCar(model);
		}
		return new DefaultFactory().getCar(model);
	}
}
