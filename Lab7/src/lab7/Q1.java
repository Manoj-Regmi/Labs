/**
 * @author Manoj Regmi
 */

package lab7;
import java.util.*;

public class Q1 {

	List<Integer> getValues(Map<String, Integer> m){
		List<Integer> list = new ArrayList<Integer>();
		for(String key: m.keySet()) {
			list.add(m.get(key));
		}
		Collections.sort(list);
		return list;
	}
	public static void main(String[] args) {
		
		Q1 obj = new Q1();
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("a", 30);
		m.put("c", 20);
		m.put("b", 10);
		m.put("e", 20);
		m.put("d", 40);
		List<Integer> list = obj.getValues(m);
		for(Integer i:list) {
			System.out.println(i);
		}
	}

}
