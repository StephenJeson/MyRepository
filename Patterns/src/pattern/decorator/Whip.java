package pattern.decorator;

public class Whip extends CondimentDecorator{
	Beverage beverage;
	public Whip(Beverage b){
		this.beverage = b;
	}
	
	public String getDiscription(){
		return beverage.getDiscription() + ", whip";
	}
	public double cost(){
		return 0.78+beverage.cost();
	}
}
