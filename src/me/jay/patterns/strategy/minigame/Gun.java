package me.jay.patterns.strategy.minigame;

public class Gun implements Weapon {

	@Override
	public void attack() {
		System.out.println("총 공격");
	}
}
