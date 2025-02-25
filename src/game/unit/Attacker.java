package game.unit;

public class Attacker extends Unit{
	
	public Attacker(String name,int id, int maxHp, int atk, int spd) {
		super.setName(name);
		super.setId(id);
		super.setMaxHp(maxHp);
		super.setAtk(atk);
		super.setSpd(spd);
		super.setType(1);
	}
	public Attacker(String name,int id, int maxHp, int atk, int spd, boolean isEnemy) {
		super.setName(name);
		super.setId(id);
		super.setMaxHp(maxHp);
		super.setAtk(atk);
		super.setSpd(spd);
		super.setType(1);
		super.setEnemy(isEnemy);
	}
}
