package training.com.sk.day7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListEx {

	public static void main(String[] args) {
		List<Integer> alist = new ArrayList<Integer>();
		List<Integer> llist = new LinkedList<Integer>();
		Stack<Integer> slist = new Stack<Integer>();
		Vector<Integer> vlist = new Vector<Integer>();
		
		System.out.println("-----Array List-----");
		//adding
		alist.add(10);
		alist.add(2);
		alist.add(0,3);
		
		System.out.print("Before Removing, values are:");
		System.out.println(alist);
		
		//removing
		alist.remove(1);
		System.out.print("After Removing, values are:");
		System.out.println(alist);
		
		//Iteration
		System.out.println("Iteration:");
		Iterator<Integer> it = alist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("-----Linked List-----");
		//adding
		llist.add(10);
		llist.add(20);
		llist.add(0,30);
		
		System.out.print("Before Removing, values are:");
		System.out.println(llist);
		
		//removing
		llist.remove(1);
		System.out.print("After Removing, values are:");
		System.out.println(llist);
		
		//Iteration
		System.out.println("Iteration:");
		Iterator<Integer> it1 = llist.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("-----Vector-----");
		//adding
		vlist.add(100);
		vlist.add(200);
		vlist.add(300);
		
		System.out.print("Before Removing, values are:");
		for(int i=0;i<vlist.size();i++) {
			System.out.print(" "+vlist.get(i));
		}
		
		//removing
		vlist.remove(2);
		System.out.print("\nAfter Removing, values are:");
		for(int i=0;i<vlist.size();i++) {
			System.out.print(" "+vlist.get(i));
		}
		
		//Iteration
		System.out.println("\nIteration:");
		Iterator<Integer> it2 = vlist.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		System.out.println("-----Stack-----");
		//adding
		slist.push(56);
		slist.push(23);
		slist.push(89);
		
		System.out.print("Before Removing, values are:");
		for(int i=0;i<slist.size();i++) {
			System.out.print(" "+slist.get(i));
		}
		
		//removing
		slist.pop();
		System.out.print("\nAfter Removing, values are:");
		for(int i=0;i<slist.size();i++) {
			System.out.print(" "+slist.get(i));
		}
		
		//Iteration
		System.out.println("\nIteration:");
		Iterator<Integer> it3 = slist.iterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
	}
}
