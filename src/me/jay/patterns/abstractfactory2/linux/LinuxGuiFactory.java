package me.jay.patterns.abstractfactory2.linux;

import me.jay.patterns.abstractfactory2.abst.Button;
import me.jay.patterns.abstractfactory2.abst.GuiFactory;
import me.jay.patterns.abstractfactory2.abst.TextArea;

public class LinuxGuiFactory implements GuiFactory {

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
