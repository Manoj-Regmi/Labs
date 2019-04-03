/**
 * @author Manoj Regmi
 */

package lab7;

import java.util.*;

public class Q3 {
	
	Map<Integer, Integer> getSquares(ArrayList<Integer> arr){
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(Integer i:arr) {
			m.put(i, i*i);
		}
		return m;
	}

	public static void main(String[] args) {
		Q3 obj = new Q3();
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("Enter 5 values to fine their squares : ");
		for(int i=0;i<5;i++) {
			arr.add(sc.nextInt());
		}
		System.out.println(obj.getSquares(arr));
		sc.close();
	}

}
