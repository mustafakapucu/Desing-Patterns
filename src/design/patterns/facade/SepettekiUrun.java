package design.patterns.facade;

public class SepettekiUrun {
	private int Id;
	private String UrunAdi;
	private int Adet;
	private float Fiyat;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getUrunAdi() {
		return UrunAdi;
	}

	public void setUrunAdi(String urunAdi) {
		UrunAdi = urunAdi;
	}

	public int getAdet() {
		return Adet;
	}

	public void setAdet(int adet) {
		Adet = adet;
	}

	public float getFiyat() {
		return Fiyat;
	}

	public void setFiyat(float fiyat) {
		Fiyat = fiyat;
	}

}
