package me.jay.patterns.adapter;

public class Main {

	public static void main(String[] args) {

		Adapter adapter = new AdapterImpl();

		System.out.println(adapter.twiceOf(100.0F));
		System.out.println(adapter.halfOf(80.0F));
		System.out.println(adapter.halfOf(40.0F));

	}

}
