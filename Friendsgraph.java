package xyz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Friendsgraph {
	public static void main(String[] args) {
		Map<String,List<String>> graph=new HashMap<>();
		graph.put("Mummy", Arrays.asList("Likki"));
		graph.put("Likki", Arrays.asList("Gayyi","Mummy"));
		graph.put("Gayyi", Arrays.asList("Likki"));
		for(String person :graph.keySet()) {
			System.out.println(person + " is friends with"+graph.get(person));
		}
		
	
	}

}