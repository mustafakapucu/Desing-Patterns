package design.patterns.strategy;

public class OzelYapimUretStrategy extends Strategy {

	@Override
	public Peugeot Uret() {
		// TODO Auto-generated method stub
		return new Peugeot("özel yapım");
	}

}
