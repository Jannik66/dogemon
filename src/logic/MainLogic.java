package logic;

import java.util.ArrayList;

import data.MonsterDAO;
import dto.MonsterDTO;

public class MainLogic {
	
	ArrayList<Monster> Monsters;

	public void createMonsters() {
		ArrayList<MonsterDTO> MonsterDTOs = MonsterDAO.getAllMonsters();
		
		for (MonsterDTO monster : MonsterDTOs) {
			Monsters.add(new Monster());
		}
		
	}
	
	public ArrayList<Monster> getAllMonsters() {
		return Monsters;
	}
	
}
