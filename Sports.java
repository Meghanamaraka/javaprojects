package xyz;

import java.util.ArrayList;
import java.util.HashSet;

public class Sports {
	public static void main(String[] args) {
		HashSet<String> sportnames = new HashSet<String>();
		sportnames.add("cricket");
		sportnames.add("Hockey");
		sportnames.add("cricket");
		sportnames.add("Hockey");
		sportnames.add("football");
		sportnames.add("volleyball");
		sportnames.add("basketball");
		sportnames.add("boxing");
		sportnames.add("swimming");
		sportnames.add("karate");
		System.out.println(sportnames);
		ArrayList<String> names=new ArrayList<String>(sportnames);
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}

}
}
