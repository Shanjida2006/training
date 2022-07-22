package training.com.sk.day3;

public class Problem7_PassbyValRef {

	public static void main(String[] args) {
		
	    Sample ob=new Sample();
        
		System.out.println("Before call-by-value: " + ob.val);
		System.out.println("Before call-by-reference: " + ob.val);
        
		ob.call(100);
        System.out.println("After call-by-value: " + ob.val);
        
		ob.call(ob);
        System.out.println("After call-by-reference: " + ob.val);
	}
}
class Sample {
   int val = 10;
   void call(int val){
        val = val+10;
    }
   void call(Sample ob) {
       ob.val = ob.val+10;
   }
}