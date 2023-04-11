package basics;

import java.sql.Date;
import java.util.Collections;
import java.util.List;

public interface Account {

	public boolean deposit(double amount);
	
	public List<String> getHistory(Date start, Date end);
	
}
