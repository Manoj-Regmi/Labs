/**
 * @author Manoj Regmi
 */

package lab6;

public class Q6 {

	public static void main(String[] args) {
		long d = System.currentTimeMillis();
		long days = d/((10*10*10)*(3600)*(24));
		long months = days/30;
		long year = months/12;
		System.out.println("Days : " + days);
		System.out.println("Months : " + months);
		System.out.println("Years : " + year);
	}
}
