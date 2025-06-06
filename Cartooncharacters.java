package xyz;

import java.util.ArrayList;

public class Cartooncharacters {

	public static void main(String[] args) {
		ArrayList<String> cc = new ArrayList<String>();
		cc.add("tom and jerry");
		cc.add("rudra");
		cc.add("shinchan");
		cc.add("pinkpather");
		cc.add("nobitha");
		System.out.println(cc);
		cc.remove(4);
		System.out.println(cc);
		cc.set(cc.indexOf("shinchan"),"shinchan nohara");
		System.out.println(cc);
		

	}

}
