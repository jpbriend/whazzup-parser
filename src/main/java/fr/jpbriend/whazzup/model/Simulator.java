package fr.jpbriend.whazzup.model;

import java.util.HashMap;
import java.util.Map;

public enum Simulator {
    MFS_95("Microsoft Flight Simulator 95", 1),
    MFS_98("Microsoft Flight Simulator 98", 2),
    MCFS("Microsoft Flight Combat Simulator", 3),
    MFS_2000("Microsoft Flight Simulator 2000", 4),
    MCFS2("Microsoft Flight Combat Simulator 2", 5),
    MFS_2002("Microsoft Flight Simulator 2002", 6),
    MCFS3("Microsoft Flight Combat Simulator 3", 7),
    MFS_2004("Microsoft Flight Simulator 2004", 8),
    MFS_X("Microsoft Flight Simulator X", 9),
    XPLANE("X-Plane (unknown version)", 11),
    XPLANE_8("X-Plane 8.x", 12),
    XPLANE_9("X-Plane 9.x", 13),
    XPLANE_10("X-Plane 10.x", 14),
    PS1("PS1", 15),
    XPLANE_11("X-Plane 11.x", 16),
    XPLANE_12("X-Plane 12.x", 17),
    FLY("Fly!", 20),
    FLY2("Fly! 2", 21),
    FLIGHT_GEAR("FlightGear", 25),
    PREPAR3D("Prepar3D 1.x", 30);

    private final String label;
    private final int value;
    private static final Map<Integer, Simulator> lookup = new HashMap<Integer, Simulator>();

    static {
        for (Simulator t : Simulator.values()) {
            lookup.put(t.value, t);
        }
    }

    Simulator(final String label, final int value) {
        this.label = label;
        this.value = value;
    }

    public static Simulator getSimulator(final int value) {
        return lookup.get(value);
    }
    @Override
    public String toString() {
        return label;
    }
}
