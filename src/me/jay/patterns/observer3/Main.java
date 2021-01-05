package me.jay.patterns.observer3;

import me.jay.patterns.observer3.Observable.Observer;

public class Main {

	public static void main(String[] args) {
		// 1. generic
		// 2. delegate
		// 3. 내부에 observer 놓기

		Button button = new Button();
		button.addObserver(new Observer<String>() {
			@Override
			public void update(Observable<String> o, String arg) {
				System.out.println(o + " is clicked.");
			}
		});

		button.onClick();
		button.onClick();
		button.onClick();
	}

}
