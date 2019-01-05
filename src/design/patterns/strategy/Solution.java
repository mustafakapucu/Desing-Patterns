package design.patterns.strategy;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OzelYapimUretStrategy oyUret = new OzelYapimUretStrategy();
		SeriUretStrategy sUret = new SeriUretStrategy();
		SiparisUzerineUretStrategy suUret = new SiparisUzerineUretStrategy();
		UreticiStrategy uret1 = new UreticiStrategy(oyUret);
		UreticiStrategy uret2 = new UreticiStrategy(sUret);
		UreticiStrategy uret3 = new UreticiStrategy(suUret);
	}

}
