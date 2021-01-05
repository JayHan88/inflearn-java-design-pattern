package me.jay.patterns.chain1;

public class PlusCalculator extends Calculator {

	@Override
	protected boolean operator(Request request) {
		if (request.getOperator().equals("+")) {
			int a = request.getA();
			int b = request.getB();
			int result = a + b;
			System.out.println(request.getA() + "+" + request.getB() + "=" + result);
		}
		return false;
	}
}
