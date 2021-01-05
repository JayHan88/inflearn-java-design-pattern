package me.jay.patterns.abstractfactory2.mac;

import me.jay.patterns.abstractfactory2.abst.TextArea;

public class MacTextArea implements TextArea {

	@Override
	public String getText() {
		return "mac text area";
	}
}
