package machine.machine;

/**
 * 台の情報をまとめたObject
 */
public class Machine {

    private MachineSpec machineSpec;

    private MachineStatus machineStatus;

    private MachineData machineData;

    private SimulationConditions simulationConditions;

    public MachineSpec getMachineSpec() {
        return machineSpec;
    }

    public void setMachineSpec(MachineSpec machineSpec) {
        this.machineSpec = machineSpec;
    }

    public MachineStatus getMachineStatus() {
        return machineStatus;
    }

    public void setMachineStatus(MachineStatus machineStatus) {
        this.machineStatus = machineStatus;
    }

    public MachineData getMachineData() {
        return machineData;
    }

    public void setMachineData(MachineData machineData) {
        this.machineData = machineData;
    }

    public SimulationConditions getSimulationConditions() {
        return simulationConditions;
    }

    public void setSimulationConditions(SimulationConditions simulationConditions) {
        this.simulationConditions = simulationConditions;
    }
}
