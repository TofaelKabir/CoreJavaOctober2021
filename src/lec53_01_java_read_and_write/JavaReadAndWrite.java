package lec53_01_java_read_and_write;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class JavaReadAndWrite {

	public static void main(String[] args) {
		// for Mac user -- if the folder name is Alex -- /Users/YourName/Desktop/Alex
		File folder = new File("C:\\Users\\Tofael\\Desktop\\EnthrallIT");
		folder.mkdir(); // method to create folder
		if (folder.exists()) {
			System.out.println(folder.getName() + " folder is created in Desktop");
			File file = new File("C:\\Users\\Tofael\\Desktop\\EnthrallIT\\Students.txt");
			try {
				file.createNewFile(); // method to create file
			} catch (Exception e) {
				e.printStackTrace();
				// System.out.println(e);
			}
			if (file.exists()) {
				System.out.println(file.getName() + " file is created inside the folder");

				System.out.println("<-- Please write something about the students -->");
				Scanner scanner = new Scanner(System.in);
				String userinput = scanner.nextLine();

				try {
					Formatter formatter = new Formatter("C:\\Users\\Tofael\\Desktop\\EnthrallIT\\Students.txt");
					formatter.format("%s", userinput); // %S give data in uppper case
					formatter.close();
				} catch (Exception f) {
					f.printStackTrace();
					// System.out.println("The error is: "+f);
				}
				System.out.println(
						"Now go to the Desktop, open the folder, then the file and see what is written in the file");

				String path = "C:\\Users\\Tofael\\Desktop\\EnthrallIT\\Students.txt";
				
				// why we used both
				FileReader fr = null;
				BufferedReader br = null;

				try {
					fr = new FileReader(path); // when the class is instantiated, it can locate the file
					System.out.println("FileReader find the location of the path as: " + path);
				} catch (FileNotFoundException g) {
					g.printStackTrace();
					// System.out.println("The file is not found");
				}

				String data = "";
				try {
					br = new BufferedReader(fr);
					while ((data = br.readLine()) != null) {
						System.out.println("The BufferedReader read the file and got : " + data);
					}
				} catch (IOException h) {
					h.printStackTrace();
					// System.out.println("The file can't be read");
				} finally {
					if (fr != null) {
						fr = null;
					}
					if (br != null) {
						br = null;
					}
				}

				scanner.close();
			}

		}

	}

}
