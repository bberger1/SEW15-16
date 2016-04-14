package bberger;

public class SternbucksCoffee {

	public static void main(String []args) {
		Beverage beverage = new HouseBlend();
		
		System.out.println("Milk and Soja added");
		
		beverage = new Soja(beverage);
		beverage = new Milk(beverage);
		
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
	}
	
}
