/**
 * @author Manoj Regmi
 */

package lab7;
import java.util.*;

public class Q2 {
	
	Map<Character, Integer> countCharacters(Character[] arr){
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for(Character c: arr) {
			if(m.containsKey(c)) {
				m.put(c, m.get(c)+1);
			}
			else {
				m.put(c, 1);
			}
		}
		return m;
	}

	public static void main(String[] args) {
		Q2 obj = new Q2();
		Character[] arr = {'a','b','c','b','b','c'};
		Map<Character, Integer> m = obj.countCharacters(arr);
		System.out.println(m);
	}

}
