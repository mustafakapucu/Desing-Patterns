package design.patterns.facade;

public class KargoSirketi {
	private int Id;
	private String Ad;
	private String Iletisim;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getAd() {
		return Ad;
	}

	public void setAd(String ad) {
		Ad = ad;
	}

	public String getIletisim() {
		return Iletisim;
	}

	public void setIletisim(String iletisim) {
		Iletisim = iletisim;
	}

}