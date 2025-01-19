package game.unit;

public class Attacker extends Unit{
	
	public Attacker(String name,int id, int maxHp, int atk, int spd) {
		super.setName(name);
		super.setId(id);
		super.setMaxHp(maxHp);
		super.setAtk(atk);
		super.setSpd(spd);
	}
}
