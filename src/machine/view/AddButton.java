package machine.view;

import main.SecondWindow;

import java.net.URL;

public class AddButton {

    public void openAddMachineDialog(){
//        showSecondWindow();
//        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//        alert.showAndWait();
        URL fxmlUrl = getClass().getResource("AddMachineDialog.fxml");
        new SecondWindow().showNewWindow(fxmlUrl, "新規追加");
    }
}
