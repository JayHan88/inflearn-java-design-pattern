package me.jay.patterns.chain1;

public class Main {

	public static void main(String[] args) {
		Calculator plus = new PlusCalculator();
		Calculator minus = new MinusCalculator();

		plus.setNextCalculator(minus);

		Request request1 = new Request(1, 2, "+");
		Request request2 = new Request(10, 2, "-");

		plus.process(request1);
		plus.process(request2);

	}

}
