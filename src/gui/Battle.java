package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
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
	
	@FXML
	private ImageView ImagePlayer;
	@FXML
	private ImageView ImageOpponent;
	@FXML
	private ImageView ImageAttack1;
	@FXML
	private ImageView ImageAttack2;
	
	@FXML
	private Label Console;
	
	private MainStage mainStage;

	
	public Battle() {
		
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
	
	public void initBattle() {
		PlayerName.setText(mainStage.getPlayer().getData().getName());
		OpponentName.setText(mainStage.getOpponent().getData().getName());
	}
	
	public void editConsole(String output) {
		Console.setText(output);
	}
	
	@FXML
	private void Attk1() {
		// Attack with index 0
		String output = mainStage.Attack(0);
		editConsole(output);
	}
	
	@FXML
	private void Attk2() {
		// Attack with index 1
		String output = mainStage.Attack(1);
		editConsole(output);
	}
	
	@FXML
	private void Surrender() {
		mainStage.showEndscreenGUI(mainStage.getOpponent());
	}
	
	
}
