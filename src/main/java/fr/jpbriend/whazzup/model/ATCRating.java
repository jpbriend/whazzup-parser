package fr.jpbriend.whazzup.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public enum ATCRating implements Serializable {
    OBSERVER("Observer", 1),
    AS1("ATC Applicant (AS1)", 2),
    AS2("ATC Trainee (AS2)", 3),
    AS3("Advanced ATC Trainee (AS3)", 4),
    ADC("Aerodrome Controller (ADC)", 5),
    APC("Approach Controller (APC)", 6),
    ACC("Center Controller (ACC)", 7),
    SEC("Senior Controller (SEC)", 8),
    SAI("Senior ATC Instructor (SAI)", 9),
    CAI("Chief ATC Instructor (CAI)", 10);

    private final String label;
    private final int value;
    private static final Map<Integer, ATCRating> lookup = new HashMap<Integer, ATCRating>();

    static {
        for (ATCRating t : ATCRating.values()) {
            lookup.put(t.value, t);
        }
    }

    ATCRating(final String label, final int value) {
        this.label = label;
        this.value = value;
    }

    public static ATCRating getATCRating(final int value) {
        return lookup.get(value);
    }

    @Override
    public String toString() {
        return label;
    }
}
