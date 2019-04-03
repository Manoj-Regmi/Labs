/**
 * @author Manoj Regmi
 */

package lab6;
import java.io.*;

public class Q3 {

	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("C:\\Users\\Manoj Regmi\\Desktop\\CapGeminiJavaTraining\\File.txt");
		int i = 0;
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		
		while((i = fr.read()) != -1) {
			System.out.print((char)i);
			charCount++;
			if((char)i == ' ' || (char)i == '\n') {
				wordCount++;
			}
			if((char)i == '\n'){
				lineCount++;
			}
		}
		
		if(charCount > 0 && wordCount == 0) {
			wordCount = 1;
		}
		if(charCount > 0 && lineCount == 0) {
			lineCount = 1;
		}
		
		System.out.println("\nCharacters : " + charCount);
		System.out.println("Words : " + (wordCount>1?wordCount+1:wordCount));
		System.out.println("Lines : " + (lineCount>1?lineCount+1:lineCount));
		
		fr.close();
	}

}
