package logic;

import java.util.ArrayList;

import dto.MonsterDTO;

public class Monster {

	MonsterDTO data;
	ArrayList<Attack> Attacks;

	public Monster(MonsterDTO data, ArrayList<Attack> attacks) {
		this.data = data;
		setAttacks(attacks);
	}

	private void setAttacks(ArrayList<Attack> attacks) {
		// List<Integer> attackids = data.getAttackids();
		// TODO: Add Attacks to Monster
	}

	public ArrayList<Attack> getAttacks() {
		return Attacks;
	}

	public MonsterDTO getData() {
		return data;
	}

}
