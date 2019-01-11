package design.patterns.facade;

import java.util.Date;

public class SiparisIslemleri {

	public int SiparisEkle(Date siparisTarihi, Musteri musteri, KargoSirketi kargoSirketi) {
		System.out.println(siparisTarihi.toString() + " tarihinde " + musteri.getAd()
				+ " isimli müşteri siparişi eklendi. Seçilen kargo şirketi: " + kargoSirketi.getAd());
		return 1;
	}
}
