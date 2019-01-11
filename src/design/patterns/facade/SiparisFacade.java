package design.patterns.facade;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SiparisFacade {

	private Musteri musteri;
	private KargoSirketi kargoSirketi;
	private UrunIslemleri urunIslemleri = new UrunIslemleri();
	private SiparisIslemleri siparisIslemleri = new SiparisIslemleri();
	private SiparisDetaylari siparisDetaylari = new SiparisDetaylari();

	public void SiparisVer(String musteriAdi, String secilenKargoSirketi, List<SepettekiUrun> urunler) {
		musteri = new Musteri();
		musteri.setAd(musteriAdi);

		kargoSirketi = new KargoSirketi();
		kargoSirketi.setAd(secilenKargoSirketi);

		Date now = new Date();

		int siparisId = siparisIslemleri.SiparisEkle(now, musteri, kargoSirketi);
		siparisDetaylari.SiparisDetaylariniEkle(siparisId, urunler);

		for (SepettekiUrun sepettekiUrun : urunler) {
			urunIslemleri.StokGuncelle(sepettekiUrun.getId(), sepettekiUrun.getAdet());
		}

		System.out.println();
		System.out.println("İşlem tamamlandı");

	}

}
