import java.util.*;

class Increasing{
	public static void main(String [] args){
		boolean flag = true;
		int n = new Scanner(System.in).nextInt();
		int prev = Integer.MAX_VALUE;
		while(n>0){
			int remainder = n%10;
			if(remainder >= prev){
				flag = false;
				break;
			}
			else{
				prev = remainder;
				n = n/10;
			}
		}
		System.out.print(flag);
	}
}