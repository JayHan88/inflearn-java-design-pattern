package me.jay.patterns.facade.system;

class HelpSystem2 {

	public HelpSystem2() {
		System.out.println("Call Consturctor : " + getClass().getSimpleName());
	}

	public void process() {
		System.out.println("Call Process : " + getClass().getSimpleName());
	}
}
