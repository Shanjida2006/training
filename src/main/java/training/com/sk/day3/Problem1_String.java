package training.com.sk.day3;

public class Problem1_String {

	public static void main(String[] args) {
		
		//String length()
		String str = " Shanjida Khatun";
        System.out.println("String length:"+str.length());
        
        //String concatenation
        String str1 = "Developer ";
        String str2 = "Training";
        String str3 = "lop";
        System.out.println("String concatenation: "+str1 + str2);
        System.out.println("String concatenation: "+str1.concat(str2));
        
        // String to CharAt()
        for (int i= 0; i< str1.length(); i++) {
            System.out.print(" "+str1.charAt(i));
        }
        
        // String to CharArray()
        for (Character ch: str2.toCharArray()) {
            System.out.print(" "+ch);
        }
        
        //String compareTo()
        System.out.println("\n"+str1.compareTo(str2));
        
        //String contains()
        System.out.println(str1.contains(str3));
        
        //String split()
        String str4 = " This is a spliting test on String.";
        String[] split = str4.split(" ");
        for (String ost: split) {
            System.out.println(ost);
        }
        
        //String indexOf(),lastIndexOf() 
        System.out.println("Index of 'i' is " + str.indexOf('i'));
        System.out.println("Last index of 'a' is " + str.lastIndexOf('a'));
        
        //String toString()
        Integer obj = new Integer(50);
        String str5 =obj.toString(80);
        System.out.println("The String representation is " + str5);
        
        //String replace() and replaceAll() methods
        System.out.println(str4.replace(' ','-'));
        System.out.println(str4.replaceAll("is","was"));
        
        //Substring Method()
        System.out.println(str4.substring(8,12));
        
        //String toUpperCase() and toLowerCase() method
        System.out.println(str4.toUpperCase());   
        System.out.println(str4.toLowerCase());
        
        //String trim() method
        System.out.println(str4.trim());
        
        //String startsWith() and endsWith() method
        System.out.println(str.startsWith("S"));   
        System.out.println(str.endsWith("n"));   
        
        //String valueOf() Method
        int val=10;    
        String s=String.valueOf(val);    
        System.out.println(val+10);    
        

	}

}
