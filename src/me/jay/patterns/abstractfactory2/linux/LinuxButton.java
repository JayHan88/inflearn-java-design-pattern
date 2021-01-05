package me.jay.patterns.abstractfactory2.linux;

import me.jay.patterns.abstractfactory2.abst.Button;

public class LinuxButton implements Button {

	@Override
	public void click() {
		System.out.println("linux button click");
	}
}
