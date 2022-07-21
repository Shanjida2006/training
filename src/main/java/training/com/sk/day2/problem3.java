package training.com.sk.day2;

public class problem3 {
	public static void main(String[] args) {
		ConstructorOverloading ob1 = new ConstructorOverloading(6,6);
		ConstructorOverloading ob2 = new ConstructorOverloading(6,3.3);
		ConstructorOverloading ob3 = new ConstructorOverloading("Java"," Training");
		

    }
}
class ConstructorOverloading
{	
	ConstructorOverloading(int val1, int val2) {
		System.out.println("Addition:"+(val1+val2));
    }

	ConstructorOverloading(int val1, double val2) {
    	System.out.println("Multiplication:"+(val1*val2));
    }

	ConstructorOverloading (String val1, String val2) {
    	System.out.println("String Concatenation:"+(val1+val2));
    }

    

}


