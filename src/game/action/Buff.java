package game.action;

import game.unit.Unit;

public class Buff extends Action{
	private int buff;
	
	public Buff(String name, String description,int buff) {
		super.setName(name);
		super.setDesc(description);
		super.setId(3);
		this.buff = buff;
	}
	
	public void buff(Unit target) {
		target.setAtk(target.getAtk()+buff);
	}
}
