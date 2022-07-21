package training.com.sk.day2;

public class Problem1 {

	public static void main(String[] args) {
		Dog ob = new Dog();


	    ob.name = "Tom";
	    ob.pet();
	    ob.eat();
	    ob.bark();

	}

}
class Animal
{
	  String name;
	  public void eat() 
	  {
	    System.out.println("He can eat.");
	  }
	  public void bark() 
	  {
	    System.out.println("He can bark.");
	  }
}
class Dog extends Animal 
{
	  public void pet() 
	  {
	    System.out.println("My dog's name is " + name);
	  }
}