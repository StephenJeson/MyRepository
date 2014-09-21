package pattern.decorator;

public class Mocha extends CondimentDecorator{
	Beverage beverage;
	public Mocha(Beverage b){
		this.beverage = b;
	}
	
	public String getDiscription(){
		return beverage.getDiscription() + ", mocha";
	}
	public double cost(){
		return 0.50+beverage.cost();
	}
}
