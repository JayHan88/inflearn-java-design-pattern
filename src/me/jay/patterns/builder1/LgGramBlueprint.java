package me.jay.patterns.builder1;

// Concrete Builder
public class LgGramBlueprint extends BluePrint {

	private Computer computer;

	public LgGramBlueprint() {
		computer = new Computer("default", "default", "defualt");
	}

	@Override
	public void setCpu() {
		computer.setCpu("i7");
	}

	@Override
	public void setRam() {
		computer.setRam("8GB");
	}

	@Override
	public void setStorage() {
		computer.setStorage("256GB SSD");
	}

	@Override
	public Computer getComputer() {
		return computer;
	}


}
