import java.util.Comparator;

public class AccountOwnerAscComparator implements Comparator<Account>{

	@Override
	public int compare(Account o1, Account o2) {
		return o1.getOwner().compareTo(o2.getOwner());
	}

}
