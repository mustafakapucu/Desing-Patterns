package design.patterns.factory;

public class ProductAFactory implements Factory {

	@Override
	public Product create() {
		ProductA productA = new ProductA(1, "Product-A-1");
		return productA;
	}

}
