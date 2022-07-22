package training.com.sk.day3;

public class Problem2_StringBuffer {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Java Training");
		StringBuffer sb = new StringBuffer("MySQL Training");

        //length() Method
		System.out.println("Length:" + s.length());
		
		//capacity() method
        System.out.println("Capacity:" + s.capacity());
        
        //append() method
        s.append(" running");
        System.out.println(s);
        
        //insert() method
        s.insert(13, " is");
        System.out.println(s);
        
        //reverse( ) method
        System.out.println(s.reverse());
        s.reverse();
        
        //delete( ) and deleteCharAt() method
        sb.delete(1, 5);
        System.out.println(sb);
        
        sb.deleteCharAt(5);
        System.out.println(sb);
        
        //replace() method
        sb.replace(0, 2, "SQL ");
        System.out.println(sb);
        

	}

}
