package game.action;

import game.unit.Unit;

public class Heal extends Action{
	public int amount;
	
	public Heal(String name, String description,int amount) {
		super.setName(name);
		super.setDesc(description);
		super.setId(2);
		this.amount = amount;
	}
	
	public boolean heal(Unit target) {
		if(!(target.getCurrHp() == target.getMaxHp())) {
			target.setCurrHp(target.getCurrHp()+this.amount >= target.getMaxHp() ? target.getMaxHp() : target.getCurrHp()+this.amount);
			return true;
		}
		else {
			return false;
		}
	}
}
