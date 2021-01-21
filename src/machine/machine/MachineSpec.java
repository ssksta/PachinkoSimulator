package machine.machine;

import java.util.List;

public class MachineSpec {

    private String name;

    private int lowProb;

    private int highProb;

    private int otherProb;

    private int anotherProb;

    private List<Proportion> proportions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLowProb() {
        return lowProb;
    }

    public void setLowProb(int lowProb) {
        this.lowProb = lowProb;
    }

    public int getHighProb() {
        return highProb;
    }

    public void setHighProb(int highProb) {
        this.highProb = highProb;
    }

    public int getOtherProb() {
        return otherProb;
    }

    public void setOtherProb(int otherProb) {
        this.otherProb = otherProb;
    }

    public int getAnotherProb() {
        return anotherProb;
    }

    public void setAnotherProb(int anotherProb) {
        this.anotherProb = anotherProb;
    }

    public List<Proportion> getProportions() {
        return proportions;
    }

    public void setProportions(List<Proportion> proportions) {
        this.proportions = proportions;
    }
}
