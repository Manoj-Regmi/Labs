/**
 * @author Manoj Regmi
 */

package lab6;
import java.io.*;

public class Q2 {
	public static void main(String[] args) throws IOException {
		int line = 0;
		FileReader fr = new FileReader("C:\\Users\\Manoj Regmi\\Desktop\\CapGeminiJavaTraining\\File.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while((str = br.readLine()) != null) {
			System.out.println("Line : "+ ++line);
			System.out.println(str);
		}
		br.close();
	}

}
