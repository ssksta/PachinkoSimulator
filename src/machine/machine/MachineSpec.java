package machine.machine;

import java.util.List;

public class MachineSpec {

    private String name;

    private Integer lowProb;

    private Integer highProb;

    private Integer otherProb;

    private Integer anotherProb;

    private List<Proportion> proportions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLowProb() {
        return lowProb;
    }

    public void setLowProb(Integer lowProb) {
        this.lowProb = lowProb;
    }

    public Integer getHighProb() {
        return highProb;
    }

    public void setHighProb(Integer highProb) {
        this.highProb = highProb;
    }

    public Integer getOtherProb() {
        return otherProb;
    }

    public void setOtherProb(Integer otherProb) {
        this.otherProb = otherProb;
    }

    public Integer getAnotherProb() {
        return anotherProb;
    }

    public void setAnotherProb(Integer anotherProb) {
        this.anotherProb = anotherProb;
    }

    public List<Proportion> getProportions() {
        return proportions;
    }

    public void setProportions(List<Proportion> proportions) {
        this.proportions = proportions;
    }
}
