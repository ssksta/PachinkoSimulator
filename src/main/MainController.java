package main;

import exception.ObjectNullException;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import machine.machine.Machine;
import machine.view.AddButton;
import sim.sim.Simulation;

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

    @FXML
    public void execute(){
        Machine machine = new Machine();
        try{
            Simulation simulation = new Simulation(machine);
            simulation.execute();
        }catch (ObjectNullException e){
            e.showLog();
        }
    }
}
