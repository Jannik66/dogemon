package dto;

import java.util.List;

public class MonsterDTO {
	private int id;
	private String name;
	private int hp;
	private int maxHp;
	private int attackpower;
	private int defensepower;
	private int initiative;
	private String picturefrontpath;
	private String picturebackpath;
	private List<Integer> attackids;

	public MonsterDTO(int id, String name, int hp, int maxHp, int attackpower, int defensepower, int initiative,
			String picturefrontpath, String picturebackpath, List<Integer> attackids2) {
		this.id = id;
		this.name = name;
		this.hp = hp;
		this.maxHp = maxHp;
		this.attackpower = attackpower;
		this.defensepower = defensepower;
		this.initiative = initiative;
		this.picturefrontpath = picturefrontpath;
		this.picturebackpath = picturebackpath;
		this.attackids = attackids2;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getMaxHp() {
		return maxHp;
	}

	public int getAttackpower() {
		return attackpower;
	}

	public void setAttackpower(int attackpower) {
		this.attackpower = attackpower;
	}

	public int getDefensepower() {
		return defensepower;
	}

	public void setDefensepower(int defensepower) {
		this.defensepower = defensepower;
	}

	public int getInitiative() {
		return initiative;
	}

	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}

	public List<Integer> getAttackids() {
		return attackids;
	}

	public void setAttackids(List<Integer> attackids) {
		this.attackids = attackids;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPicturefrontpath() {
		return picturefrontpath;
	}
	
	public String getPicturebackpath() {
		return picturebackpath;
	}
}
