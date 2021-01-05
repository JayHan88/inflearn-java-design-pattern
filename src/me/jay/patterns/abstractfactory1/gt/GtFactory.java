package me.jay.patterns.abstractfactory1.gt;

import me.jay.patterns.abstractfactory1.abst.BikeFactory;
import me.jay.patterns.abstractfactory1.abst.Body;
import me.jay.patterns.abstractfactory1.abst.Wheel;

public class GtFactory implements BikeFactory {

	@Override
	public Body createBody() {
		return new GtBody();
	}

	@Override
	public Wheel createWheel() {
		return new GtWheel();
	}
}
