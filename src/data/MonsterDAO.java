package data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import dto.MonsterDTO;

import org.json.JSONArray;
import org.json.JSONObject;

public class MonsterDAO {
	
	private ArrayList<MonsterDTO> Monsters = new ArrayList<MonsterDTO>();
	
	public MonsterDAO() {
		FileReader file;
		try {
			file = new FileReader("./staticdata/monsterdata.json");
			String data = file.read();
			System.out.println(data);
			JSONObject obj = new JSONObject(data);
			
			JSONArray arr = obj.getJSONArray("monsters");
	        for (int i = 0; i < arr.length(); i++) {
	            String post_id = arr.getJSONObject(i).getString("post_id");
	            System.out.println(post_id);
	        }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
