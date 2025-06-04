package abc;

public class Calculator {
	int calculator(int a,int b) {
		return a + b;
	}
	double calculate(double a,double b) {
		return a*b;}
		int calculate (int a,int b,int c) {
		return a*b*c;
		}
		public static void main(String[]args) {
			Calculator s=new Calculator();
			System.out.println(s.calculator(22, 44));
			System.out.println(s.calculate(2.4, 6.0));
			System.out.println(s.calculate(2, 3, 9));
			
					
			
		
		
	}
	

}
