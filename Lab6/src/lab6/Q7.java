/**
 * @author Manoj Regmi
 */

package lab6;

import java.util.*;
import java.util.regex.*;

public class Q7 {
	
	boolean username(String name) {
		Pattern pattern = Pattern.compile(".{8,}(_job)$");
		Matcher match = pattern.matcher(name);
		if(match.matches()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Q7 obj = new Q7();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String name = sc.nextLine();
		
		if(obj.username(name)) {
			System.out.println("Accepted!");
		}
		else {
			System.out.println("Declined!");
		}
		sc.close();
	}

}
