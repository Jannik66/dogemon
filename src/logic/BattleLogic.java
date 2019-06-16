package logic;

import java.util.ArrayList;

import data.MonsterDAO;
import dto.MonsterDTO;

public class BattleLogic {
	
	Monster playerMonster;
	Monster opponentMonster;

	public BattleLogic(int PlayerMonsterId, ArrayList<Monster> monsters, ArrayList<Attack> attacks) {
		definePlayer(PlayerMonsterId, monsters);
		defineOpponent(PlayerMonsterId, monsters, attacks);
	}

	private void definePlayer(int MonsterId, ArrayList<Monster> monsters) {
		for (Monster monster : monsters) {
			if (monster.getData().getId() == MonsterId) {
				this.playerMonster = monster;
			}
		}
	}

	private void defineOpponent(int PlayerMonsterId, ArrayList<Monster> monsters, ArrayList<Attack> attacks) {
		int OpponentMonsterId = (int) Math.floor(Math.random() * monsters.size());

		for (Monster monster : monsters) {
			if (monster.getData().getId() == OpponentMonsterId && monster.getData().getId() != PlayerMonsterId) {
				this.opponentMonster = monster;
			} else if (monster.getData().getId() == OpponentMonsterId) {
				MonsterDAO MonsterDataAccessObject = new MonsterDAO();
				ArrayList<MonsterDTO> MonsterDTOs = MonsterDataAccessObject.getAllMonsters();
				for (MonsterDTO monsterDTO : MonsterDTOs) {
					if (monsterDTO.getId() == OpponentMonsterId) {
						this.opponentMonster = new Monster(monsterDTO);
						opponentMonster.setAttacks(attacks);
					}
				}
			}
		}
	}

	public Monster getPlayerMonster() {
		return playerMonster;
	}

	public Monster getOpponentMonster() {
		return opponentMonster;
	}

	public String Attack(int attkNr) {
		Attack playerAttack = playerMonster.getAttacks().get(attkNr);
		Attack opponentAttack = evaluateOpponentAttack();
		String output = executeRound(playerAttack, opponentAttack);
		return output;
	}

	private String executeRound(Attack playerAttack, Attack opponentAttack) {
		String output = "";
		if (playerMonster.getData().getInitiative() > opponentMonster.getData().getInitiative()) {
			output += executeAttack(playerAttack, true);
			output += "\n";
			output += "--------------------";
			output += "\n";
			output += executeAttack(opponentAttack, false);
			output += "\n";
		} else if (playerMonster.getData().getInitiative() > opponentMonster.getData().getInitiative()) {
			output += executeAttack(opponentAttack, false);
			output += "\n";
			output += "--------------------";
			output += "\n";
			output += executeAttack(playerAttack, true);
			output += "\n";
		} else {
			// If the Monsters have the same initiative, a random Monster will be picked
			int initiative = (int) Math.floor(Math.random() * 2);
			if (initiative == 0) {
				output += executeAttack(playerAttack, true);
				output += "\n";
				output += "--------------------";
				output += "\n";
				output += executeAttack(opponentAttack, false);
				output += "\n";
			} else {
				output += executeAttack(opponentAttack, false);
				output += "\n";
				output += "--------------------";
				output += "\n";
				output += executeAttack(playerAttack, true);
				output += "\n";
			}
		}
		
		return output;
	}

	private String executeAttack(Attack attack, boolean isPlayer) {
		String action = "";
		int oldValue;
		int newValue;
		int attackpower;
		int defensepower;
		int initiative;
		Monster targetMonster;
		Monster executeMonster;
		// Get impact of attack
		int impact = attack.getData().getImpact();

		// Get Targeted Monster and set values needed by the attack like attackpower, defensepower and initiative
		// First you have to check which Monster performed the attack,
		// then you have to check the targeted Monster by the attack
		if (isPlayer) {
			attackpower = playerMonster.getSpecificStat("attackpower");
			defensepower = opponentMonster.getSpecificStat("defensepower");
			initiative = opponentMonster.getSpecificStat("initiative");
			if (attack.getData().getTargetmonster().equals("opponent")) {
				targetMonster = opponentMonster;
				executeMonster = playerMonster;
			} else {
				targetMonster = playerMonster;
				executeMonster = playerMonster;
			}
		} else {
			attackpower = opponentMonster.getSpecificStat("attackpower");
			defensepower = playerMonster.getSpecificStat("defensepower");
			initiative = playerMonster.getSpecificStat("initiative");
			if (attack.getData().getTargetmonster().equals("opponent")) {
				targetMonster = playerMonster;
				executeMonster = opponentMonster;
			} else {
				targetMonster = opponentMonster;
				executeMonster = opponentMonster;
			}
		}
		
		// Set oldValue which get changed by performing the attack
		oldValue = targetMonster.getSpecificStat(attack.getData().getTargetstat());
		
		switch (attack.getData().getTargetstat()) {
		case "hp":
			if (attack.getData().getTargetmonster().equals("opponent")) {
				targetMonster.getData().setHp(oldValue - (attackpower * impact / defensepower));
				// TODO: HANDLE 0 HP
			} else {
				targetMonster.getData().setHp(oldValue + (impact));
				
				// If Hp is greater than max, set to max
				if (targetMonster.getData().getHp() > targetMonster.getData().getMaxHp()) {
					targetMonster.getData().setHp(targetMonster.getData().getMaxHp());
				}
			}
			break;
		case "attackpower":
			if (attack.getData().getTargetmonster().equals("opponent")) {
				targetMonster.getData().setAttackpower(oldValue - (attackpower / impact));
			} else {
				targetMonster.getData().setAttackpower(oldValue + (attackpower * impact));
			}
			break;
		case "defensepower":
			if (attack.getData().getTargetmonster().equals("opponent")) {
				targetMonster.getData().setAttackpower(oldValue - (defensepower / impact));
			} else {
				targetMonster.getData().setAttackpower(oldValue + (defensepower * impact));
			}
			break;
		case "initiative":
			if (attack.getData().getTargetmonster().equals("opponent")) {
				targetMonster.getData().setAttackpower(oldValue - (initiative / impact));
			} else {
				targetMonster.getData().setAttackpower(oldValue + (initiative * impact));
			}
			break;
		}
		
		newValue = targetMonster.getSpecificStat(attack.getData().getTargetstat());
		
		// OPPONENT, HP: attackpower * impact / defensepower
		// OPPONENT, attackpower: attackpower / impact
		// OPPONENT, defense: defensepower / impact
		// OPPONENT, initiative: initiative / impact
		// PLAYER, HP: impact
		// PLAYER, attackpower: attackpower * impact
		// PLAYER, defense: defensepower * impact
		// PLAYER, initiative: initiative * impact
		action += executeMonster.getData().getName() + " used " + attack.getData().getName() + ".";
		action += "\n";
		action += targetMonster.getData().getName() + "'s " + attack.getData().getTargetstat() + (newValue > oldValue ? " got increased by " : newValue == oldValue ? " stayed at " : " got decreased by ") + (newValue > oldValue ? newValue - oldValue : newValue == oldValue ? newValue : oldValue - newValue);
		return action;
	}

	private Attack evaluateOpponentAttack() {
		int attkId = (int) Math.floor(Math.random() * 2);
		Attack opponentAttack = opponentMonster.getAttacks().get(attkId);
		return opponentAttack;
	}

}
