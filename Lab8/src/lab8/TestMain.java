package lab8;

import java.io.FileNotFoundException;

class A
{
	public void go() throws FileNotFoundException
	{}
}
class B extends A
{
	public void go()
	{}
}
public class TestMain {

	public static void main(String[] args) {
		A obj=new B();
		try {
			obj.go();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
