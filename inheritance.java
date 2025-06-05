package xyz;
class animals {
	void sound() {
		System.out.println("animal sounds");
	}
}
class dogs extends animals{
	void sound() {
		System.out.println("dog barks");
	}	
}
class cats extends animals {
	void sound() {
		System.out.println("cat meows");
	}
}
public class inheritance {

	public static void main(String[] args) {
		animals a=new animals();
		animals a1=new dogs();
		animals a2=new cats();
		a.sound();
		a1.sound();
		a2.sound();
		

	}

}