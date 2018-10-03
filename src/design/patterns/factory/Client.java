package design.patterns.factory;

public class Client {

	private Product productA;
	private Product productB;

	private Factory productAFactory;
	private Factory productBFactory;

	public Client(Factory productAFactory, Factory productBFactory) {
		productA = productAFactory.create();
		productB = productBFactory.create();
	}

	public void start() {
		productA.doThis();
		productB.doThis();
	}
}
