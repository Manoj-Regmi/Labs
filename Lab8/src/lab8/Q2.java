/**
 * @author Manoj Regmi
 */

package lab8;

public class Q2 extends Thread{
	static int count = 0;
	Q2(){
		Thread t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		while(true){
				count++;
				try {
					Thread.sleep(1000);
					if(count%5 == 0) {
						System.out.println(count);
					}
				}
				catch(InterruptedException e) {
					
				}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Q2 obj = new Q2();
//		Thread t = new Thread(obj);
//		t.start();
//		
//		Runnable r2 = () -> {
//			try {
//				System.out.println(count);
//				Thread.sleep(5000);
//			}
//			catch(InterruptedException e) {
//				
//			}
//		};
//		Thread t2 = new Thread(r2);
//		t2.start();
	}
}
