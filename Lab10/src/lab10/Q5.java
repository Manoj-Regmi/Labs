/**
 * @author Manoj Regmi
 */

package lab10;

import java.util.*;

interface Factorial1 {
	int fact(int num);
}

class Factorial{
	int factorial(int num) {
		if(num == 1 || num == 0) {
			return 1;
		}
		return num*factorial(num-1);
	}
}

public class Q5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to find factorial : ");
		int number = sc.nextInt();
		
		Factorial1 f1 = new Factorial()::factorial;
		System.out.println(f1.fact(number));
		sc.close();
	}

}
