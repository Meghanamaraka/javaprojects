package xyz;

import java.util.HashMap;

public class Sportname {

	public static void main(String[] args) {
		HashMap<Integer,String> sportnames = new HashMap<Integer,String>();
		sportnames.put(1,"cricket");
		sportnames.put(2,"football");
		sportnames.put(3,"throwball");
		sportnames.put(4, "volleyball");
		System.out.println(sportnames);
		for(Integer no : sportnames.keySet()) {
			System.out.println(sportnames.get(no));
		}

	}
}
