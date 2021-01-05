package me.jay.patterns.observer3;

import me.jay.patterns.observer3.Observable.Observer;

public class Button {

	public Button() {
		observable = new Observable<String>();
	}

	private Observable<String> observable;

	public void addObserver(Observer<String> o) {
		observable.addObserver(o);
	}

	public void notifyObservers() {
		observable.setChanged();
		observable.notifyObservers(null);
	}


	public void onClick() {
		notifyObservers();
	}
}
