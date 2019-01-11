package design.patterns.facade;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		SiparisFacade siparisFacade = new SiparisFacade();
		List<SepettekiUrun> urunler = new ArrayList<SepettekiUrun>();

		SepettekiUrun urun1 = new SepettekiUrun();
		urun1.setAdet(5);
		urun1.setFiyat(2);
		urun1.setUrunAdi("Ürün1");
		urun1.setId(1);

		SepettekiUrun urun2 = new SepettekiUrun();
		urun2.setAdet(5);
		urun2.setFiyat(2);
		urun2.setUrunAdi("Ürün2");
		urun2.setId(1);

		SepettekiUrun urun3 = new SepettekiUrun();
		urun3.setAdet(5);
		urun3.setFiyat(2);
		urun3.setUrunAdi("Ürün3");
		urun3.setId(1);

		urunler.add(urun1);
		urunler.add(urun2);
		urunler.add(urun3);

		siparisFacade.SiparisVer("Test User", "Test Kargo", urunler);
		System.out.println();
	}

}
