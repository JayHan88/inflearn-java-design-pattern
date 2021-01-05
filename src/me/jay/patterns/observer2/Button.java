package me.jay.patterns.observer2;

import java.util.Observable;

public class Button extends Observable {

	public void onClick() {
		setChanged();
		notifyObservers();
	}

}
