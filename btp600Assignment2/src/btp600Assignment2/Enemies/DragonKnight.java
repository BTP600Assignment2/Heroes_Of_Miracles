package btp600Assignment2.Enemies;

import java.util.Random;

import btp600Assignment2.EnemyPosition;
import btp600Assignment2.Weapons.*;

public class DragonKnight extends Enemy {
	//needs return methods to display what it is
	private EnemyPosition currentPosition;
	private int currentHealthPoints = 100;
	private String name = "Dragon Knight";
	private int enemyAttackPower = 4;
	private PowerUpContext weaponPowerUpDrop;
	
	public DragonKnight() {
		Random rand = new Random();
		int randomNum = rand.nextInt((3 - 1) + 1) + 1;
		weaponPowerUpDrop = generateRandomPowerUp(randomNum);
	}
	
	public PowerUpContext generateRandomPowerUp(int randomNum) {
		switch(randomNum) {
		case 1:
			return new PowerUpContext(new Fire());
			
		case 2:
			return new PowerUpContext(new LifeSteal());
			
		default:
			return new PowerUpContext(new Ice());
			
		}
	}
	
	public boolean enemyBoss() { return false; }

	@Override
	public void position() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void healthPoints() {
		System.out.println(currentHealthPoints +  "/100");		
	}

	@Override
	public void enemyName() {
		System.out.println(name);	
	}

	@Override
	public void powerUpDrop() {
		System.out.println(weaponPowerUpDrop.displayPowerUp());	
	}

	@Override
	public void enemyAttackPower() {
		System.out.println(enemyAttackPower);		
	}

	public void registerObserverMinion(ObserverMinion o) {}
	public void removeObserverMinion(ObserverMinion o) {}
	public void notifyObserverMinions() {}

}
