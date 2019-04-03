import java.util.*;

class Q1{
	public static void main(String [] args){
		System.out.print("Enter a Number : ");
		int x = new Scanner(System.in).nextInt();
		int sum = 0;
		for(int i=3;i<x;i++){
			if(i%3 == 0 || i%5 == 0){
				sum +=i;
			}
		}
		System.out.println("Sum : " + sum);
	}
}