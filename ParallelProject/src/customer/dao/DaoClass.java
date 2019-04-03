package customer.dao;

import java.util.*;
import java.util.Date;
import customer.bean.*;
import java.text.SimpleDateFormat;
//import customer.dao.*;

public class DaoClass implements DaoInterface {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private List<CustomerDetail> customerList = new ArrayList<CustomerDetail>();
	Date date = new Date();
	CustomerDetail dt = new CustomerDetail();
	
	public List<CustomerDetail> getCustomerList(){
		return customerList;
	}
	
	public int getBalance(CustomerDetail d) {
		return d.getBalance();
	}
	
	@Override
	public String createAccount(CustomerDetail d1) {
		CustomerDetail d = new CustomerDetail();
		d.setFullname(d1.getFullname());
		d.setAge(d1.getAge());
		d.setAddress(d1.getAddress());
		d.setBalance(d1.getBalance());
		d.setPassword(d1.getPassword());
		
		String accountNumber = d1.getFullname()+(d1.getFullname().length());
		d.setAccountNumber(accountNumber);
		customerList.add(d);
		return "Account with Account Number : \"" + accountNumber + "\" Successfully Created!";
	}

	@Override
	public Integer showBalance(CustomerDetail d) {
		return d.getBalance();
	}

	@Override
	public String deposit(CustomerDetail d, int balance) {
		d.setBalance(d.getBalance() + balance);
		d.setTransactions("\nAmount creditted" + " " + balance + " on " + sdf.format(date));
		return "Amount deposited Successfully!";
	}

	@Override
	public String withdraw(CustomerDetail d, int balance) {
		d.setBalance(d.getBalance() - balance);
		d.setTransactions("\nAmount debited" + " " + balance + " on " + sdf.format(date));
		return "Available balance : " + d.getBalance();
	}

	//Still need to do!
	@Override
	public String fundTransfer(CustomerDetail d1, CustomerDetail d2, int balance) {
		
		//SenderWithdraw
		d1.setBalance(d1.getBalance() - balance);
		d1.setTransactions("\nAmount debited by Transfer" + " " + balance + " on " + sdf.format(date));
		
		//ReceiverCredit
		d2.setBalance(d2.getBalance() + balance);
		d2.setTransactions("\nAmount creditted" + " " + balance + " on " + sdf.format(date));
		
		return ("Successfully Transfered to : " + d2.getAccountNumber());
	}

	@Override
	public String printTransaction(CustomerDetail d) {
		return d.getTransactions();
	}
	
}
