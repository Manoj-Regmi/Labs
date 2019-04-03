/**
 * @author Manoj Regmi
 */

package lab6;
import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		String delim = " ";
		System.out.println("Enter String of numbers : ");
		String numbers = sc.nextLine();
		StringTokenizer st = new StringTokenizer(numbers, delim);
		while(st.hasMoreTokens()) {
			int digit = Integer.parseInt(st.nextToken());
			System.out.println(digit);
			sum += digit;
		}
		System.out.println("Sum is " + sum);
		sc.close();

	}

}




