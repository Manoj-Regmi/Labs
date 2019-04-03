/**
 * @author Manoj Regmi
 */

package lab10;
import java.util.*;

interface Inter{
	public Integer power(int x, int y);
}

public class Q1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Inter i = (x, y) -> {
			return (int) Math.pow(x, y);
		};
		System.out.println("Enter 2 Number to get the power : ");
		System.out.println(i.power(sc.nextInt(), sc.nextInt()));
		
		sc.close();
	}

}
