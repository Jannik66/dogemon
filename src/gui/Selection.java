package gui;

import javafx.fxml.FXML;
import javafx.scene.text.Font;
import logic.MenuLogic;
import logic.Monster;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import gui.MainStage;

public class Selection {
	
	private MainStage mainStage;
	
	private MenuLogic menulogic = new MenuLogic();
	
	private ArrayList<Monster> Monsters;
	
	public Selection() {
		
		try {
				@SuppressWarnings("unused")
				final Font Pixelfont = Font.loadFont(new FileInputStream(new File("./src/gui/Pixel-UniCode.ttf")),25);
			} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Monsters = menulogic.getAllMonsters();
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
	
}
