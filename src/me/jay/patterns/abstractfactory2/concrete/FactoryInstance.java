package me.jay.patterns.abstractfactory2.concrete;

import me.jay.patterns.abstractfactory2.abst.Button;
import me.jay.patterns.abstractfactory2.abst.GuiFactory;
import me.jay.patterns.abstractfactory2.abst.TextArea;

public class FactoryInstance {

	public static GuiFactory getGuiFactory() {
		switch (getOsCode()) {
			case 0 : return new MacGuiFactory();
			case 1 : return new LinuxGuiFactory();
		}
		return null;
	}

	private static int getOsCode() {
		if (System.getProperty("os.name").equals("Mac OS X")) {
			return 0;
		}
		return 1;
	}
}

class LinuxGuiFactory implements GuiFactory {

	@Override
	public Button createButton() {
		// native source
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		// native source
		return new LinuxTextArea();
	}
}

class LinuxButton implements Button {

	@Override
	public void click() {
		System.out.println("linux button click");
	}
}

class LinuxTextArea implements TextArea {

	@Override
	public String getText() {
		return "linux text area";
	}
}

class MacGuiFactory implements GuiFactory {

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public TextArea createTextArea() {
		return new MacTextArea();
	}
}

class MacButton implements Button {

	@Override
	public void click() {
		System.out.println("mac button click");
	}
}

class MacTextArea implements TextArea {

	@Override
	public String getText() {
		return "mac text area";
	}
}