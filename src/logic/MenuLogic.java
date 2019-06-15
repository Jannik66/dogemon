package logic;

import java.util.ArrayList;

import data.AttackDAO;
import data.MonsterDAO;
import dto.AttackDTO;
import dto.MonsterDTO;

public class MenuLogic {

	ArrayList<MonsterDTO> MonsterDTOs;
	ArrayList<Monster> Monsters = new ArrayList<Monster>();

	ArrayList<AttackDTO> AttackDTOs;
	ArrayList<Attack> Attacks = new ArrayList<Attack>();

	public MenuLogic() {
		createMonsters();
		createAttacks();
		setAttacks();
	}

	private void createMonsters() {
		
		MonsterDAO MonsterDataAccessObject = new MonsterDAO();
		
		MonsterDTOs = MonsterDataAccessObject.getAllMonsters();
		for (MonsterDTO monster : MonsterDTOs) {
			Monsters.add(new Monster(monster));
		}

	}
	
	private void createAttacks() {

		AttackDAO AttackDataAccessObject = new AttackDAO();

		AttackDTOs = AttackDataAccessObject.getAllAttacks();

		for (AttackDTO attack : AttackDTOs) {
			Attacks.add(new Attack(attack));
		}
	}

	private void setAttacks() {
		for (Monster monster : Monsters) {
			monster.setAttacks(Attacks);
		}
	}

	public ArrayList<Monster> getAllMonsters() {
		return Monsters;
	}
	
	public ArrayList<Attack> getAllAttacks() {
		return Attacks;
	}

}
