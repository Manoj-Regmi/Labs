/**
 * @author Manoj Regmi
 */

package lab6;
import java.util.*;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean flag = true;
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i) > str.charAt(i+1)) {
				flag = false;
			}
		}
		if(flag) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}
		sc.close();
	}

}
