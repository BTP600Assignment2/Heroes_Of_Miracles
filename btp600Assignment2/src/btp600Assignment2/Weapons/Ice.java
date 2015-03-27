package btp600Assignment2.Weapons;

public class Ice extends SwordDecorator implements PowerUpStrategy {
	
	public Ice() {}

	public Ice(Weapon decoratedWeapon) {
		super(decoratedWeapon);
		System.out.println("Equipping Ice to weapon, that gives you an extra turn...");
	}
	
	public String getWeaponPowerUp() {		
		return decoratedWeapon.getWeaponPowerUp() + "(Ice)";
	}
	
	public int getAttackPower() {
		return decoratedWeapon.getAttackPower() + 1;
	}

	public void displayWeapon() {
		System.out.println(decoratedWeapon.getWeaponPowerUp() + "(Ice)");		
	}

	public void displayAttackPower() {
		System.out.println(decoratedWeapon.getAttackPower() + 1);		
	}

	public String displayPowerUp() {
		return "Ice";
	}
}
