package training.com.sk.day2;

public class problem7 
{
   public static void main(String arg[])
   {
	   Employer ob=new Employer();
	   ob.display();
   }

}
class Employer extends Employee
{
  	Employer(){
  		super(" Khatun");
  	}
  	void display() 
  	{
  		System.out.println("Employee's first name:"+super.fname);
  		designation();
  	}
}
class Employee
{
	String fname="Shanjida";
	Employee(String lname)
	{
		System.out.println("Employee Full name: "+(fname+lname));
	}
	void designation()
	{
		System.out.println("Employee's Designation:Developer.");
	}
}
