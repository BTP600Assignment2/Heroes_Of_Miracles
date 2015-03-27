package btp600Assignment2.Weapons;

public class LifeSteal extends SwordDecorator implements PowerUpStrategy {
	
	public LifeSteal() {}

	public LifeSteal(Weapon decoratedWeapon) {
		super(decoratedWeapon);
		System.out.println("Equipping life steal to weapon, that restores health points with each hit...");
	}
	
	public String getWeaponPowerUp() {		
		return decoratedWeapon.getWeaponPowerUp() + "(LifeSteal)";
	}
	
	public int getAttackPower() {
		return decoratedWeapon.getAttackPower() + 2;
	}

	public void displayWeapon() {
		System.out.println(decoratedWeapon.getWeaponPowerUp() + "(LifeSteal)");	
	}

	public void displayAttackPower() {
		System.out.println(decoratedWeapon.getAttackPower() + 2);
	}

	public String displayPowerUp() {
		return "Lifesteal";
	}
}
