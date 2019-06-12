package logic;

import java.util.ArrayList;

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
	
	public void Attack(int attkNr) {
		Attack playerAttack = playerMonster.getAttacks().get(attkNr);
		Attack opponentAttack = evaluateOpponentAttack();
		executeRound(playerAttack, opponentAttack);
	}
	
	private Attack evaluateOpponentAttack() {
		int attkId = (int)Math.floor(Math.random() * 2);
		System.out.println(attkId);
		Attack opponentAttack = opponentMonster.getAttacks().get(attkId);
		return opponentAttack;
	}
	
	private void executeRound(Attack playerAttack, Attack opponentAttack) {
		if (playerMonster.getData().getInitiative() > opponentMonster.getData().getInitiative()) {
			executeAttack(playerAttack, true);
			executeAttack(opponentAttack, false);
		} else if (playerMonster.getData().getInitiative() > opponentMonster.getData().getInitiative()) {
			executeAttack(opponentAttack, false);
			executeAttack(playerAttack, true);
		} else {
			// If the Monsters have the same initiative, a random Monster will be picked
			int initiative = (int)Math.floor(Math.random() * 2);
			if (initiative == 0) {
				executeAttack(playerAttack, true);
				executeAttack(opponentAttack, false);
			} else {
				executeAttack(opponentAttack, false);
				executeAttack(playerAttack, true);
			}
		}
	}
	
	private void executeAttack(Attack attack, boolean isPlayer) {
		
	}

	/*
	 * public Monster getMonsterById() { Monster monster;
	 * 
	 * return monster; }
	 */

}
