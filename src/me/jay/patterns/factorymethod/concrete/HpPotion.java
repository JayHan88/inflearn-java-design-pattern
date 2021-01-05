package me.jay.patterns.factorymethod.concrete;

import me.jay.patterns.factorymethod.framework.Item;

public class HpPotion implements Item {

	@Override
	public void use() {
		System.out.println("체력 회복!");
	}
}
