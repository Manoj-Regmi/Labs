/**
 * @author Manoj Regmi
 */

package lab10;

interface Inferface{
	public Employee obj(Employee e);
}

class Employee{
	String name = "Manoj";
	Employee obj(Employee e) {
		e.name = this.name;
		return e;
	}
	
	public String toString() {
		return name;
	}
}

public class Q4 {
	
	public static void main(String[] args) {
		Employee e = new Employee();
		Inferface inter = new Employee()::obj;
		System.out.println(inter.obj(e));
	}

}
