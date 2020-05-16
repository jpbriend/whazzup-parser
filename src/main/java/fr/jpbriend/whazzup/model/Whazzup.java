package fr.jpbriend.whazzup.model;

import java.util.ArrayList;
import java.util.List;

public class Whazzup {
    private List<IvaoClient> pilots = new ArrayList<IvaoClient>();
    private List<IvaoClient> atcs = new ArrayList<IvaoClient>();

    public Whazzup() {}

    public List<IvaoClient> getPilots() {
        return pilots;
    }

    public void setPilots(List<IvaoClient> pilots) {
        this.pilots = pilots;
    }

    public List<IvaoClient> getAtcs() {
        return atcs;
    }

    public void setAtcs(List<IvaoClient> atcs) {
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
