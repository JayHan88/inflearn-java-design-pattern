package me.jay.patterns.abstractfactory2;

import me.jay.patterns.abstractfactory2.abst.Button;
import me.jay.patterns.abstractfactory2.abst.GuiFactory;
import me.jay.patterns.abstractfactory2.abst.TextArea;
import me.jay.patterns.abstractfactory2.concrete.FactoryInstance;

public class Main {

	public static void main(String[] args) throws Exception {
		GuiFactory factory = new FactoryInstance().getGuiFactory();

		Button button = factory.createButton();
		TextArea textArea = factory.createTextArea();

		button.click();
		System.out.println(textArea.getText());

	}

}
