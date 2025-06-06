package xyz;
import java.util.HashMap;

public class GroceryBasket {

	

	public static void main(String[] args) {
	 HashMap<String, Integer> gb = new HashMap<String, Integer>();
	 gb.put("rice", 3500);
	 gb.put("redgram", 160);
	 gb.put("paste", 50);
	 gb.put("groundnuts", 1500);
	 gb.put("brush", 40);
	 System.out.println(gb);
	 int totalCost = 0;
	 for(int cost : gb.values()) {
		 totalCost += cost;
		 System.out.println(totalCost);
		 
	 }
	 gb.put("brush", 20);
	 System.out.println(gb);
	 gb.remove("paste");
	 System.out.println(gb);
	}

}
