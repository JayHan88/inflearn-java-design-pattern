package me.jay.patterns.decorator;

public class Base implements Beverage {
	// Role : Concrete Component
	// 컴포넌트의 실질적인 인스턴스 부분이며, 책임의 주체입니다.

	@Override
	public int getTotalPrice() {
		return 0;
	}
}
