package btp600Assignment2.Weapons;


public class Sword implements Weapon { //The basic default sword equipped for Damian, meele hero

	public String getWeaponPowerUp() {
		return "Kingslayer";
	}

	public int getAttackPower() {
		return 3;
	}

	public void displayWeapon() {
		System.out.println("Kingslayer");		
	}

	public void displayAttackPower() {
		System.out.println(3);	
	}

}
