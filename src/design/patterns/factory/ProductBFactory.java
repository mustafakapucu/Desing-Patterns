package design.patterns.factory;

public class ProductBFactory implements Factory {

	@Override
	public Product create() {
		ProductB productB = new ProductB(2, "Product-B-2");
		return productB;
	}

}
