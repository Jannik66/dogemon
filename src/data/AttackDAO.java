package data;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import dto.AttackDTO;

import org.json.JSONArray;
import org.json.JSONObject;

public class AttackDAO {

	private ArrayList<AttackDTO> Monsters = new ArrayList<AttackDTO>();

	public AttackDAO() {
		String contents;
		try {
			contents = new String(Files.readAllBytes(Paths.get("./staticdata/attackdata.json")), StandardCharsets.UTF_8);
			JSONObject obj = new JSONObject(contents);

			JSONArray arr = obj.getJSONArray("attacks");
			for (int i = 0; i < arr.length(); i++) {
				int monster_id = arr.getJSONObject(i).getInt("id");
				String name = arr.getJSONObject(i).getString("name");
				int targetmonster = arr.getJSONObject(i).getInt("targetmonster");
				int impact = arr.getJSONObject(i).getInt("impact");
				String imagepath = arr.getJSONObject(i).getString("imagepath");
				
				Monsters.add(new AttackDTO(monster_id, name, targetmonster, impact, imagepath));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<AttackDTO> getAllAttacks() {
		return Monsters;
	}
	
}
