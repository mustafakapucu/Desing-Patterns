package design.patterns.strategy;

public class Uretici {
	public Uretici() {
		SeriUret seriUret = new SeriUret();
		seriUret.Uret();

		SiparisUzerineUret siparisUzerineUret = new SiparisUzerineUret();
		siparisUzerineUret.Uret();
	}
}
