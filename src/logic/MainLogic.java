package logic;

import java.util.ArrayList;

import data.AttackDAO;
import data.MonsterDAO;
import dto.AttackDTO;
import dto.MonsterDTO;

public class MainLogic {

	ArrayList<MonsterDTO> MonsterDTOs;
	ArrayList<AttackDTO> AttackDTOs;
	ArrayList<Monster> Monsters;
	ArrayList<Attack> Attacks;

	public void loadData() {
		createAttacks();
		createMonsters();
	}

	private void createAttacks() {
		ArrayList<AttackDTO> AttackDTOs = AttackDAO.getAllAttacks();

		for (AttackDTO attack : AttackDTOs) {
			Attacks.add(new Attack(attack));
		}
	}

	private void createMonsters() {
		ArrayList<MonsterDTO> MonsterDTOs = MonsterDAO.getAllMonsters();

		for (MonsterDTO monster : MonsterDTOs) {
			Monsters.add(new Monster(monster, Attacks));
		}

	}

	public ArrayList<Monster> getAllMonsters() {
		return Monsters;
	}

	/*
	 * public Monster getMonsterById() { Monster monster;
	 * 
	 * return monster; }
	 */

}
