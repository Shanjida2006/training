package training.com.sk.day2;
abstract class Species
{
	  abstract void nature();

	  public void eat() 
	  {
	    System.out.println("This animal can eat.");
	  }
}

class Cat extends Species 
{
	  public void nature() 
	  {
	    System.out.println("This animal can climb.");
	  }
}

public class problem5 
{
	  public static void main(String[] args) 
	  {
	    Cat ob = new Cat();

	    ob.nature();
	    ob.eat();
	  }
}