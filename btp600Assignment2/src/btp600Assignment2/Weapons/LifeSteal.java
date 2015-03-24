package btp600Assignment2.Weapons;

public class LifeSteal extends SwordDecorator {

	public LifeSteal(Weapon decoratedWeapon) {
		super(decoratedWeapon);
		System.out.println("Equipping life steal to weapon...");
	}
	
	public String getWeaponPowerUp() {		
		return decoratedWeapon.getWeaponPowerUp() + "(LifeSteal)";
	}
	
	public int getAttackPower() {
		return decoratedWeapon.getAttackPower() + 2;
	}

	@Override
	public void displayWeapon() {
		System.out.println(decoratedWeapon.getWeaponPowerUp() + "(LifeSteal)");	
	}

	@Override
	public void displayAttackPower() {
		System.out.println(decoratedWeapon.getAttackPower() + 2);
	}
}
