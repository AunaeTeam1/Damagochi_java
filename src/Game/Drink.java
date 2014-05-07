package Game;

class DrinkObject {
	private String name;
	private int amount;
	private int price;
	
	public DrinkObject(String name, int amt, int price){ // add fucking icon string.
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

public class Drink {
	public static final int maxfoods = 10;
	private static DrinkObject[] drinklist = new DrinkObject[maxfoods];

	public static void registerFoods(){
		drinklist[0] = new DrinkObject("Tacty Berry", 10, 100);
		drinklist[1] = new DrinkObject("Rolly Eggroll", 25, 200);
		drinklist[2] = new DrinkObject("Futuristic Candy", 45, 350);
		drinklist[3] = new DrinkObject("Wonderful Egg", 60, 500);
		drinklist[4] = new DrinkObject("Crystal Fag", 100, 800);
	}
	
	public static DrinkObject[] getDrinks(){
		return drinklist; // return all foods.
	}
	
	public static DrinkObject getDrink(int index){
		return drinklist[index]; // get specific food.
	}
}
