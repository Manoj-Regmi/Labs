package lab10;
import java.util.*;

interface Interface3{
	public boolean validation(String username, String password);
}

public class Q3 {

	public static void main(String[] args) {
		String username = "Manoj";
		String passwords = "Manoj1996";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username and password : ");
		String u = sc.next();
		String p = sc.next();
		
		Interface3 inter = (user, password) -> {
			if(user.equals(username) && password.equals(passwords)) {
				return true;
			}
			else {
				return false;
			}
		};
		
		System.out.println(inter.validation(u, p));
		sc.close();
	}

}
