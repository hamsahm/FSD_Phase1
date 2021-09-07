package assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public void readFile(File file) throws IOException {
		FileReader fileReader = new FileReader(file.getName());
		BufferedReader br = new BufferedReader(fileReader);
		String data = br.readLine();
		System.out.println("Reading the file..  "+data);
		br.close();

	}

	public void writeFile(File file) throws IOException {
		FileWriter fileWritter = new FileWriter(file.getName(), true);
		BufferedWriter bw = new BufferedWriter(fileWritter);
		String data = "This is file1 adding contents to the file.";
		bw.write(data);
		bw.close();

	}

	public void appendFile(File file) throws IOException {
		FileWriter fileWritter = new FileWriter(file.getName(), true);
		BufferedWriter bw = new BufferedWriter(fileWritter);
		String data = " I am appending to the existing file";
		bw.append(data);
		bw.close();
		
	}
}
