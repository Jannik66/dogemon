package gui;

import java.io.IOException;

import gui.Battle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainStage extends Application{

	private Stage primaryStage;
	private BorderPane rootLayout;
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Dogémon Lapislazuli Edition");
		
		initRootLayout();
		
		showBattleGUI();
	}
	
	public void initRootLayout(){
		try{
			FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainStage.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
		}
	}
	
    // Zeigt GUI1 im Root Layout an
    public void showBattleGUI() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainStage.class.getResource("view/GUI1.fxml"));
            AnchorPane BattleGUI = (AnchorPane) loader.load();
            
            rootLayout.setCenter(BattleGUI);
            
            Battle battle = loader.getController();
            battle.setMainStage(this);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
