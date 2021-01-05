package me.jay.patterns.decorator;

public class Milk extends AbstactAdding {
	// Role : Concrete Decorator
	// 실질적인 장식 인스턴스 및 정의이며, 책임이 추가되는 부분입니다.

	public Milk(Beverage base) {
		super(base);
	}

	@Override
	public int getTotalPrice() {
		return super.getTotalPrice() + 50;
	}

}
