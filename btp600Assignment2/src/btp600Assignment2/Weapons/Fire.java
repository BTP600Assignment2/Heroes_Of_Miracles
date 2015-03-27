package btp600Assignment2.Weapons;

public class Fire extends SwordDecorator implements PowerUpStrategy {
	
	public Fire() {}

	public Fire(Weapon decoratedWeapon) {
		super(decoratedWeapon);
		System.out.println("Equipping fire to weapon, that has area effect damage...");
	}
	
	public String getWeaponPowerUp() {		
		return decoratedWeapon.getWeaponPowerUp() + "(Fire)";
	}
	
	public int getAttackPower() {
		return decoratedWeapon.getAttackPower() + 3;
	}

	public void displayWeapon() {
		System.out.println(decoratedWeapon.getWeaponPowerUp() + "(Fire)");		
	}

	public void displayAttackPower() {
		System.out.println(decoratedWeapon.getAttackPower() + 3);		
	}

	public String displayPowerUp() {
		return "Fire";
	}
}
