package dto;

/**
 * Diese Klasse dient als DTO für die Attacken.
 * 
 * @author Jannik Nötzli
 *
 */
public class AttackDTO {
	private int id;
	private String name;
	private String targetmonster;
	private String targetstat;
	private int impact;
	private String picturepath;

	/**
	 * Konstruktorklasse. Nimmt alle nötigen Parameter an und speichert diese im den
	 * Klassenparametern.
	 * 
	 * @param id            Die ID der Attacke
	 * @param name          Der Name der Attacke
	 * @param targetmonster Player oder Opponent
	 * @param targetstat    hp, attackpower oder defensepower
	 * @param impact        Impact der Attack.
	 * @param picturepath   Bild der Attacke, welches im GUI angezeigt wird.
	 */
	public AttackDTO(int id, String name, String targetmonster, String targetstat, int impact, String picturepath) {
		this.id = id;
		this.name = name;
		this.targetmonster = targetmonster;
		this.targetstat = targetstat;
		this.impact = impact;
		this.picturepath = picturepath;
	}

	/**
	 * Gibt die Id der Attacke zurück.
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Gibt den Namen der Attacke zurück.
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gibt den targetmonster Parameter der Attacke zurück.
	 * 
	 * @return targetmonster
	 */
	public String getTargetmonster() {
		return targetmonster;
	}

	/**
	 * Gibt den targetstat Parameter der Attacke zurück.
	 * 
	 * @return targetstat
	 */
	public String getTargetstat() {
		return targetstat;
	}

	/**
	 * Gibt den impact der Attacke zurück.
	 * 
	 * @return impact
	 */
	public int getImpact() {
		return impact;
	}

	/**
	 * Gibt den getPicturePath der Attacke zurück.
	 * 
	 * @return picturepath
	 */
	public String getPicturePath() {
		return picturepath;
	}

}
