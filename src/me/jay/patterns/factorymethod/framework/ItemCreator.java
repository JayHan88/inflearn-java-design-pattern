package me.jay.patterns.factorymethod.framework;

public abstract class ItemCreator {

	abstract protected void requestItemInfo();

	abstract protected Item createItem();

	abstract protected void createItemLog();

	// factory method -> template method pattern 사용
	public Item create() {
		Item item;

		// step 1
		requestItemInfo();
		// step 2
		item = createItem();
		// step 3
		createItemLog();

		return item;
	}

}
