package arrayList;
import java.util.Comparator;

public class CompareIndDonorsByX implements Comparator<Donor> {

	@Override
	public int compare(Donor donor1, Donor donor2) {
		if(donor1.getContribution()  >= donor2.getContribution())
		return 0;
		return 0;
	}
	
}
