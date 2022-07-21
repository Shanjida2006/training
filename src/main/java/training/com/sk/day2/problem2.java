package training.com.sk.day2;

public class problem2 {
	
	public static void main(String[] args) {
		MethodOverloading ob = new MethodOverloading();
             ob.operation(2,3.3);
             ob.operation("Shanjida"," Khatun");
             ob.operation(2,3);
    }
}
class MethodOverloading
{	
	void operation(int val1, int val2) {
		System.out.println("Addition:"+(val1+val2));
    }

    void operation(int val1, double val2) {
    	System.out.println("Multiplication:"+(val1*val2));
    }

    void operation (String val1, String val2) {
    	System.out.println("String Concatenation:"+(val1+val2));
    }

    

}
