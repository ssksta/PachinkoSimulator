package main;

import javafx.fxml.FXML;
import machine.AddButton;

public class MainController {
    @FXML
    public void addButton(){
        new AddButton().openAddMachineDialog();
        //ToDo 追加ボタンが何回も押せる。openAddMachineDialogが開いてるときはdisableにしたい

    }
}
