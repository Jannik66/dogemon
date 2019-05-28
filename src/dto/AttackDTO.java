package dto;

public class AttackDTO {
	private int id;
	private int name;
	private int targetmonster;
	private int impact;
	private String imagepath;

	public AttackDTO(int id, int name, int targetmonster, int impact, String imagepath) {
		this.id = id;
		this.name = name;
		this.targetmonster = targetmonster;
		this.impact = impact;
		this.imagepath = imagepath;
	}

	public int getId() {
		return id;
	}

	public int getName() {
		return name;
	}

	public int getTargetmonster() {
		return targetmonster;
	}

	public int getImpact() {
		return impact;
	}

	public String getImagepath() {
		return imagepath;
	}

}
