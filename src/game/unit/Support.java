package game.unit;

public class Support extends Unit {
	public Support(String name,int id, int maxHp, int atk, int spd) {
		super.setName(name);
		super.setId(id);
		super.setMaxHp(maxHp);
		super.setAtk(atk);
		super.setSpd(spd);
		super.setType(2);
	}
	public Support(String name,int id, int maxHp, int atk, int spd, boolean isEnemy) {
		super.setName(name);
		super.setId(id);
		super.setMaxHp(maxHp);
		super.setAtk(atk);
		super.setSpd(spd);
		super.setType(2);
	}
}
