/**
 * @author Manoj Regmi
 */

package lab5;
import java.util.*;

public class Fibnocci {

	int recursive(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		return recursive(n-1) + recursive(n-2);
	}
	
	
	int iterative(int n) {
		int arr[] = new int[n];
		arr[0] = arr[1] = 1;
		for(int i=2;i<n;i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr[n-1];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		Fibnocci f = new Fibnocci();
		System.out.println("Recursive Fib : " + f.recursive(n) + " Iterative fib : " + f.iterative(n));
		sc.close();

	}

}
