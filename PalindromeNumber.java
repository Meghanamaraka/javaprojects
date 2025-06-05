package xyz;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string:");
		 String str=sc.nextLine();
		 String Reversed = " ";
		 for (int i = str.length() - 1; i >= 0; i--) {
	            Reversed += str.charAt(i);

	}
		 if(str.equals(Reversed)) {
			 System.out.println(str+ "PalindromeNumber");
		 }else {
			 System.out.println(str+ "not PalindromeNumber");
		 }
		 sc.close();
		 

}
}
