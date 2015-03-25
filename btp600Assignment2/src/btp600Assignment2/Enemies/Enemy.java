package btp600Assignment2.Enemies;

public abstract class Enemy implements Subject { //Template; implements Subject so the observer can use any Template enemy
	public abstract void position();
	public abstract void healthPoints();
	public abstract void enemyAttackPower();
	public abstract void enemyName();
	public abstract void powerUpDrop();
	
	public boolean enemyBoss() { return false; }
}
