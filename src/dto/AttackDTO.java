package dto;

public class AttackDTO {
	private int id;
	private String name;
	private String targetmonster;
	private String targetstat;
	private int impact;
	private String picturepath;

	public AttackDTO(int id, String name, String targetmonster, String targetstat, int impact, String picturepath) {
		this.id = id;
		this.name = name;
		this.targetmonster = targetmonster;
		this.targetstat = targetstat;
		this.impact = impact;
		this.picturepath = picturepath;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getTargetmonster() {
		return targetmonster;
	}

	public String getTargetstat() {
		return targetstat;
	}

	public int getImpact() {
		return impact;
	}

	public String getPicturePath() {
		return picturepath;
	}

}
