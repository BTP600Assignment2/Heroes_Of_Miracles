package btp600Assignment2.Characters;

import btp600Assignment2.BattleController;
import btp600Assignment2.Enemies.*;
import btp600Assignment2.NavigateController;
import btp600Assignment2.Position;
import btp600Assignment2.Weapons.Weapon;

public class Warrior extends Character {
	//needs return methods to display what it is
	private Position currentPosition; 
	private Weapon equippedWeapon;
	private int currentHealthPoints = 100;
	private String name = "Damian";
	private Enemy currentEnemy;
	
	//receives the move commands, send for calc. and return the results
	NavigateController navigateController; 
	BattleController battleController;

	@Override
	public void actionMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void position() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void weapon() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void healthPoints() {
		System.out.println(currentHealthPoints +  "/100");		
	}

	@Override
	public void characterName() {
		System.out.println(name);
		
	}

	@Override
	public void navigationController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void battleController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enemyOpponent() {
		// TODO Auto-generated method stub
		
	}

}
