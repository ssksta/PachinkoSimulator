package machine.view;

import main.SecondWindow;

import java.net.URL;

public class AddButton {

    public void openAddMachineDialog(){
        URL fxmlUrl = getClass().getResource("../../fxml/AddMachineDialog.fxml");
        new SecondWindow().showNewWindow(fxmlUrl, "新規追加");
    }
}
