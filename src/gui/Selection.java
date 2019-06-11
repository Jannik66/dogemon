package gui;

import javafx.fxml.FXML;
import javafx.scene.text.Font;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import gui.MainStage;

public class Selection {
	
	private MainStage mainStage;
	
	public Selection() {
		
		try {
				@SuppressWarnings("unused")
				final Font Pixelfont = Font.loadFont(new FileInputStream(new File("./src/gui/Pixel-UniCode.ttf")),25);
			} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	@FXML
	private void initialize(){
	}
	
	public void setMainStage(MainStage mainStage) {
		this.mainStage = mainStage;
	}
	
	public void initMenu() {
		//show Pictures
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
	private void Select9() {
		mainStage.initializeBattleLogic(9);
		mainStage.showBattleGUI();
	}
	
}
