package customer.dao;

import customer.bean.*;

public interface DaoInterface {
	//To add a new account
	String createAccount(CustomerDetail d);
	
	//To show balance
	Integer showBalance(CustomerDetail c);
	
	//Will print if deposited successfully or not
	String deposit(CustomerDetail d, int balaqnce);
	
	//will print success method
	String withdraw(CustomerDetail d, int balance);
	
	//will print successful transfer of fund
	String fundTransfer(CustomerDetail d1, CustomerDetail d2, int balance);
	
	//History of transactions
	String printTransaction(CustomerDetail d);
}
