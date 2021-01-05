package me.jay.patterns.abstractfactory2.mac;

import me.jay.patterns.abstractfactory2.abst.Button;

public class MacButton implements Button {

	@Override
	public void click() {
		System.out.println("mac button click");
	}
}
