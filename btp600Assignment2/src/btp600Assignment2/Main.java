package btp600Assignment2;

import btp600Assignment2.Characters.*;
import btp600Assignment2.Characters.Character;
import btp600Assignment2.Enemies.*;
import btp600Assignment2.Weapons.*;

public class Main {

	public static void main(String[] args) {
		Character hero = new Warrior();
		System.out.println(hero.characterName());
		System.out.println(hero.healthPoints());
		System.out.print("\n");
		//Check out netbeans for IDE
		
		//I think the game should decorate the weapon power ups rather than inside the hero character because the hero is doing
		//too much.
		
		Weapon weapon = new Sword(); //This one is default and a must have
		hero.addWeaponPowerUp(weapon); //character needs a method to add a powerup/weapon
		System.out.println(hero.weaponEquippedNames()); //character needs a method to know which powerup he is using
		System.out.println(hero.weaponEquippedAttackPower());
		hero.collectedPowerUps(); //Returns an ArrayList of collected weapons from enemies killed. Character should have a collection of weapons he owns, so user can pick and choose to equip
		
		//Weapon weapon = new Fire(new LifeSteal(new Sword()));
		//System.out.println(weapon.displayWeapon());
		//System.out.println(weapon.displayAttackPower());
		
		System.out.print("\n");
		
		Enemy dragonKnight = new DragonKnight();
		System.out.println(dragonKnight.enemyName());
		System.out.println(dragonKnight.healthPoints());
		System.out.println(dragonKnight.enemyAttackPower());
		System.out.println(dragonKnight.powerUpDrop()); //randomly weapon power up drop assigned
		System.out.print("\n");
		
		Enemy dragon = new Dragon();
		System.out.println(dragon.enemyName());
		System.out.println(dragon.healthPoints());
		System.out.println(dragon.enemyAttackPower());
		//dragon.enemyBoss(); //boolean, use to check if this is the boss, final battle
		System.out.print("\n");
		
		Enemy drake = new Drake(dragon);
		((Dragon) dragon).spawnsDrakes(45); //Calculate a hp threshold and use that hp instead of this number
		System.out.println(drake.enemyName());
		System.out.println(drake.healthPoints());
		System.out.println(drake.enemyAttackPower());
		System.out.print("\n");
	}

}
