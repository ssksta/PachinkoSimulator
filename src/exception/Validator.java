package exception;

import machine.machine.Machine;

public class Validator {

    public void check(Machine machine) throws ObjectNullException{
        boolean hasError = false;
        ObjectNullException objectNullException = new ObjectNullException();
        if(machine.getMachineSpec()==null){
            objectNullException.setErrorMessage("MachineSpec is Null");
            hasError = true;
        }
        if(machine.getMachineStatus()==null){
            objectNullException.setErrorMessage("MachineStatus is Null");
            hasError = true;
        }
        if(machine.getMachineData()==null){
            objectNullException.setErrorMessage("MachineData is Null");
            hasError = true;
        }
        if(machine.getSimulationConditions()==null){
            objectNullException.setErrorMessage("SimulationConditions is Null");
            hasError = true;
        }

        if(hasError){
            throw objectNullException;
        }
    }
}
