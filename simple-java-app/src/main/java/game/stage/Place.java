package game.stage;

import java.util.List;

public interface Place {
	
	String describe();
	
	void add(Anything anything);
	
	List<Anything> contents();

}
