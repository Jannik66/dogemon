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
	
	public int getSpecificStat(String stat) {
		switch(stat) {
		case "hp":
			return data.getHp();
		case "attackpower":
			return data.getAttackpower();
		case "defensepower":
			return data.getDefensepower();
		case "initiative":
			return data.getInitiative();
		default:
			System.out.println("Error in getSpecificStat of Monster. There is no Stat called " + stat + ".");
			return 0;
		}
	}
	
	public void setSpecificStat(String stat, int value) {
		switch(stat) {
		case "hp":
			data.setHp(value);
			break;
		case "attackpower":
			data.setAttackpower(value);
			break;
		case "defensepower":
			data.setDefensepower(value);
			break;
		case "initiative":
			data.setInitiative(value);
		default:
			System.out.println("Error in setSpecificStat of Monster. There is no Stat called " + stat + ".");
			break;
		}
	}

}
