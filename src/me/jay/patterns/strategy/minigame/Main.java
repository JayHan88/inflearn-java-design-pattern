package me.jay.patterns.strategy.minigame;

public class Main {

	public static void main(String[] args) {
		Character character = new Character();

		character.setWeapon(new Knife());
		character.attack();

		character.setWeapon(new Gun());
		character.attack();
	}

}
