package me.jay.patterns.factorymethod.concrete;

import me.jay.patterns.factorymethod.framework.Item;

public class MpPotion implements Item {

	@Override
	public void use() {
		System.out.println("마력 회복!");
	}
}
