package game.stage;

import java.util.ArrayList;
import java.util.List;

public class Room implements Place {
	
	private String description;
	
	private List<Anything> things = new ArrayList<>();
	
	Room(String description) {
		this.description = description;
	}

	@Override
	public String describe() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Anything anything) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Anything> contents() {
		// TODO Auto-generated method stub
		return null;
	}

}
