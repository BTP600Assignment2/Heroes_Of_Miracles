package btp600Assignment2.Weapons;


public class Sword implements Weapon { //The basic default sword equipped for Damian, meele hero

	@Override
	public String getWeaponPowerUp() {
		return "Kingslayer";
	}

	@Override
	public int getAttackPower() {
		return 3;
	}

	@Override
	public void displayWeapon() {
		System.out.println("Kingslayer");		
	}

	@Override
	public void displayAttackPower() {
		System.out.println(3);	
	}

}
