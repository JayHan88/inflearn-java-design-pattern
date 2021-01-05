package me.jay.patterns.builder2;

public class Main {

	public static void main(String[] args) {
		Computer computer1 = ComputerBuilder.start().setCpu("i7").setRam("8GB").build();

		Computer computer2 = ComputerBuilder.startWtihCpu("i7").setRam("8GB").setStorage("256GB SSD").build();

		System.out.println(computer1.toString());

		System.out.println(computer2.toString());

	}

}
