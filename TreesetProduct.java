package xyz;
import java.util.Scanner;
import java.util.TreeSet;

public class TreesetProduct {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("keyboard");
		ts.add("mouse");
		ts.add("monitor");
		ts.add("cpu");
		ts.add("webcam");
		System.out.println(ts);
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a element");
		String search=sc.nextLine();
		
		if(ts.contains(search)) {
			System.out.println("found");
		}else {
			System.out.println("not found");
		}
		sc.close();}
}

		
