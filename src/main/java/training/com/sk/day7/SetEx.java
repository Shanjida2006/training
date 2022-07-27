package training.com.sk.day7;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
		Set<String> hset= new HashSet<>();
		Set<Integer> lhset= new LinkedHashSet<>();
		Set<Integer> tset= new TreeSet<>();
		
		System.out.println("----HashSet-----");
		//adding
		hset.add("Ryan");
		hset.add("Jhon");
		hset.add("James");
		hset.add("Susan");
		
		System.out.print("Before Removing, values are:");
		System.out.println(hset);

		//removing
		hset.remove("Susan");
		System.out.print("After Removing, values are:");
		System.out.println(hset);
		
		//Iteration
		System.out.println("Iteration:");
		Iterator<String> it = hset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n----LinkedHashSet-----");
		//adding
		lhset.add(12);
		lhset.add(32);
		lhset.add(100);
		lhset.add(10);
		
		System.out.print("Before Removing, values are:");
		System.out.println(lhset);

		//removing
		lhset.remove(100);
		System.out.print("After Removing, values are:");
		System.out.println(lhset);
		
		//Iteration
		System.out.println("Iteration:");
		Iterator<Integer> it1 = lhset.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("\n----TreeSet-----");
		//adding
		tset.add(9);
		tset.add(8);
		tset.add(7);
		tset.add(6);
		
		System.out.print("Before Removing, values are:");
		System.out.println(tset);

		//removing
		tset.remove(8);
		System.out.print("After Removing, values are:");
		System.out.println(tset);
		
		//Iteration
		System.out.println("Iteration:");
		Iterator<Integer> it2 = tset.iterator();
		
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
	}
}
