package btp600Assignment2.Weapons;

public abstract class SwordDecorator implements Weapon {
	protected Weapon decoratedWeapon;
	
	public SwordDecorator() {}
	
	public SwordDecorator(Weapon decoratedWeapon) {
		this.decoratedWeapon = decoratedWeapon;
	}
	
	public String getWeaponPowerUp() {
		return decoratedWeapon.getWeaponPowerUp();
	}
	
	public int getAttackPower() {
		return decoratedWeapon.getAttackPower();
	}
}
