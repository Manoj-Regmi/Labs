package customer.presentation;

import java.util.*;
import customer.service.*;
import customer.bean.*;
//import customer.dao.*;

public class PresentationClass {
	
	

	public static void main(String[] args) {
		CustomerDetail customer;
		ServiceClass service = new ServiceClass();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========Welcome To XYZ bank Customer Portal==========");
		boolean flag = true;
		while(flag){
			System.out.println("\n1.Create Account\n2.Show Balance\n3.Deposit\n4.Withdraw\n5.Fund Transfer\n6.Print Transaction\n7.Exit");
			int choice = sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Enter Full name (Eg : ManojRegmi) : ");
				String fullname = sc.next();				
				System.out.println("Enter Age : ");
				int age = sc.nextInt();
				
				System.out.println("Enter Full Address (Without spaces and starts from #number): ");
				String address = sc.next();
				System.out.println("Enter Initial Balance : ");
				int balance = sc.nextInt();
				
				System.out.println("Enter Password (must contain Uppercase, LowerCase, Number and a Special Character! Minimum Length 6) : ");
				String password = sc.next();
				System.out.println("Re-Enter Password : ");
				String passwords = sc.next();
				//System.out.println(passwords);
				customer = new CustomerDetail(fullname, age, address, balance, password, passwords);
				System.out.println(service.createAccount(customer));
				break;
				
			case 2:
				System.out.println("Enter FullName : ");
				String fn1 = sc.next();
				System.out.println("Enter Password : ");
				String password1 = sc.next();
				System.out.println(service.showBalance((fn1+fn1.length()), password1)!= null? (service.showBalance((fn1+fn1.length()), password1)):"");
				break;
				
			case 3:
				System.out.println("Enter FullName : ");
				String fn2 = sc.next();
				System.out.println("Enter Password : ");
				String password2 = sc.next();
				System.out.println("Enter amount to deposit : ");
				int depositBalance = sc.nextInt();
				System.out.println(service.deposit(depositBalance, (fn2+fn2.length()), password2));
				break;
				
			case 4:
				System.out.println("Enter FullName : ");
				String fn3 = sc.next();
				System.out.println("Enter Password : ");
				String password3 = sc.next();
				System.out.println("Enter Amount to Withdraw : ");
				int withBalance = sc.nextInt();
				System.out.println(service.withdraw(withBalance, (fn3+fn3.length()), password3));
				break;
				
			case 5:
				System.out.println("Enter FullName : ");
				String fn4 = sc.next();
				System.out.println("Enter Password : ");
				String password4 = sc.next();
				System.out.println("Enter Fullname/AccountNumber of Receiver : ");
				String receiver = sc.next();
				System.out.println("Enter Amount to Send : ");
				int sendBalance = sc.nextInt();
				System.out.println(service.fundTransfer((fn4+fn4.length()), password4, (receiver+receiver.length()), sendBalance));
				break;
				
			case 6:
				System.out.println("Enter FullName : ");
				String fn5 = sc.next();
				System.out.println("Enter Password : ");
				String password5 = sc.next();
				
				System.out.println(service.printTransaction(fn5+fn5.length(), password5));
				break;
				
			case 7:
				System.out.println("Thanks for Visting!");
				sc.close();
				flag = false;
				return;

			default:
				System.out.println("Invalid Input!");
			}
		}
		sc.close();
	}

}
