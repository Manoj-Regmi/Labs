package lab3;
import java.util.*;

public class StringSort {
	
	public String[] sort(String[] str) {
		
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<str.length;j++) {
				if(str[i].compareTo(str[j]) < 0) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		for(int i=0;i<str.length/2;i++) {
			str[i] = str[i].toUpperCase();
		}
		for(int i=str.length-1;i>=str.length/2;i--) {
			str[i] = str[i].toLowerCase();
		}
		
		return str;
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of strings : ");
		int n = sc.nextInt();
		String[] str = new String[n];
		for(int i=0;i<n;i++) {
			str[i] = sc.next();
		}
		
		StringSort ss = new StringSort();
		String[] s = ss.sort(str);
		
		for(String s1:s) {
			System.out.println(s1);
		}
		
		sc.close();
	}
}
