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

	public BattleLogic(int PlayerMonsterId, ArrayList<Monster> monsters) {
		createAttacks();
		definePlayer(PlayerMonsterId, monsters);
		defineOpponent(PlayerMonsterId, monsters);
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

	private void defineOpponent(int PlayerMonsterId, ArrayList<Monster> monsters) {
		int OpponentMonsterId = (int)Math.floor(Math.random() * monsters.size());
		
		for (Monster monster : monsters) {
			if (monster.getData().getId() == OpponentMonsterId && monster.getData().getId() != PlayerMonsterId) {
				this.opponentMonster = monster;
			} else if (monster.getData().getId() == OpponentMonsterId) {
				MonsterDAO MonsterDataAccessObject = new MonsterDAO();
				ArrayList<MonsterDTO> MonsterDTOs = MonsterDataAccessObject.getAllMonsters();
				for (MonsterDTO monsterDTO : MonsterDTOs) {
					if (monsterDTO.getId() == OpponentMonsterId) {
						this.opponentMonster = new Monster(monsterDTO);
					}
				}
			}
		}
	}

	private void setAttacks() {
		playerMonster.setAttacks(Attacks);
		opponentMonster.setAttacks(Attacks);
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
