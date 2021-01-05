package me.jay.patterns.bridge;

public class Main {

	public static void main(String[] args) {
		PrintMorseCode code = new PrintMorseCode(new FlashMorseCodeFunction());
		code.g().a().r().a().m();
	}

}
