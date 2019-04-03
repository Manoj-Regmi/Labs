package lab4;
import java.util.*;

public class SumCubes {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int number = n;
		int res = 0;
		while(n>0) {
			int val = n%10;
			res = res + (val*val*val);
			n /= 10;
		}
		System.out.println("Sum of cubes of digits of " + number + " : " + res);
		sc.close();
	}
}
