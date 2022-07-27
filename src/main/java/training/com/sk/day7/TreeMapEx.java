package training.com.sk.day7;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		Map<Integer,String> map= new TreeMap<>();
		
		//adding
		map.put(3, "Python");
		map.put(4, "C#");
		map.put(1, "Java");
		map.put(2, "C/C++");
		
		//displaying using keySet()
		for(Integer key:map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}
		
		//removing
		System.out.println("Removing key:"+map.remove(4));
		
		//displaying using entrySet()
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		//Iteration
		Iterator<Map.Entry<Integer, String>> it=map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
