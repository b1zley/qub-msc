package sustain;

import java.util.Comparator;

public class PlayerBalanceComparatorDesc implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		
		if(o1.getBalance() > o2.getBalance()) {
			return -1;
		} else if(o1.getBalance() < o2.getBalance()) {
			return 1;
		} else {
			return 0;
		}
		
	}

}
