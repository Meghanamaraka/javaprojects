package xyz;

import java.util.LinkedList;
import java.util.Queue;

public class IcecreamShop {
	public static void main(String[] args) {
		Queue<String> ic = new LinkedList<String>();
		ic.add("yash");
		ic.add("priya");
		ic.add("rudra");
		ic.add("nobitha");
		System.out.println(ic);
		System.out.println(ic.peek());
		ic.poll();
		System.out.println(ic);
		ic.add("preethi");
		System.out.println(ic);
	}

}
