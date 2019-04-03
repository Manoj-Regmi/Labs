/**
 * @author Manoj Regmi
 */

package lab10;
import java.util.*;

interface Interface2{
	public String format(String s);
}

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.next();
		
		Interface2 inter = (str) -> {
			str = "";
			for(int i=0;i<s.length();i++) {
				str += s.charAt(i)+" ";
			}
			return str;
		};
		
		System.out.println(inter.format(s));
		sc.close();
	}

}
