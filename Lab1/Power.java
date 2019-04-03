import java.util.*;

class Power{
	public static void main(String args[]){
		int n = new Scanner(System.in).nextInt();
		while(n>2){
			if(n%2 != 0){
				break;
			}
			n = n/2;
		}
		if(n==2){
			System.out.println("Yes");
		}
		else{
			System.out.println("false");
		}
	}
	
}