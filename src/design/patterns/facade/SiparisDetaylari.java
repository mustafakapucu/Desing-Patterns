package design.patterns.facade;

import java.util.List;

public class SiparisDetaylari {
	public void SiparisDetaylariniEkle(int siparisId, List<SepettekiUrun> urunler) {
		System.out.println(siparisId + " numaralı siparişte alınan ürünler:");
		System.out.println("...............................");

		int toplam = 0;

		for (SepettekiUrun sepettekiUrun : urunler) {
			System.out.println(sepettekiUrun.getUrunAdi() + " ürününden " + sepettekiUrun.getAdet()
					+ " adet alındı. Ara toplam: " + sepettekiUrun.getAdet() * sepettekiUrun.getFiyat());
			toplam += sepettekiUrun.getFiyat() * sepettekiUrun.getAdet();
		}

		System.out.println("...............................");
		System.out.println("Toplam: " + toplam);
	}
}
