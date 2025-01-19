package game.action;

import game.unit.Unit;

public class Attack extends Action{
	private double accuracy;
	private int power;
	
	public Attack(String name, String description, double accuracy, int power) {
		super.setName(name);
		super.setDesc(description);
		super.setId(1);
		this.accuracy = accuracy;
		this.power = power;
	}
	public double getAccuracy() {
		return accuracy*100;
	}
	public void setAccuracy(float accuracy) {
		this.accuracy = accuracy;
	}
	public float getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	private int attackFormula(int atk, int power) {
		return power*atk;
	}
	
	private boolean hit() {
		return Math.random() <= this.accuracy;
	}
	
	public boolean attack(Unit user ,Unit target) {
		if(hit()) {
			int hpRemain = target.getCurrHp()-attackFormula(user.getAtk(), this.power);
			target.setCurrHp(hpRemain);
			return true;
		}
		else {
			return false;
		}
	}
}
