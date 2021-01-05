package me.jay.patterns.factorymethod.concrete;

import java.util.Date;
import me.jay.patterns.factorymethod.framework.Item;
import me.jay.patterns.factorymethod.framework.ItemCreator;

public class MpPotionCreator extends ItemCreator {

	@Override
	protected void requestItemInfo() {
		System.out.println("데이터베이스에서 MP 회복 물약 정보를 가져옵니다.");
	}

	@Override
	protected Item createItem() {
		return new MpPotion();
	}

	@Override
	protected void createItemLog() {
		System.out.println("MP 회복 물약을 생성했습니다. " + new Date());
	}
}
