/**
 * 
 * @author Manoj Regmi
 *
 */

package lab5;
import java.util.*;
import java.util.regex.*;

class NameException extends Exception{
	private static final long serialVersionUID = 1L;

	public String toString() {
		return "Wrong Name!! Make sure Your name have similarity as 'Manoj Kumar'.";
	}
}

public class Validation {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String regex = "^[A-Z]{1,1}[a-z]+\\s[A-Z]{1,1}[a-z]+";
		System.out.println("Enter Your Full Name : ");
		String fname = sc.nextLine();
		
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(fname);
		
		try {
			if((fname.length() == 0) || !match.matches()) {
				sc.close();
				throw new NameException();
			}
			System.out.println("FirstName : " + fname);
		}
		catch(NameException nm) {
			System.out.println(nm);
		}
		
		sc.close();
	}

}
