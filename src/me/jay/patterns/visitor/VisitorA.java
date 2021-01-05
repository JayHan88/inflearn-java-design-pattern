package me.jay.patterns.visitor;

public class VisitorA implements Visitor {

	private int ageSum;

	public VisitorA() {
		ageSum = 0;
	}

	@Override
	public void visit(Visitable visitable) {
		if (visitable instanceof VisitableA) {
			ageSum += ((VisitableA) visitable).getAge();
		}
	}

	public int getAgeSum() {
		return ageSum;
	}
}
