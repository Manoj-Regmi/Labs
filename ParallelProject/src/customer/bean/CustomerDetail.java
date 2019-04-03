package customer.bean;

public class CustomerDetail {
	
	//Personal-Details
	String fullname;
	int age;
	String address;
	String password;
	String passwords;
	
	//Account-Details
	String accountNumber;
	Integer balance;
	String transactions;

	public CustomerDetail() {
		super();
	}
	
	public CustomerDetail(CustomerDetail d) {
	}

	public CustomerDetail(String fullname, int age, String address, int balance, String password, String passwords) {
		super();
		this.fullname = fullname;
		this.age = age;
		this.address = address;
		this.balance = balance;
		this.password = password;
		this.passwords = passwords;
	}

	//Personal-Details
	public String getFullname() {
		return fullname;
	}
	
	public String getPasswords() {
		return passwords;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	//Account-Details
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
		

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}	
	
	public String getTransactions(){
		return transactions;
	}
	
	public void setTransactions(String transaction) {
		this.transactions += transaction;
	}
	
	public String toString() {
		return "All Resources have been allocated Successfully!";
	}
}
