package assignment;

import java.io.File;
import java.io.IOException;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {

		FileHandling fileHandling = new FileHandling();
		String userDir = System.getProperty("user.dir");
		File f1 = new File(userDir + "\\file1.txt");

		if (f1.exists()) {
			f1.delete();
			f1.createNewFile();
		}

		// invoking writeFile method to write contents to a file
		fileHandling.writeFile(f1);

		// invoking readFile method to read contents of a file
		fileHandling.readFile(f1);

		// invoking appendFile method to append to contents of a file
		fileHandling.appendFile(f1);

	}

}
