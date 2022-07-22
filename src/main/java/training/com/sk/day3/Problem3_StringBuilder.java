package training.com.sk.day3;

public class Problem3_StringBuilder {
	public static void main(String[] args) {
		
	        StringBuilder str = new StringBuilder("Shanjida Khatun");
	        
	        // String length()
	        System.out.println("String length:"+str.length());
	        
	        //String toString()
	        System.out.println("String = "+ str.toString());
	        
	        // reverse the string
	        StringBuilder reverseStr = str.reverse();
	        System.out.println("Reverse String = "+ reverseStr.toString());
	        
	        StringBuilder str1 = new StringBuilder("Java Developer ");
	        StringBuilder str2 = new StringBuilder("Training");
	        StringBuilder str3 = new StringBuilder("lop");
	        
	        //String capacity()
	        System.out.println("String capacity = "+ str1.capacity());
	        
	        //String appendCodePoint()
	        str1.appendCodePoint(20);
	        System.out.println("Modified String= "+ str1.toString());
	        
	        //append() method
	        str2.append(" running");
	        System.out.println(str2);
	        
	        //insert() method
	        str3.insert(3," hop");
	        System.out.println(str3);
	        
	        //String concatenation
	        System.out.println("String concatenation: "+str1 + str2);

	        // String to charAt()
	        for (int i= 0; i< str1.length(); i++) {
	            System.out.print(" "+str1.charAt(i));
	        }
	        
	        //String compareTo()
	        System.out.println("\n"+str1.compareTo(str2));
	        
	        StringBuilder str4 = new StringBuilder("This is a spliting test on String.");
	        
	        //String replace() 
	        System.out.println(str4.replace(0,4,"That"));
	        
	        //String substring() 
	        System.out.println(str4.substring(8,12));
	        
	        //String indexOf()
	        System.out.println(str4.indexOf("on"));
	        
	}

}
