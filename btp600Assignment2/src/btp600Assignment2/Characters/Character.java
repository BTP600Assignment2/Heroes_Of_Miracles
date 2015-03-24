package btp600Assignment2.Characters;

public abstract class Character {
	
	final void regularCommand() {
		
	}
	boolean characterMoves() { return false; }
	boolean characterOpensItemMenu() { return false; }
	
	final void battleCommand() {
		
	}
	boolean characterAttacks() { return false; }
	boolean characterRetreats() { return false; }
	boolean characterHeals() { return false; }
	
	public abstract void actionMenu();
	public abstract void position();
	public abstract void weapon();
	public abstract void healthPoints();
	public abstract void characterName();
	public abstract void navigationController();
	public abstract void battleController();
	public abstract void enemyOpponent();
}
