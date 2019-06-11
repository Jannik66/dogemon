import java.util.ArrayList;

import logic.BattleLogic;
import logic.MenuLogic;
import logic.Monster;

public class tester {
	
	public static void main(String[] args) {
		MenuLogic menulogic = new MenuLogic();
		
		ArrayList<Monster> Monsters = menulogic.getAllMonsters();
		
		for (Monster monster : Monsters) {
			System.out.println(monster.getData().getName());
		}
		
		BattleLogic battlelogic = new BattleLogic(0);
		
		Monster player = battlelogic.getPlayerMonster();
		
		System.out.println(player.getAttacks().get(0).getData().getName());
	}
}
