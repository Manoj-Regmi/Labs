import java.util.*;

class NNaturals{
	public static void main(String [] args){
		int n;
		/*
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		*/
		n = new Scanner(System.in).nextInt();
		int sum1 = (n*(n+1)*((2*n)+1))/6;
		int sum2 = (n*n*(n+1)*(n+1))/4;
		System.out.println(sum1-sum2);
	}
}