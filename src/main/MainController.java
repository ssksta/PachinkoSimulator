package main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import machine.machine.MachineSpec;
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
        MachineSpec machineSpec = new MachineSpec();
        Simulation simulation = new Simulation(machineSpec);
        simulation.execute();

    }
}
