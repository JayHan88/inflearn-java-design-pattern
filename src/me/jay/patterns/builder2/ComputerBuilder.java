package me.jay.patterns.builder2;

public class ComputerBuilder {

	private Computer computer;

	private ComputerBuilder() {
		computer = new Computer("default", "default", "default");
	}

	public static ComputerBuilder start() {
		return new ComputerBuilder();
	}

	public static ComputerBuilder startWtihCpu(String cpu) {
		ComputerBuilder builder = new ComputerBuilder();
		builder.computer.setCpu(cpu);
		return builder;
	}

	public ComputerBuilder setCpu(String s) {
		computer.setCpu(s);
		return this;
	}

	public ComputerBuilder setRam(String s) {
		computer.setRam(s);
		return this;
	}

	public ComputerBuilder setStorage(String s) {
		computer.setStorage(s);
		return this;
	}

	public Computer build() {
		return this.computer;
	}

}
