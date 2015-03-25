package btp600Assignment2;

import btp600Assignment2.Characters.*;
import btp600Assignment2.Characters.Character;
import btp600Assignment2.Enemies.*;
import btp600Assignment2.Weapons.*;

public class Main {

	public static void main(String[] args) {
		Character hero = new Warrior();
		hero.characterName();
		hero.healthPoints();
		System.out.print("\n");
		
		Weapon weapon = new Fire(new LifeSteal(new Sword()));
		weapon.displayWeapon();
		weapon.displayAttackPower();
		System.out.print("\n");
		
		Enemy dragonKnight = new DragonKnight();
		dragonKnight.enemyName();
		dragonKnight.healthPoints();
		dragonKnight.enemyAttackPower();
		dragonKnight.powerUpDrop(); //randomly weapon power up drop assigned
		System.out.print("\n");
		
		Enemy dragon = new Dragon();
		dragon.enemyName();
		dragon.healthPoints();
		dragon.enemyAttackPower();
		//dragon.enemyBoss(); //boolean, use to check if this is the boss, final battle
		System.out.print("\n");
		
		Enemy drake = new Drake(dragon);
		((Dragon) dragon).spawnsDrakes(10); //Calculate a hp threshold and use that hp instead of this number
		drake.enemyName();
		drake.healthPoints();
		drake.enemyAttackPower();
		System.out.print("\n");
	}

}
