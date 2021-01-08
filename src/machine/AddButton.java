package machine;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class AddButton {

    public void openAddMachineDialog(){
//        showSecondWindow();
//        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//        alert.showAndWait();
        new Stage().showAndWait();
    }

    public void showSecondWindow(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AddMachineDialog.fxml"));
            BorderPane root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
