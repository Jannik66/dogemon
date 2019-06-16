
package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import logic.Monster;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import gui.MainStage;

public class Endscreen {

	private MainStage mainStage;

	@FXML
	private Label WinnerName;

	public Endscreen() {

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

	public void setMainStage(MainStage mainStage) {
		this.mainStage = mainStage;
	}

	public void initEndscreen(Monster Winner) {

		WinnerName.setText(Winner.getData().getName() + " wins!");
	}

	@FXML
	private void PlayAgain() {
		mainStage.showSelectionGUI();
	}

}
