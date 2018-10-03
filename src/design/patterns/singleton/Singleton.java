package design.patterns.singleton;

public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			Singleton.getInstance().printThis();
		}
	}

	private static Singleton instance = null;

	private Singleton() {
		System.out.println("Singleton init()");
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public void printThis() {
		System.out.println(this);
	}

}
