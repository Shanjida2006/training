package training.com.sk.day9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Problem5 {

	public static void main(String[] args) {
		
		BufferedReader in = null;
		BufferedWriter out = null;
		
		try{
			in = new BufferedReader (new FileReader("D:\\Training_HCL\\FSD Java\\day9\\input_file.txt"));
			out = new BufferedWriter (new FileWriter("D:\\Training_HCL\\FSD Java\\day9\\output_file.txt"));
			
			int i = -1;
			while((i=in.read()) != -1) {
				out.write(i);
				System.out.print((char)i);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
				out.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\nSuccessfully created the file.");

	}

}
