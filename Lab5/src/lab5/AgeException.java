/**
 * @author Manoj Regmi
 */

package lab5;
import java.util.*;

class MyException extends Exception{
	public String toString() {
		return "15 Below Age Restriction!";
	}
}

public class AgeException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		
		try {
			int age = sc.nextInt();
			if(age < 15) {
				sc.close();
				throw new MyException();
			}
			System.out.println("Age Accepted!");
		}
		catch(MyException e) {
			System.out.println(e);
		}
		sc.close();
	}

}
