package me.jay.patterns.decorator;

public class Espresso extends AbstactAdding {
	// Role : Concrete Decorator
	// 실질적인 장식 인스턴스 및 정의이며, 책임이 추가되는 부분입니다.

	static protected int espressoCount = 0;

	public Espresso(Beverage base) {
		super(base);
	}

	@Override
	public int getTotalPrice() {
		return super.getTotalPrice() + getAddPrice();
	}

	private int getAddPrice() {
		espressoCount += 1;
		int addPrice = 100;

		if (espressoCount > 1) {
			addPrice = 70;
		}
		return addPrice;
	}

}
