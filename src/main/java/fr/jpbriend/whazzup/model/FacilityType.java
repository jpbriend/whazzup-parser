package fr.jpbriend.whazzup.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public enum FacilityType implements Serializable {
    OBSERVER("Observer", 0),
    FLIGHT_INFORMATION("Fight Information", 1),
    DELIVERY("Delivery", 2),
    GROUND("Ground", 3),
    TOWER("Tower", 4),
    APPROACH("Approach", 5),
    ACC("ACC", 6),
    DEPARTURE("Departure", 7);

    private final String label;
    private final int value;
    private static final Map<Integer, FacilityType> lookup = new HashMap<Integer, FacilityType>();

    static {
        for (FacilityType t : FacilityType.values()) {
            lookup.put(t.value, t);
        }
    }

    FacilityType(final String label, final int value) {
        this.label = label;
        this.value = value;
    }

    public static FacilityType getFacilityType(final int value) {
        return lookup.get(value);
    }

    @Override
    public String toString() {
        return label;
    }
}
