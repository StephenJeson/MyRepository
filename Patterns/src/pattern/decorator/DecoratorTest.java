package pattern.decorator;

public class DecoratorTest {
	public static void main(String args[]){
		Beverage beverage = new DarkBoast();
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		System.out.println(beverage.getDiscription());
		System.out.println(beverage.cost());
	}
}
