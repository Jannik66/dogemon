package gui;

import java.io.IOException;

import gui.Battle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainStage extends Application {

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
            loader.setLocation(MainStage.class.getResource("Stage.fxml"));
            rootLayout = (BorderPane) loader.load();
            
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
		}
	}
	

    public void showBattleGUI() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainStage.class.getResource("Battle.fxml"));
            AnchorPane BattleGUI = (AnchorPane) loader.load();
            
            rootLayout.setCenter(BattleGUI);
            
            Battle controller = loader.getController();
            controller.setMainStage(this);
           
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public Stage getPrimaryStage() {
    	return primaryStage;
    }
    
    public static void main(String[] args) {
    	launch(args);
    }

}
