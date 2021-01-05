package me.jay.patterns.abstractfactory1;

import me.jay.patterns.abstractfactory1.abst.BikeFactory;
import me.jay.patterns.abstractfactory1.abst.Body;
import me.jay.patterns.abstractfactory1.abst.Wheel;
import me.jay.patterns.abstractfactory1.gt.GtFactory;
import me.jay.patterns.abstractfactory1.sam.SamFactory;

public class Main {

	public static void main(String[] args) {
		BikeFactory factory = new SamFactory();
		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();

		System.out.println(body.getClass());
		System.out.println(wheel.getClass());
	}

}
