package data;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import dto.MonsterDTO;

import org.json.JSONArray;
import org.json.JSONObject;

public class MonsterDAO {

	private static JSONArray arr;

	public MonsterDAO() {
		String content;
		try {
			content = new String(Files.readAllBytes(Paths.get("./staticdata/monsterdata.json")),
					StandardCharsets.UTF_8);
			JSONObject obj = new JSONObject(content);

			arr = obj.getJSONArray("monsters");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<MonsterDTO> getAllMonsters() {

		ArrayList<MonsterDTO> Monsters = new ArrayList<MonsterDTO>();

		for (int i = 0; i < arr.length(); i++) {
			int monster_id = arr.getJSONObject(i).getInt("id");
			String name = arr.getJSONObject(i).getString("name");
			int hp = arr.getJSONObject(i).getInt("hp");
			int attackpower = arr.getJSONObject(i).getInt("attackpower");
			int defensepower = arr.getJSONObject(i).getInt("defensepower");
			int initiative = arr.getJSONObject(i).getInt("initiative");
			String picturefrontpath = arr.getJSONObject(i).getString("picturefrontpath");
			String picturebackpath = arr.getJSONObject(i).getString("picturebackpath");
			JSONArray attackidsarray = arr.getJSONObject(i).getJSONArray("attackids");
			List<Integer> attackids = new ArrayList<Integer>();

			for (int a = 0; a < attackidsarray.length(); a++) {
				attackids.add(attackidsarray.optInt(i));
			}

			Monsters.add(new MonsterDTO(monster_id, name, hp, attackpower, defensepower, initiative, picturefrontpath,
					picturebackpath, attackids));
		}
		return Monsters;
	}
}
