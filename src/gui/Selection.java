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
	
	@FXML
	private void Select1() {
		System.out.println("I coose you!");
		mainStage.showBattleGUI();
	}
	
	@FXML
	private void Select2() {
		System.out.println("I coose you!");
		mainStage.showBattleGUI();
	}
	
	@FXML
	private void Select3() {
		System.out.println("I coose you!");
		mainStage.showBattleGUI();
	}
	
	@FXML
	private void Select4() {
		System.out.println("I coose you!");
		mainStage.showBattleGUI();
	}
	
}
