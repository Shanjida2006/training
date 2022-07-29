package training.com.sk.day9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Problem3_4 {

	public static void main(String[] args) {
		
		try{
			FileReader in = new FileReader("D:\\Training_HCL\\FSD Java\\day9\\input_file.txt");
			FileWriter out = new FileWriter("D:\\Training_HCL\\FSD Java\\day9\\output_file.txt");
			
			int i = -1;
			while((i=in.read()) != -1) {
				out.write(i);
				System.out.print((char)i);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("\nSuccessfully created the file.");
	}
}
