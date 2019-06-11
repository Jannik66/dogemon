package logic;

import java.util.ArrayList;
import java.util.List;

import dto.MonsterDTO;

public class Monster {

	MonsterDTO data;
	ArrayList<Attack> Attacks = new ArrayList<Attack>();

	public Monster(MonsterDTO data) {
		this.data = data;
	}

	public void setAttacks(ArrayList<Attack> attacks) {
		List<Integer> attackids = data.getAttackids();
		for (Attack attack : attacks) {
			if (attack.getData().getId() == attackids.get(0) || attack.getData().getId() == attackids.get(1)) {
				Attacks.add(attack);
			}
		}
	}

	public ArrayList<Attack> getAttacks() {
		return Attacks;
	}

	public MonsterDTO getData() {
		return data;
	}

}
