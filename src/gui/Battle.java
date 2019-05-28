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
	
	
}
