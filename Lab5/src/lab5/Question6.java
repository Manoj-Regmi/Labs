/**
 * @author Manoj Regmi
 */

package lab5;
import java.util.*;

class EmployeeException extends Exception{
	public String toString() {
		return "Salary can't be less than 3000!";
	}
}

public class Question6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary : ");
		
		try {
			int salary = sc.nextInt();
			if(salary < 3000) {
				sc.close();
				throw new EmployeeException();
			}
			System.out.println("Thanks!");
		}
		catch(EmployeeException e) {
			System.out.println(e);
		}
		sc.close();
	}

}
