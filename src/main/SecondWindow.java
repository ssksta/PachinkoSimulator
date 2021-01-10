package main;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class SecondWindow {

    private Stage stage;

    /**
     * 新規のWindowを作成(BorderPane限定)
     * @param url
     */
    public void showNewWindow(URL url, String tittle){
        try {
            FXMLLoader loader = new FXMLLoader(url);
            BorderPane root = loader.load();
            Scene scene = new Scene(root);
            stage = new Stage();
            stage.setScene(scene);
            stage.setTitle(tittle);
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeWindow(){
        stage.close();
    }

    public void setTittle(String tittle){
        if(stage!=null){
            stage.setTitle(tittle);
        }
    }
}
