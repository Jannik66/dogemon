package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import gui.MainStage;

public class Battle {

	@FXML
	private Label PlayerHP;
	@FXML
	private Label PlayerName;
	
	@FXML
	private Label OpponentHP;
	@FXML
	private Label OpponentName;
	
	private MainStage mainStage;
	
	public Battle(){
		
	}
	
	@FXML
	private void initialize(){
		
	}
	
	public void setMainStage(MainStage mainStage) {
		this.mainStage = mainStage;
	}
	
	@FXML
	private void Attk1() {
		System.out.println("Zack!");
	}
	
	@FXML
	private void Attk2() {
		System.out.println("Bätsch!");
	}
	
	@FXML
	private void Surrender() {
		System.out.println("Runs away");
		mainStage.showBattleGUI();
	}
	
	
}
