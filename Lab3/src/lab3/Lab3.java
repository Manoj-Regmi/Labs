package lab3;
import java.util.*;

class Test{
	int Sec(int [] arr) {
		int sec = Integer.MAX_VALUE;
		int first = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < first) {
				sec = first;
				first = arr[i];
			}
			else if(sec > arr[i] && arr[i] != first) {
				sec = arr[i];
			}
			else {
				if(sec > arr[i]) {
					sec = arr[i];
				}
			}
		}
		return sec;
	}
}

public class Lab3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Elements : ");
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		Test t = new Test();
		System.out.print("Second Array : " + t.Sec(arr));
		
		sc.close();
	}

}
