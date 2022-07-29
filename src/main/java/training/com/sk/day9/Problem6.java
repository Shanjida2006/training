package training.com.sk.day9;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Problem6 {

	public static void main(String[] args) {
		try {
			//Create object
			SampleObjectClass ob = new SampleObjectClass(80104, "Tani");
			
			FileOutputStream out = new FileOutputStream("D:\\Training_HCL\\FSD Java\\day9\\output_serial_file.txt");
			ObjectOutputStream obout = new ObjectOutputStream(out);
			
			//Serialization of object
			obout.writeObject(ob);
			
			//Closing Streams
			out.close();
			obout.close();
			
			System.out.println("Object has been Serialized.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}

		try {
			//Deserialization of object
			
			FileInputStream in = new FileInputStream("D:\\Training_HCL\\FSD Java\\day9\\input_file.txt");
			ObjectInputStream obin = new ObjectInputStream(in);
			SampleObjectClass ob1 = (SampleObjectClass)obin.readObject();
			
			//closing streams
			in.close();
			obin.close();
			
			System.out.println("Object has been Deserialized.");
            System.out.println("Account Name = " + ob1.accName);
            System.out.println("Account Number = " + ob1.accNum);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
class SampleObjectClass implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	public long accNum;
	public String accName;
	
	public SampleObjectClass(long accNum, String accName){
		this.accNum = accNum;
		this.accName = accName;
	}
}
