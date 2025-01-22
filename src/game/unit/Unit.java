package game.unit;

import java.util.ArrayList;

import game.action.Action;

public class Unit {
	private String name;
	private int type;
	private int id;
	private int maxHp;
	private int currHp;
	private int atk;
	private int spd;
	private boolean status;
	private ArrayList<Action> actions;
	private boolean isEnemy = false;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	public int getCurrHp() {
		return currHp;
	}
	public void setCurrHp(int currHp) {
		this.currHp = currHp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getSpd() {
		return spd;
	}
	public void setSpd(int spd) {
		this.spd = spd;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isEnemy() {
		return isEnemy;
	}
	public void setEnemy(boolean isEnemy) {
		this.isEnemy = isEnemy;
	}
	public ArrayList<Action> getActions() {
		return actions;
	}
	public void setActions(ArrayList<Action> actions) {
		this.actions = actions;
	}
	public boolean learnAction(Action action) {
		if(this.actions.size() < 4) {
			this.actions.add(action);
			return true;
		}
		else {
			return false;
		}
	}
}
