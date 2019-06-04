package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

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
	
	public Battle() {
		
		try {
		final Font Pixelfont = Font.loadFont(new FileInputStream(new File("./Pixel-UniCode.ttf")),25);
		PlayerHP.setFont(Pixelfont);
		PlayerName.setFont(Pixelfont);
		OpponentHP.setFont(Pixelfont);
		OpponentName.setFont(Pixelfont);
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
