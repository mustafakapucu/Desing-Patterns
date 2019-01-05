package design.patterns.strategy;

public class Peugeot {

	public Peugeot(String uretimTipi) {
		System.out.println("Peugeot " + uretimTipi + " üretilmiştir.");
	}

	public String marka;
	public String model;
	public String km;

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getKm() {
		return km;
	}

	public void setKm(String km) {
		this.km = km;
	}

}
