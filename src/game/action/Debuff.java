package game.action;

import game.unit.Unit;

public class Debuff extends Action{
	private int debuff;
	private int buffType; // 1 == Speed, 2 == Atk
	
	public Debuff(String name, String description,int buffType,int debuff) {
		super.setName(name);
		super.setDesc(description);
		super.setId(4);
		this.buffType = buffType;
		this.debuff = debuff;
	}
	
	public void debuffAtk(Unit target) {
		if(this.buffType == 1) {
			target.setSpd(target.getSpd()-this.debuff);
		}
		if(this.buffType == 2) {
			target.setAtk(target.getAtk()-this.debuff);
		}
	}
	
	
}
