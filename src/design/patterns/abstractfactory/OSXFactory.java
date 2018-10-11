package design.patterns.abstractfactory;

import java.awt.List;

public class OSXFactory implements GUIFactory {

	public Component createButton() {
		return (Component) new OSXButton();
	}

	@Override
	public Component createList() {
		return null;
	}

	@Override
	public Component createTable() {
		return null;
	}
}
