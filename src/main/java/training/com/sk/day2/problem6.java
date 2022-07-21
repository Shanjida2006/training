package training.com.sk.day2;

interface MyPet
{
   public void dog();
   public void cat();
}
class problem6 implements MyPet
{

   public void dog()
   {
	System.out.println("Dog can bark.");
   }
   public void cat()
   {
	System.out.println("Cat can climb.");
   }
   public static void main(String arg[])
   {
	   MyPet obj = new problem6();
	   obj.dog();
   }
}