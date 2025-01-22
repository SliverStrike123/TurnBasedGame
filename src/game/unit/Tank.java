package game.unit;

public class Tank extends Unit {
	public Tank(String name,int id, int maxHp, int atk, int spd) {
		super.setName(name);
		super.setId(id);
		super.setMaxHp(maxHp);
		super.setAtk(atk);
		super.setSpd(spd);
		super.setType(3);
	}
	public Tank(String name,int id, int maxHp, int atk, int spd, boolean isEnemy) {
		super.setName(name);
		super.setId(id);
		super.setMaxHp(maxHp);
		super.setAtk(atk);
		super.setSpd(spd);
		super.setType(3);
		super.setEnemy(isEnemy);
	}
}
