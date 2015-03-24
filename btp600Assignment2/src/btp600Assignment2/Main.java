package btp600Assignment2;

import btp600Assignment2.Characters.Character;
import btp600Assignment2.Characters.Warrior;
import btp600Assignment2.Weapons.*;

public class Main {

	public static void main(String[] args) {
		Character hero = new Warrior();
		hero.characterName();
		hero.healthPoints();
		
		Weapon weapon = new Fire(new LifeSteal(new Sword()));
		weapon.displayWeapon();
		weapon.displayAttackPower();
	}

}
