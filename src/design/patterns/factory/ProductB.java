package design.patterns.factory;

public class ProductB implements Product {

	private int no;
	private String description;

	public ProductB(int no, String description) {
		this.no = no;
		this.description = description;
	}

	@Override
	public void doThis() {
		System.out.println("do() in ProductB");
	}

}
