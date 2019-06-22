package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import logic.Monster;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import gui.MainStage;

public class Selection {

	@FXML
	private Label InfoName;
	@FXML
	private Label InfoHP;
	@FXML
	private Label InfoAttk;
	@FXML
	private Label InfoDef;
	@FXML
	private Label InfoInit;
	@FXML
	private Label InfoAttack1;
	@FXML
	private Label InfoAttack2;
	@FXML
	private ImageView MonsterLogo0;
	@FXML
	private ImageView MonsterLogo1;
	@FXML
	private ImageView MonsterLogo2;
	@FXML
	private ImageView MonsterLogo3;
	@FXML
	private ImageView MonsterLogo4;
	@FXML
	private ImageView MonsterLogo5;
	@FXML
	private ImageView MonsterLogo6;
	@FXML
	private ImageView MonsterLogo7;
	@FXML
	private ImageView MonsterLogo8;

	private MainStage mainStage;

	private ArrayList<Monster> Monsters;

	public Selection() {

		try {
			@SuppressWarnings("unused")
			final Font Pixelfont = Font.loadFont(new FileInputStream(new File("./src/gui/Pixel-UniCode.ttf")), 25);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	@FXML
	private void initialize() {
	}

	public void initSelection() {
		NoInfo();
		MonsterLogo0.setImage(new Image("file:" + Monsters.get(0).getData().getPicturelogopath()));
		MonsterLogo1.setImage(new Image("file:" + Monsters.get(1).getData().getPicturelogopath()));
		MonsterLogo2.setImage(new Image("file:" + Monsters.get(2).getData().getPicturelogopath()));
		MonsterLogo3.setImage(new Image("file:" + Monsters.get(3).getData().getPicturelogopath()));
		MonsterLogo4.setImage(new Image("file:" + Monsters.get(4).getData().getPicturelogopath()));
		MonsterLogo5.setImage(new Image("file:" + Monsters.get(5).getData().getPicturelogopath()));
		MonsterLogo6.setImage(new Image("file:" + Monsters.get(6).getData().getPicturelogopath()));
		MonsterLogo7.setImage(new Image("file:" + Monsters.get(7).getData().getPicturelogopath()));
		MonsterLogo8.setImage(new Image("file:" + Monsters.get(8).getData().getPicturelogopath()));
	}

	public void setMainStage(MainStage mainStage) {
		this.mainStage = mainStage;
		Monsters = mainStage.getAllMonsters();
	}

	@FXML
	private void Select0() {
		mainStage.initializeBattleLogic(0);
		mainStage.showBattleGUI();
	}

	@FXML
	private void Select1() {
		mainStage.initializeBattleLogic(1);
		mainStage.showBattleGUI();
	}

	@FXML
	private void Select2() {
		mainStage.initializeBattleLogic(2);
		mainStage.showBattleGUI();
	}

	@FXML
	private void Select3() {
		mainStage.initializeBattleLogic(3);
		mainStage.showBattleGUI();
	}

	@FXML
	private void Select4() {
		mainStage.initializeBattleLogic(4);
		mainStage.showBattleGUI();
	}

	@FXML
	private void Select5() {
		mainStage.initializeBattleLogic(5);
		mainStage.showBattleGUI();
	}

	@FXML
	private void Select6() {
		mainStage.initializeBattleLogic(6);
		mainStage.showBattleGUI();
	}

	@FXML
	private void Select7() {
		mainStage.initializeBattleLogic(7);
		mainStage.showBattleGUI();
	}

	@FXML
	private void Select8() {
		mainStage.initializeBattleLogic(8);
		mainStage.showBattleGUI();
	}

	@FXML
	private void Info0() {
		int x = 0;
		InfoName.setText(Monsters.get(x).getData().getName());
		InfoHP.setText(Monsters.get(x).getData().getMaxHp() + "");
		InfoAttk.setText(Monsters.get(x).getData().getAttackpower() + "");
		InfoDef.setText(Monsters.get(x).getData().getDefensepower() + "");
		InfoInit.setText(Monsters.get(x).getData().getInitiative() + "");
		InfoAttack1.setText(Monsters.get(x).getAttacks().get(0).getData().getName());
		InfoAttack2.setText(Monsters.get(x).getAttacks().get(1).getData().getName());
	}

	@FXML
	private void Info1() {
		int x = 1;
		InfoName.setText(Monsters.get(x).getData().getName());
		InfoHP.setText(Monsters.get(x).getData().getMaxHp() + "");
		InfoAttk.setText(Monsters.get(x).getData().getAttackpower() + "");
		InfoDef.setText(Monsters.get(x).getData().getDefensepower() + "");
		InfoInit.setText(Monsters.get(x).getData().getInitiative() + "");
		InfoAttack1.setText(Monsters.get(x).getAttacks().get(0).getData().getName());
		InfoAttack2.setText(Monsters.get(x).getAttacks().get(1).getData().getName());
	}

	@FXML
	private void Info2() {
		int x = 2;
		InfoName.setText(Monsters.get(x).getData().getName());
		InfoHP.setText(Monsters.get(x).getData().getMaxHp() + "");
		InfoAttk.setText(Monsters.get(x).getData().getAttackpower() + "");
		InfoDef.setText(Monsters.get(x).getData().getDefensepower() + "");
		InfoInit.setText(Monsters.get(x).getData().getInitiative() + "");
		InfoAttack1.setText(Monsters.get(x).getAttacks().get(0).getData().getName());
		InfoAttack2.setText(Monsters.get(x).getAttacks().get(1).getData().getName());
	}

	@FXML
	private void Info3() {
		int x = 3;
		InfoName.setText(Monsters.get(x).getData().getName());
		InfoHP.setText(Monsters.get(x).getData().getMaxHp() + "");
		InfoAttk.setText(Monsters.get(x).getData().getAttackpower() + "");
		InfoDef.setText(Monsters.get(x).getData().getDefensepower() + "");
		InfoInit.setText(Monsters.get(x).getData().getInitiative() + "");
		InfoAttack1.setText(Monsters.get(x).getAttacks().get(0).getData().getName());
		InfoAttack2.setText(Monsters.get(x).getAttacks().get(1).getData().getName());
	}

	@FXML
	private void Info4() {
		int x = 4;
		InfoName.setText(Monsters.get(x).getData().getName());
		InfoHP.setText(Monsters.get(x).getData().getMaxHp() + "");
		InfoAttk.setText(Monsters.get(x).getData().getAttackpower() + "");
		InfoDef.setText(Monsters.get(x).getData().getDefensepower() + "");
		InfoInit.setText(Monsters.get(x).getData().getInitiative() + "");
		InfoAttack1.setText(Monsters.get(x).getAttacks().get(0).getData().getName());
		InfoAttack2.setText(Monsters.get(x).getAttacks().get(1).getData().getName());
	}

	@FXML
	private void Info5() {
		int x = 5;
		InfoName.setText(Monsters.get(x).getData().getName());
		InfoHP.setText(Monsters.get(x).getData().getMaxHp() + "");
		InfoAttk.setText(Monsters.get(x).getData().getAttackpower() + "");
		InfoDef.setText(Monsters.get(x).getData().getDefensepower() + "");
		InfoInit.setText(Monsters.get(x).getData().getInitiative() + "");
		InfoAttack1.setText(Monsters.get(x).getAttacks().get(0).getData().getName());
		InfoAttack2.setText(Monsters.get(x).getAttacks().get(1).getData().getName());
	}

	@FXML
	private void Info6() {
		int x = 6;
		InfoName.setText(Monsters.get(x).getData().getName());
		InfoHP.setText(Monsters.get(x).getData().getMaxHp() + "");
		InfoAttk.setText(Monsters.get(x).getData().getAttackpower() + "");
		InfoDef.setText(Monsters.get(x).getData().getDefensepower() + "");
		InfoInit.setText(Monsters.get(x).getData().getInitiative() + "");
		InfoAttack1.setText(Monsters.get(x).getAttacks().get(0).getData().getName());
		InfoAttack2.setText(Monsters.get(x).getAttacks().get(1).getData().getName());
	}

	@FXML
	private void Info7() {
		int x = 7;
		InfoName.setText(Monsters.get(x).getData().getName());
		InfoHP.setText(Monsters.get(x).getData().getMaxHp() + "");
		InfoAttk.setText(Monsters.get(x).getData().getAttackpower() + "");
		InfoDef.setText(Monsters.get(x).getData().getDefensepower() + "");
		InfoInit.setText(Monsters.get(x).getData().getInitiative() + "");
		InfoAttack1.setText(Monsters.get(x).getAttacks().get(0).getData().getName());
		InfoAttack2.setText(Monsters.get(x).getAttacks().get(1).getData().getName());
	}

	@FXML
	private void Info8() {
		int x = 8;
		InfoName.setText(Monsters.get(x).getData().getName());
		InfoHP.setText(Monsters.get(x).getData().getMaxHp() + "");
		InfoAttk.setText(Monsters.get(x).getData().getAttackpower() + "");
		InfoDef.setText(Monsters.get(x).getData().getDefensepower() + "");
		InfoInit.setText(Monsters.get(x).getData().getInitiative() + "");
		InfoAttack1.setText(Monsters.get(x).getAttacks().get(0).getData().getName());
		InfoAttack2.setText(Monsters.get(x).getAttacks().get(1).getData().getName());
	}

	@FXML
	private void NoInfo() {
		InfoName.setText("Info");
		InfoHP.setText("0");
		InfoAttk.setText("0");
		InfoDef.setText("0");
		InfoInit.setText("0");
		InfoAttack1.setText("");
		InfoAttack2.setText("");
	}
}
