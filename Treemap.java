package xyz;

import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		TreeMap<String,String> tm = new TreeMap<String,String>();
		tm.put("india", "newdelhi");
		tm.put("usa", "washington");
		tm.put("germany", "berlin");
		tm.put("japan", "tokyo");
		System.out.println(tm);
	}
}
