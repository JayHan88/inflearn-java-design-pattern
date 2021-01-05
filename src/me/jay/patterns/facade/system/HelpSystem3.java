package me.jay.patterns.facade.system;

class HelpSystem3 {

	public HelpSystem3() {
		System.out.println("Call Consturctor : " + getClass().getSimpleName());
	}

	public void process() {
		System.out.println("Call Process : " + getClass().getSimpleName());
	}
}
