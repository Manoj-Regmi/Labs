package lab3;
import java.util.*;

public class Q3 {
	
	int rev(int number) {
		int mul = 1;
		int remainder;
		int res = 0;
		while(number > 0) {
			remainder = number%10;
			number = number/10;
			res = res*mul+remainder;
			mul *= 10;
		}
		return res;
	}
	
	int [] sorting(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	int[] Reverse(int [] str) {
		for(int i=0;i<str.length;i++) {
			str[i] = rev(str[i]);
		}
		
		sorting(str);
		return str;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Q3 q = new Q3();
		int str[] = q.Reverse(arr);
		
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i] + " ");
		}
		
		sc.close();
	}

}
