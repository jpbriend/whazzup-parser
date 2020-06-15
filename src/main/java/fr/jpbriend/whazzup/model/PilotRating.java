package fr.jpbriend.whazzup.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public enum PilotRating implements Serializable {
    OBSERVER("Observer", 1),
    FS1("Basic Flight Student (FS1)", 2),
    FS2("Flight Student (FS2)", 3),
    FS3("Advanced Flight Student (FS3)", 4),
    PP("Private Pilot (PP)", 5),
    SPP("Senior Private Pilot (SPP)", 6),
    CP("Commercial Pilot (CP)", 7),
    ATP("Airline Transport Pilot (ATP)", 8),
    SFI("Senior Flight Instructor (SFI)", 9),
    CFI("Chief Flight Instructor (CFI)", 10);

    private final String label;
    private final int value;
    private static final Map<Integer, PilotRating> lookup = new HashMap<Integer, PilotRating>();

    static {
        for (PilotRating t : PilotRating.values()) {
            lookup.put(t.value, t);
        }
    }

    PilotRating(final String label, final int value) {
        this.label = label;
        this.value = value;
    }

    public static PilotRating getPilotRating(final int value) {
        return lookup.get(value);
    }

    @Override
    public String toString() {
        return label;
    }
}
