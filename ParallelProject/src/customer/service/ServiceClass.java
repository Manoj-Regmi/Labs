package customer.service;

import java.util.regex.*;
import customer.bean.*;
import customer.dao.*;

public class ServiceClass implements ServiceInterface{
	
	public DaoClass dao = new DaoClass();
	//ServiceClass service = new ServiceClass();
	
	@Override
	public boolean validateName(String fullname) {
		System.out.println("fullname : " + fullname);
		Pattern pattern = Pattern.compile("^[A-Z]{1,1}[a-z]*[A-Z]{1,1}[a-z]*");
		Matcher match = pattern.matcher(fullname);
		
		if(match.matches()) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean validateAge(int age) {
		System.out.println("age : " + age);
		if(age>=18) {
			return true;
		}
		return false;
	}

	@Override
	public boolean validateAddress(String address) {
		System.out.println("address : " + address);
		Pattern pattern1 = Pattern.compile("^#[0-9]+.*");
		Matcher match1 = pattern1.matcher(address);
		if(match1.matches()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean validateBalance(int balance) {
		Pattern pattern = Pattern.compile("[0-9]{1,8}");
		Matcher match = pattern.matcher(Integer.toString(balance));
		if((balance > 0) && match.matches()){
			return true;
		}
		return false;
	}

	
	@Override
	public CustomerDetail validateLogin(String fullname, String password) {
		CustomerDetail dummy = null;
		for(CustomerDetail c : dao.getCustomerList()) {
			if(c.getAccountNumber().equals(fullname) && c.getPassword().equals(password)) {
				return c;
			}
		}
		return dummy;
	}
	
	@Override
	public CustomerDetail validateUser(String fullname) {
		CustomerDetail dummy = null;
		for(CustomerDetail c : dao.getCustomerList()) {
			if(c.getAccountNumber().equals(fullname)) {
				return c;
			}
		}
		return dummy;
	}
	
	@Override
	public boolean validatePassword(String password1, String password2) {
		if(password1.equals(password2)) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean validatePasswordRegex(String password) {
		Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!-~]).{6,}");
		Matcher match = pattern.matcher(password);
		if(match.matches()) {
			return true;
		}
		return false;
	}
	
	public boolean validateTransaction(int balance, CustomerDetail d) {
		if(d == null) {
			return false;
		}
		if(dao.getBalance(d) > balance) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/*-----------------------CREATE ACCOUNT-----------------------*/
	public String createAccount(CustomerDetail d) {
		String errors = "";
		//System.out.println("In createAccount : " + d.getFullname());
		
		if(validateName(d.getFullname()) != true) {
			errors += "\nInvalid Name! Refer 'Manoj Regmi'";
		}
		if(!validateAge(d.getAge())) {
			errors += "\nInvalid age! Must be 18+";
		}
		if(validateAddress(d.getAddress()) != true) {
			errors += "\nInvalid Address! Refer '#4____'";
		}
		if(validateUser((d.getFullname()+d.getFullname().length())) != null){
			errors += "\nUser Already Exists!";
		}
		if(!validatePasswordRegex(d.getPassword())){
			errors += "\nPassword must contain a Capital Letter, a Small Letter, a Special Character, a Digit and minimum length should be 6!";
		}
		if(!validatePassword(d.getPassword(), d.getPasswords())){
			errors += "\nPassword Do not Match!";
		}
		
		if(errors.length() == 0) {
			return dao.createAccount(d);
		}
		else {
			return errors;
		}
			
	}
	
	/*-------------------------Show Balance------------------------------*/
	
	public String showBalance(String fullname, String password) {
		if(validateLogin(fullname, password) != null) {
			CustomerDetail d = validateLogin(fullname, password);
			return ("\nCurrent Balance : " + dao.showBalance(d));
		}
		else {
			return "Account Not found!";
		}
	}
	
	/*--------------------------DEPOSIT----------------------------------*/
	public String deposit(int balance, String fullname, String password) {
		if(validateBalance(balance) && validateLogin(fullname, password) != null) {
			CustomerDetail d = validateLogin(fullname, password);
			return dao.deposit(d, balance);
		}
		else {
			return "\nBalance can't be less than 0 and must be Digit! or Provide correct Credentials!";
		}
	}
	
	/*-----------------------------WITHDRAW--------------------------------*/
	public String withdraw(int balance, String fullname, String password) {
		if(validateBalance(balance) &&  validateTransaction(balance, validateLogin(fullname, password)) && validateLogin(fullname, password) != null) {
			CustomerDetail d = validateLogin(fullname, password);
			return dao.withdraw(d, balance);
		}
		else {
			return "WithDraw amount can't be Greater than Current Balance and must be Digit! or Provide correct Credentials!";
		}
	}
	
	/*--------------------------------FUNDTRANSFER-------------------------------*/
	public String fundTransfer(String sender, String password, String receiver, int balance) {
		if(validateBalance(balance) && validateTransaction(balance, validateLogin(sender, password)) && validateUser(receiver) != null) {
			CustomerDetail senderObj = validateLogin(sender, password);
			CustomerDetail receiverObj = validateUser(receiver);
			return dao.fundTransfer(senderObj, receiverObj, balance);
		}
		else {
			return "Credentials Not Correct or Transfer amount can't be Greater than Current Balance";
		}
	}
	
	/*--------------------------------PrintTransaction-----------------------------*/
	public String printTransaction(String fullname, String password) {
		if(validateLogin(fullname, password) != null) {
			CustomerDetail d = validateLogin(fullname, password);
			return dao.printTransaction(d);
		}
		else {
			return "Credentials Not Correct";
		}
	}
	
}
