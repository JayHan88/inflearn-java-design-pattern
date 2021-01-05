package me.jay.patterns.observer1;

import me.jay.patterns.observer1.Button.OnClickListener;

public class Main {

	public static void main(String[] args) {
		Button button = new Button();
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(Button button) {
				System.out.println(button + " is clicked.");
			}
		});
		button.onClick();
	}

}
