package game.stage;

import java.util.ArrayList;
import java.util.List;

public class Anything {
	protected String name;
	
	Anything(String name) {
		this.name = name;
	}
	
	protected List<String> attributes = new ArrayList<>();
	
	protected List<String> actions = new ArrayList<>();
	
	public String describe() {
		return name;
	}
	
	public void addAttribute(String desc) {
		attributes.add(desc);
	}
	
	public void addInteraction(String desc) {
		actions.add(desc);
	}
	
	public boolean can(String desc) {
		return attributes.contains(desc);
	}
	
	public List<String> getInteractions() {
		return this.actions;
	}
	
	public void doAction(String action) {
		if (actions.contains(action)) {
			// do something
			System.out.println("Doing action: "+ action);
		}
	}
	
	public void interact(Anything other, String action) {
		other.doAction(action);
	}
	
	
	

}
