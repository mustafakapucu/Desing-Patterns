package design.patterns.abstractfactory;

public interface GUIFactory {
	public Component createButton();

	public Component createList();

	public Component createTable();
}
