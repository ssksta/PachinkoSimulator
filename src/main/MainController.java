package main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import machine.AddButton;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void addButton(){
        new AddButton().openAddMachineDialog();
        //ToDo 追加ボタンが何回も押せる。openAddMachineDialogが開いてるときはdisableにしたい

    }

}
