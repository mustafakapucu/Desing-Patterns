package design.patterns.factory;

public class ProductA implements Product {

	private int id;
	private String name;

	public ProductA(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public void doThis() {
		System.out.println("do() in ProductA");
	}

}
