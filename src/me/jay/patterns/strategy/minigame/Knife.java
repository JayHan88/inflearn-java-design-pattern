package me.jay.patterns.strategy.minigame;

public class Knife implements Weapon {

	@Override
	public void attack() {
		System.out.println("칼 공격");
	}
}
