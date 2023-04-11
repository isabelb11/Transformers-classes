package basics;

import java.sql.Date;
import java.util.Collection;
import java.util.List;

public class CreditAccount extends BankAccount implements AccountFunctions{

	@Override
	public boolean deposit(double amount) {

		return false;
		
	}
	
	@Override
	public List<String> getHistory(Date start, Date end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String auditTransactions(Collection<String> inputs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printStatement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validateUserPass() {
		// TODO Auto-generated method stub
		
	}
}
		


