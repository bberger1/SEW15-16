package bberger;

public class Soja extends CondimentDecorator {
	
	Beverage beverage;
	
	public Soja(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.description + ", Soja";
	}

	@Override
	public double cost() {
		return 0.49 + beverage.cost();
	}
}
