package arrayList;

import java.util.Comparator;

public class CompareByName implements Comparator<Donor>{

	@Override
	public int compare(Donor donor1, Donor donor2) {
		String myFirstName = donor1.getFirstName().toLowerCase();
		String donorFirstName = donor2.getFirstName().toLowerCase();
		return myFirstName.compareTo(donorFirstName);
	}

}
