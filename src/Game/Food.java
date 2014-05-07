package Game;

class FoodObject {
	private String name;
	private int amount;
	private int price;
	
	public FoodObject(String name, int amt, int price){ // add fucking icon string.
		this.name = name;
		this.amount = amt;
		this.price = price;
		System.out.println("Registered the food.");
	}
	
	public String getName()
	{
		return this.name;
	}

	public int getAmount()
	{
		return this.amount;
	}
	
	public int getPrice()
	{
		return this.price;
	}
	
}

public class Food {
	public static final int maxfoods = 10;
	private static FoodObject[] foodlist = new FoodObject[maxfoods];

	public static void registerFoods(){
		foodlist[0] = new FoodObject("Tacty Berry", 10, 100);
		foodlist[1] = new FoodObject("Rolly Eggroll", 25, 200);
		foodlist[2] = new FoodObject("Futuristic Candy", 45, 350);
		foodlist[3] = new FoodObject("Wonderful Egg", 60, 500);
		foodlist[4] = new FoodObject("Crystal Fag", 100, 800);
	}
	
	public static FoodObject[] getFoods(){
		return foodlist; // return all foods.
	}
	
	public static FoodObject getFood(int index){
		return foodlist[index]; // get specific food.
	}
}
