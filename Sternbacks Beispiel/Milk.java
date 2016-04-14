package bberger;

public class Milk extends CondimentDecorator {

	Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.description + ", Milk";
	}

	@Override
	public double cost() {
		return 0.29 + beverage.cost();
	}
	
}
