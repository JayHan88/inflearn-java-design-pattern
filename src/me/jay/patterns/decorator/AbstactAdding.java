package me.jay.patterns.decorator;

abstract public class AbstactAdding implements Beverage {
	// Role : Decorator
	// 컴포넌트와 장식을 동일시 해주는 역할입니다.

	private Beverage base;

	public AbstactAdding(Beverage base) {
		this.base = base;
	}

	@Override
	public int getTotalPrice() {
		return base.getTotalPrice();
	}

	protected Beverage getBase() {
		return base;
	}
}
