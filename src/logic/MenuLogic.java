package logic;

import java.util.ArrayList;

import data.MonsterDAO;
import dto.MonsterDTO;

public class MenuLogic {

	ArrayList<MonsterDTO> MonsterDTOs;
	ArrayList<Monster> Monsters = new ArrayList<Monster>();

	public MenuLogic() {
		createMonsters();
	}

	private void createMonsters() {
		
		MonsterDAO MonsterDataAccessObject = new MonsterDAO();
		
		MonsterDTOs = MonsterDataAccessObject.getAllMonsters();
		for (MonsterDTO monster : MonsterDTOs) {
			Monsters.add(new Monster(monster));
		}

	}

	public ArrayList<Monster> getAllMonsters() {
		return Monsters;
	}

}
