package fr.jpbriend.whazzup.model;

import java.util.ArrayList;
import java.util.List;

public class Whazzup {
    private List<IvaoPilot> pilots = new ArrayList<IvaoPilot>();
    private List<IvaoATC> atcs = new ArrayList<IvaoATC>();

    public Whazzup() {}

    public List<IvaoPilot> getPilots() {
        return pilots;
    }

    public void setPilots(List<IvaoPilot> pilots) {
        this.pilots = pilots;
    }

    public List<IvaoATC> getAtcs() {
        return atcs;
    }

    public void setAtcs(List<IvaoATC> atcs) {
        this.atcs = atcs;
    }

    @Override
    public String toString() {
        return "Whazzup{" +
                "pilots=" + pilots +
                ", acts=" + atcs +
                '}';
    }
}
