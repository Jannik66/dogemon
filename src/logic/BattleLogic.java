package logic;

import java.util.ArrayList;

import data.AttackDAO;
import data.MonsterDAO;
import dto.AttackDTO;
import dto.MonsterDTO;

public class BattleLogic {

	MenuLogic menulogic;
	ArrayList<AttackDTO> AttackDTOs;
	ArrayList<Attack> Attacks = new ArrayList<Attack>();
	Monster playerMonster;
	Monster opponentMonster;

	public BattleLogic(MenuLogic menulogic, Monster playerMonster) {
		this.menulogic = menulogic;
		this.playerMonster = playerMonster;
		this.opponentMonster = opponentMonster;
		createAttacks();
		defineOpponent();
		setAttacks();
	}

	private void createAttacks() {

		AttackDAO AttackDataAccessObject = new AttackDAO();

		AttackDTOs = AttackDataAccessObject.getAllAttacks();

		for (AttackDTO attack : AttackDTOs) {
			Attacks.add(new Attack(attack));
		}
	}
	
	private void defineOpponent() {
		// TODO: define Opponent
	}

	private void setAttacks() {
		playerMonster.setAttacks(Attacks);
		//opponentMonster.setAttacks(Attacks);
	}

	public Monster getPlayerMonster() {
		return playerMonster;
	}

	public Monster getOpponentMonster() {
		return opponentMonster;
	}

	/*
	 * public Monster getMonsterById() { Monster monster;
	 * 
	 * return monster; }
	 */

}
