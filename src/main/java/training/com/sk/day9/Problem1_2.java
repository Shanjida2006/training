package training.com.sk.day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem1_2 {
	
	public static void main(String[] args) {

		try {
			FileInputStream in=new FileInputStream("D:\\Training_HCL\\FSD Java\\day9\\input_file.jpg");
			FileOutputStream out= new FileOutputStream("D:\\Training_HCL\\FSD Java\\day9\\output_file.jpg");
			 
			int byteRead = -1;
			
			while((byteRead=in.read()) != -1) {
				out.write((byte)byteRead);
				System.out.print(" " + (byte)byteRead);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("\nSuccessfully created the file.");
	}
}
