package lab3;
import java.util.*;

public class Frequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size of Array : ");
		int n = sc.nextInt();
		char[] arr = new char[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.next().charAt(0);
		}
		
		int fre[] = new int[1000];
		 for(int i=0;i<n;i++) {
			 fre[arr[i]]++;
		 }
		 for(int i=0;i<n;i++) {
			 if(fre[arr[i]] != 0) {
				 System.out.println(arr[i] + "->" + fre[arr[i]]);
				 fre[arr[i]] = 0;
			 }
			 
		 }
		
		sc.close();
	}

}
