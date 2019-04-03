package customer.service;

import customer.bean.*;

public interface ServiceInterface {
	public boolean validateName(String fullname);
	public boolean validateAge(int age);
	public boolean validateAddress(String address);
	public boolean validateBalance(int balance);
	public CustomerDetail validateUser(String receiver);
	public CustomerDetail validateLogin(String fn1, String fn2);
	public boolean validatePassword(String password1 , String password2);
	public boolean validatePasswordRegex(String password1);
}
