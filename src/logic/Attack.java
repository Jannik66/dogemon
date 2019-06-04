package logic;

import dto.AttackDTO;

public class Attack {

	AttackDTO data;

	public Attack(AttackDTO data) {
		this.data = data;
	}

	public AttackDTO getData() {
		return data;
	}

}
