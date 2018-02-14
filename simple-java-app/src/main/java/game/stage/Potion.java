package game.stage;

public class Potion extends Anything implements Drinkable {
	public static int MAGIC_POTION_AMOUNT = 10;
	public static int POISON_AMOUNT = -10;
	private static String DEFAULT_POTION_NAME = "Potion";
	private static String DEFAULT_INTERACTION = "drink";
	
	int amount;
	
	public Potion() {
		super(DEFAULT_POTION_NAME);
		init(0);
	}
	public Potion(int initialAmount) {
		super(DEFAULT_POTION_NAME);
		init(initialAmount);
	}
	
	public Potion(String name, int initialAmount) {
		super(name);
		init(initialAmount);
	}
	
	private void init(int amount) {
		this.amount = amount;
		addInteraction(DEFAULT_INTERACTION);
	}

	@Override
	public int consume() {
		int drinkAmount = this.amount;
		this.amount = 0;
		return drinkAmount;
	}

}
