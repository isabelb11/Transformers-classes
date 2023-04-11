package basics;

import java.sql.Date;
import java.util.Collection;
import java.util.List;

public class CheckingAccount extends BankAccount4 implements AccountFunctions, MasterCardStandards{

	
	
	@Override
	public boolean deposit(double amount) {
	
		String str = MasterCardStandards.mcCustomerService;
		
		return false;
	}
	
	@Override
	public List<String> getHistory(Date start, Date end) {
		return null;
	}

	@Override
	public String auditTransactions(Collection<String> inputs) {
		return null;
	}

	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return false;
		
	}

	@Override
	public boolean mfa() {
		// TODO Auto-generated method stub
		return false;
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
