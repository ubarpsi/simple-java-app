package game.stage;

public class LivingThing extends Anything {
	private int energy;
	
	public static int DEFAULT_ENERGY_LEVEL = 100;
	public static int MINIMUM_ENERGY_LEVEL = 10;
	
	private static String DEFAULT_LIVINGTHING = "LivingThing";
	
	public LivingThing() {
		super(DEFAULT_LIVINGTHING);
		this.energy = DEFAULT_ENERGY_LEVEL;
	}
	public LivingThing(String name, int energy) {
		super(name);
		this.energy = energy;
	}
	public void drink(Drinkable liquid) {
		System.out.println(name + " drinking liquid");
		energy += liquid.consume();
	}
	
	public String status() {
		return name + " has energy("+this.energy+")";
	}
	
	

}
