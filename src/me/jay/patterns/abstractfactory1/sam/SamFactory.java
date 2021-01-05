package me.jay.patterns.abstractfactory1.sam;

import me.jay.patterns.abstractfactory1.abst.BikeFactory;
import me.jay.patterns.abstractfactory1.abst.Body;
import me.jay.patterns.abstractfactory1.abst.Wheel;

public class SamFactory implements BikeFactory {

	@Override
	public Body createBody() {
		return new SamBody();
	}

	@Override
	public Wheel createWheel() {
		return new SamWheel();
	}
}
