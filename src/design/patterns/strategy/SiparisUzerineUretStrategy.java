package design.patterns.strategy;

public class SiparisUzerineUretStrategy extends Strategy {

	@Override
	public Peugeot Uret() {
		// TODO Auto-generated method stub
		return new Peugeot("sipariş üzerine");
	}

}
