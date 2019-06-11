package logic;

import java.util.ArrayList;
import java.util.List;

import data.AttackDAO;
import data.MonsterDAO;
import dto.AttackDTO;
import dto.MonsterDTO;

public class BattleLogic {

	ArrayList<AttackDTO> AttackDTOs;
	ArrayList<Attack> Attacks = new ArrayList<Attack>();
	Monster playerMonster;
	Monster opponentMonster;

	public BattleLogic(int MonsterId, ArrayList<Monster> monsters) {
		createAttacks();
		definePlayer(MonsterId, monsters);
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

	private void definePlayer(int MonsterId, ArrayList<Monster> monsters) {
		for (Monster monster : monsters) {
			if (monster.getData().getId() == MonsterId) {
				this.playerMonster = monster;
			}
		}
	}

	private void defineOpponent() {
		// TODO: define Opponent
	}

	private void setAttacks() {
		playerMonster.setAttacks(Attacks);
		// opponentMonster.setAttacks(Attacks);
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
