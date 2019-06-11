package gui;

import javafx.fxml.FXML;
import javafx.scene.text.Font;
import logic.Monster;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

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
		// TODO: Set Pictures
	}
	
	@FXML
	private void Select0() {
		System.out.println("I coose you!");
		mainStage.initializeBattleLogic(0);
		mainStage.showBattleGUI();
	}
	
}
