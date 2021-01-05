package me.jay.patterns.abstractfactory2.linux;

import me.jay.patterns.abstractfactory2.abst.TextArea;

public class LinuxTextArea implements TextArea {

	@Override
	public String getText() {
		return "linux text area";
	}
}
