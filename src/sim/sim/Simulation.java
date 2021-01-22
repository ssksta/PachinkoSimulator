package sim.sim;

import machine.machine.*;
import sim.logic.SimLogic;

public class Simulation {

    private MachineSpec spec;
    private MachineStatus status;
    private MachineData data;
    private SimulationConditions conditions;

    public Simulation(Machine machine){
        this.spec = machine.getMachineSpec();
        this.status = machine.getMachineStatus();
        this.data = machine.getMachineData();
        this.conditions = machine.getSimulationConditions();
    }

    public void execute(){
        init();
        oneDay();
    }

    private void init(){

    }

    private void oneDay(){
        for(int i=0;i<4000;i++){
            int rn = SimLogic.rm_65536();
            if(rn > spec.getLowProb()){
                System.out.println("Hit!!");
            }
        }
    }
}
