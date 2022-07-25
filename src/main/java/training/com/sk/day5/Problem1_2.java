package training.com.sk.day5;

public class Problem1_2 {

	public static void main(String[] args) {
		
		//Problem 1: checked exception
		try {
			  Class.forName("com.mcnz.Example");
			 } catch (ClassNotFoundException e) {
			  System.out.println("Class was not found.");
			 }
		
		
		//Problem 2: unchecked exception    
			 String input = null;
			 try {
				 input.length();
			 }catch (NullPointerException e) {
				  System.out.println("Length of input is null.");
				 }
	}

}
