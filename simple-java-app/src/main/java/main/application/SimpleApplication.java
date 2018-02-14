package main.application;

import java.util.ArrayList;
import java.util.List;

import game.stage.Drinkable;
import game.stage.LivingThing;
import game.stage.Potion;

public class SimpleApplication {

	public static void main(String[] args) {
		System.out.println("Simple Java Application started.");
		
		LivingThing man = new LivingThing("Man", 100);
		
		List<Drinkable> drinks = new ArrayList<Drinkable>();
		
		drinks.add(new Potion("Milk", 10));
		drinks.add(new Potion("Poison", -10));
		
		System.out.println(man.status());
		for(Drinkable drink:drinks) {
			man.drink(drink);
			System.out.println(man.status());
		}
		
		
		simpleCLI simpleCLI = new simpleCLI();
		
		simpleCLI.commandLoop();
		
		System.out.println("Simple Java Application ended.");
	

	}

}
