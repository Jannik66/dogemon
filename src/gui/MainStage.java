package gui;

import java.io.IOException;
import java.util.ArrayList;

import gui.Battle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import logic.BattleLogic;
import logic.MenuLogic;
import logic.Monster;
import logic.Attack;

public class MainStage extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;

	private MenuLogic menulogic;

	private BattleLogic battlelogic;

	@Override
	public void start(Stage primaryStage) {

		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Dogémon Lapislazuli Edition");

		initRootLayout();

		showSelectionGUI();
	}

	public void initRootLayout() {
		try {
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

	public void showSelectionGUI() {
		menulogic = new MenuLogic();
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainStage.class.getResource("Selection.fxml"));
			AnchorPane SelectionGUI = (AnchorPane) loader.load();

			rootLayout.setCenter(SelectionGUI);

			Selection controller = loader.getController();
			controller.setMainStage(this);
			controller.initSelection();

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
			controller.initBattle();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void showEndscreenGUI(Monster Winner) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainStage.class.getResource("Endscreen.fxml"));
			AnchorPane EndGUI = (AnchorPane) loader.load();

			rootLayout.setCenter(EndGUI);

			Endscreen controller = loader.getController();
			controller.setMainStage(this);
			controller.initEndscreen(Winner);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public void initializeBattleLogic(int MonsterId) {
		battlelogic = new BattleLogic(MonsterId, menulogic.getAllMonsters(), menulogic.getAllAttacks());
	}

	public String Attack(int attkNr) {
		String output = battlelogic.Attack(attkNr);
		return output;
	}

	public ArrayList<Monster> getAllMonsters() {
		return menulogic.getAllMonsters();
	}

	public ArrayList<Attack> getAllAttacks() {
		return menulogic.getAllAttacks();
	}

	public Monster getPlayer() {
		return battlelogic.getPlayerMonster();
	}

	public Monster getOpponent() {
		return battlelogic.getOpponentMonster();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
