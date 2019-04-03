/**
 * @author Manoj Regmi
 */

package lab6;

import java.io.*;
import java.util.*;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

public class Q4 {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter file name to get Details : ");
		String fileName = new Scanner(System.in).nextLine();
		File file = new File("C:\\Users\\Manoj Regmi\\Desktop\\CapGeminiJavaTraining\\"+fileName);
		
		if(file.exists()) {
			System.out.println("File Found : " + fileName);
			if(file.canRead()) {
				System.out.println("Readble!");
			}
			if(file.canWrite()) {
				System.out.println("Writable!");
			}
			System.out.println("hey");
			String[] arr = fileName.split("\\.");
			System.out.println("Extension : " + arr[arr.length - 1]);
			System.out.println("Total Size : " + file.length());
		}
	}

}
