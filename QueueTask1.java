package xyz;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTask1 {

	public static void main(String[] args) {
		Queue<String> students = new LinkedList<String>();
		students.add("student 1");
		students.add("student 5");
		students.add("student 7");
		students.add("student 9");
		System.out.println(students);
		while(!students.isEmpty()) {
			String student=students.poll();
			System.out.println(student+ "Queue");
		}
		
		
		
	}

}
