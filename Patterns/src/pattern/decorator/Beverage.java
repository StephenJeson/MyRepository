package pattern.decorator;

public abstract class Beverage {
	protected String discription;
	
	public String getDiscription(){
		return this.discription;
	}
	
	public abstract double cost();
}
