package leTour;

import java.util.Comparator;

public class CompareTime implements Comparator<Rider> {

	@Override
	public int compare(Rider o1, Rider o2) {
		// TODO Auto-generated method stub
		return o1.getResult().compareTo(o2.getResult());
	}

}
