package training.com.sk.day2;

public class problem8 {

	  public static void main(String args[]) 
	  {
		  Tech   obj = new Tech  ();
	      obj.controlSpeed();
	  }
}
final class Tech 
{
	final int speedlimit = 60;
	final void controlSpeed() 
	 {
		 System.out.println("Speed Limit: "+speedlimit);
	 }
}
