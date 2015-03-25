package btp600Assignment2.Enemies;

import java.util.ArrayList;

import btp600Assignment2.EnemyPosition;
import btp600Assignment2.Weapons.PowerUpContext;

public class Dragon extends Enemy implements Subject {
	//needs return methods to display what it is
	private EnemyPosition currentPosition;
	private int currentHealthPoints = 200;
	private String name = "Rimescale of the Flame";
	private int enemyAttackPower = 9;
	
	private ArrayList<ObserverMinion> observerMinions;
	private int drakeHealthPoints = 0;

	public Dragon() {
		observerMinions = new ArrayList<ObserverMinion>();
	}
	
	public boolean enemyBoss() { return true; } //Check if this is true, if it is, after this battle, show the ending if user wins

	@Override
	public void position() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void healthPoints() {		
		System.out.println(currentHealthPoints + "/200");
	}

	@Override
	public void enemyAttackPower() {
		System.out.println(enemyAttackPower);		
	}

	@Override
	public void enemyName() {
		System.out.println(name);		
	}

	@Override
	public void powerUpDrop() {} //Last boss, no drops
	
	
	/* ********************* Observer methods here *********************************** */
	@Override
	public void registerObserverMinion(ObserverMinion o) {
		observerMinions.add(o);
	}

	@Override
	public void removeObserverMinion(ObserverMinion o) {
		int i = observerMinions.indexOf(o);
		if(i >= 0)
			observerMinions.remove(i);
	}

	@Override
	public void notifyObserverMinions() {
		for(int i = 0; i < observerMinions.size(); i++) {
			ObserverMinion observerMinion = (ObserverMinion) observerMinions.get(i);
			observerMinion.update(drakeHealthPoints, 3); //need the position too
		}
	}
	
	//When the boss is below a health point threshold, it will summon drakes base on its current health points.
	//Notify the observer minions
	public void spawnsDrakes(int hp) { 
		drakeHealthPoints = hp;
		notifyObserverMinions();
	}

}
