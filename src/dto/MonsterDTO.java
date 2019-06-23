package dto;

import java.util.List;

/**
 * Diese Klasse dient als DTO für die Monster.
 * 
 * @author Jannik Nötzli
 *
 */
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
	private String picturelogopath;
	private List<Integer> attackids;

	/**
	 * Konstruktorklasse. Nimmt alle nötigen Parameter an und speichert diese im den
	 * Klassenparametern.
	 * 
	 * @param id               Die ID des Monsters
	 * @param name             Der Name des Monsters
	 * @param hp               Das Leben des Monsters. Ist zu beginn gleich die
	 *                         maxHp, ändert sich aber im Verlauf des Programms
	 * @param maxHp            Das maximale Leben des Monsters
	 * @param attackpower      Die Angriffsstärke des Monsters
	 * @param defensepower     Die Verteidigunsstärke des Monsters.
	 * @param initiative       Die Initiative des Monsters.
	 * @param picturefrontpath Bilderpfad der Frontansicht des Monsters
	 * @param picturebackpath  Bilderpfad der Rückansicht des Monsters
	 * @param picturelogopath  Bilderpfad des Logos des Monsters
	 * @param attackids        ID der Attacken des Monsters
	 */
	public MonsterDTO(int id, String name, int hp, int maxHp, int attackpower, int defensepower, int initiative,
			String picturefrontpath, String picturebackpath, String picturelogopath, List<Integer> attackids) {
		this.id = id;
		this.name = name;
		this.hp = hp;
		this.maxHp = maxHp;
		this.attackpower = attackpower;
		this.defensepower = defensepower;
		this.initiative = initiative;
		this.picturefrontpath = picturefrontpath;
		this.picturebackpath = picturebackpath;
		this.picturelogopath = picturelogopath;
		this.attackids = attackids;
	}

	/**
	 * Gibt das Leben des Monsters zurück.
	 * 
	 * @return hp
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * Setzt das Leben des Monsters.
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}

	/**
	 * Gibt das maximale Leben des Monsters zurück.
	 * 
	 * @return maxHp
	 */
	public int getMaxHp() {
		return maxHp;
	}

	/**
	 * Gibt die Angriffsstärke des Monsters zurück.
	 * 
	 * @return attackpower
	 */
	public int getAttackpower() {
		return attackpower;
	}

	/**
	 * Setzt die Angriffsstärke des Monsters.
	 */
	public void setAttackpower(int attackpower) {
		this.attackpower = attackpower;
	}

	/**
	 * Gibt die Verteidigungsstärke des Monsters zurück.
	 * 
	 * @return defensepower
	 */
	public int getDefensepower() {
		return defensepower;
	}

	/**
	 * Setzt die Verteidigungsstärke des Monsters.
	 */
	public void setDefensepower(int defensepower) {
		this.defensepower = defensepower;
	}

	/**
	 * Gibt die Initiative des Monsters zurück.
	 * 
	 * @return initiative
	 */
	public int getInitiative() {
		return initiative;
	}

	/**
	 * Gibt die Attackids der Attacken des Monsters zurück
	 * 
	 * @return attackids
	 */
	public List<Integer> getAttackids() {
		return attackids;
	}

	/**
	 * Setzt die attackids des Monsters.
	 */
	public void setAttackids(List<Integer> attackids) {
		this.attackids = attackids;
	}

	/**
	 * Gibt die ID des Monsters zurück
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Gibt den Name des Monsters zurück
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gibt den Bilderpfad der Frontansicht des Monsters zurück
	 * 
	 * @return picturefrontpath
	 */
	public String getPicturefrontpath() {
		return picturefrontpath;
	}

	/**
	 * Gibt den Bilderpfad der Rückansicht des Monsters zurück
	 * 
	 * @return picturebackpath
	 */
	public String getPicturebackpath() {
		return picturebackpath;
	}

	/**
	 * Gibt den Bilderpfad des Logos des Monsters zurück
	 * 
	 * @return picturelogopath
	 */
	public String getPicturelogopath() {
		return picturelogopath;
	}
}
