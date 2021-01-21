package sim.sim;

import machine.machine.MachineSpec;
import sim.logic.SimLogic;

public class Simulation {

    private MachineSpec machineSpec;

    public Simulation(MachineSpec machineSpec){
        this.machineSpec = machineSpec;
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
            if(rn> machineSpec.getLowProb()){
                System.out.println("Hit!!");
            }
        }
    }
}
