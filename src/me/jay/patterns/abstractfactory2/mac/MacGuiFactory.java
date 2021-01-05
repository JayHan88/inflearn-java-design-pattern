package me.jay.patterns.abstractfactory2.mac;

import me.jay.patterns.abstractfactory2.abst.Button;
import me.jay.patterns.abstractfactory2.abst.GuiFactory;
import me.jay.patterns.abstractfactory2.abst.TextArea;

public class MacGuiFactory implements GuiFactory {

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public TextArea createTextArea() {
		return new MacTextArea();
	}
}
