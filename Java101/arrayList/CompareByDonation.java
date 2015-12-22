package arrayList;

import java.util.Comparator;

public class CompareByDonation implements Comparator<Donor> {

	@Override
	public int compare(Donor donor1, Donor donor2) {
		
		return donor2.contriubution - donor1.contriubution;
	}

}
