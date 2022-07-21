package training.com.sk.day2;

public class problem4 
{
	public static void main(String args[])
	{  
		  Car obj = new Car(); 
		  obj.run(); 
	}  
}
class Vehicle
{  
	  void run()
	  {
		  System.out.println("Vehicle is running...");  
	  } 
}
class Car extends Vehicle
{   
	  void run()
	  {
		  System.out.println("Car is running.....");
	  }  
}
