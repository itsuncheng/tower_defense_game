package sample;

public class Catapult extends BasicTower{
	
	private static int _attackPower = 5;
	private static int _range = 150;
	private static int _build_cost = 5;
	private static int _upgrade_cost = 3;
	
	private int lowRange;
	private int coolDown;
	
	
	public Catapult(int _x, int _y) {
		super(_x, _y, _attackPower, _range, _build_cost, _upgrade_cost);
		
		lowRange = 50;
		coolDown = -5;
	}
	 
	public void upgrade() {
		if (coolDown >= 0)
			--coolDown;
	}
	
	public void shoot() {
		
	}
}