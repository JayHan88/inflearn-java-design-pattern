package me.jay.patterns.factorymethod.concrete;

import me.jay.patterns.factorymethod.framework.Item;
import me.jay.patterns.factorymethod.framework.ItemCreator;

public class Main {

	public static void main(String[] args) {
		ItemCreator creator1 = new HpPotionCreator();
		Item item1 = creator1.create();
		item1.use();

		ItemCreator creator2 = new MpPotionCreator();
		Item item2 = creator2.create();
		item2.use();
	}

}
