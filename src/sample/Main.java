package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("RSS FLUX");
        stage.setWidth(1920);
        stage.setHeight(1080);
        Scene scene = new Scene(new Group());
        VBox root = new VBox();
        root.setPrefSize(stage.getWidth(), stage.getHeight());
        final WebView browser = new WebView();
        browser.setPrefSize(stage.getWidth(), stage.getHeight());
        final WebEngine webEngine = browser.getEngine();

        System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
        webEngine.load("https://electron-rss.herokuapp.com/");
        root.getChildren().addAll(browser);
        scene.setRoot(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}