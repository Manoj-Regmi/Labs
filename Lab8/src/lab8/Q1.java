/**
 * @author Manoj Regmi
 */

package lab8;
import java.io.*;

public class Q1 {

	public static void main(String[] args) throws IOException, InterruptedException{
		FileWriter fw = new FileWriter("C:\\Users\\Manoj Regmi\\Desktop\\CapGeminiJavaTraining\\File.name.class.txt");
		FileReader fr = new FileReader("C:\\Users\\Manoj Regmi\\Desktop\\CapGeminiJavaTraining\\File.txt");
		int i=0;
		int count = 0;
		
		while((i = fr.read()) != -1) {
			count++;
			if(count == 10) {
				Thread.sleep(5000);
			}
			fw.write((char)i);
			System.out.print((char)i);
		}
		
		fw.close();
		fr.close();
	}

}
