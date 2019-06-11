package logic;

import java.util.ArrayList;

import data.AttackDAO;
import data.MonsterDAO;
import dto.AttackDTO;
import dto.MonsterDTO;

public class BattleLogic {

	MenuLogic menulogic;
	ArrayList<AttackDTO> AttackDTOs;
	ArrayList<Attack> Attacks;

	public BattleLogic(MenuLogic menulogic) {
		this.menulogic = menulogic;
		createAttacks();
		//setAttacks();
	}

	private void createAttacks() {
		ArrayList<AttackDTO> AttackDTOs = AttackDAO.getAllAttacks();

		for (AttackDTO attack : AttackDTOs) {
			Attacks.add(new Attack(attack));
		}
	}
	
	/*private void setAttacks() {
		ArrayList<Monster> monsters = menulogic.getAllMonsters();
	}*/

	/*
	 * public Monster getMonsterById() { Monster monster;
	 * 
	 * return monster; }
	 */

}
