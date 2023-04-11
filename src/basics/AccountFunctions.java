package basics;

import java.sql.Date;
import java.util.Collection;
import java.util.List;

public interface AccountFunctions {

	
	
	public boolean deposit(double amount);
	public List<String> getHistory(Date start, Date end);
	public String auditTransactions(Collection<String> inputs);
	void printStatement();
	void validateUserPass();
	
	

}
