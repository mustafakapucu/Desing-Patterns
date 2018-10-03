package design.patterns.factory;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client(new ProductAFactory(), new ProductAFactory());
		client.start();
	}

}
