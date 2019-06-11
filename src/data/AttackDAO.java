package data;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import dto.AttackDTO;

import org.json.JSONArray;
import org.json.JSONObject;

public class AttackDAO {

	private static JSONArray arr;

	public AttackDAO() {
		String contents;
		try {
			contents = new String(Files.readAllBytes(Paths.get("./staticdata/attackdata.json")),
					StandardCharsets.UTF_8);
			JSONObject obj = new JSONObject(contents);

			arr = obj.getJSONArray("attacks");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}	

	public ArrayList<AttackDTO> getAllAttacks() {
		ArrayList<AttackDTO> AttackDTOs = new ArrayList<AttackDTO>();
		for (int i = 0; i < arr.length(); i++) {
			int monster_id = arr.getJSONObject(i).getInt("id");
			String name = arr.getJSONObject(i).getString("name");
			String targetmonster = arr.getJSONObject(i).getString("targetmonster");
			int impact = arr.getJSONObject(i).getInt("impact");
			String imagepath = arr.getJSONObject(i).getString("imagepath");

			AttackDTOs.add(new AttackDTO(monster_id, name, targetmonster, impact, imagepath));
		}
		
		return AttackDTOs;
	}

}
