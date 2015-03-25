package btp600Assignment2.Enemies;

import btp600Assignment2.EnemyPosition;
import btp600Assignment2.Weapons.PowerUpContext;

public class Drake extends Enemy implements ObserverMinion {
	//needs return methods to display what it is
	private EnemyPosition currentPosition;
	private int currentHealthPoints;
	private int maxHealthPoints;
	private String name = "Drakes of the Flame";
	private int enemyAttackPower;
	
	private Subject dragonStats;

	//Observer methods
	public Drake(Subject dragonStats) { //Register the drake as an observer
		this.dragonStats = dragonStats;
		dragonStats.registerObserverMinion(this);
	}
	
	@Override
	public void update(int hp, int minionAP) {
		currentHealthPoints = hp;
		enemyAttackPower = minionAP;
		maxHealthPoints = currentHealthPoints;
		//this.currentPosition = position; //Position will be the same as the dragon
	}

	//Template methods
	@Override
	public void position() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void healthPoints() {
		System.out.println(currentHealthPoints + "/" + maxHealthPoints);
		
	}

	@Override
	public void enemyAttackPower() {
		System.out.println(enemyAttackPower);			
	}

	@Override
	public void enemyName() {
		System.out.println(name);		
	}

	public void powerUpDrop() {} //Last battle, no drops
	public void registerObserverMinion(ObserverMinion o) {}
	public void removeObserverMinion(ObserverMinion o) {}
	public void notifyObserverMinions() {}

}
