package fr.jpbriend.whazzup.model;

import java.util.HashMap;
import java.util.Map;

public enum AdministrativeRating {
    SUSPENDED("Suspended", 0),
    OBSERVER("Observer", 1),
    USER("User", 2),
    SUPERVISOR("Supervisor", 10),
    ADMINISTRATOR("Administrator", 11);

    private final String label;
    private final int value;
    private static final Map<Integer, AdministrativeRating> lookup = new HashMap<Integer, AdministrativeRating>();

    static {
        for (AdministrativeRating t : AdministrativeRating.values()) {
            lookup.put(t.value, t);
        }
    }

    AdministrativeRating(final String label, final int value) {
        this.label = label;
        this.value = value;
    }

    public static AdministrativeRating getAdministrativeRating(final int value) {
        return lookup.get(value);
    }

    @Override
    public String toString() {
        return label;
    }

}
