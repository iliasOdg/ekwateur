package fr.ekwateur;

import java.util.Arrays;
import java.util.Optional;

public enum EnergieEnum {
    GAZ("GAZ"),
    ELECTRICITE("ELECTRICITE");

    private String name;

    EnergieEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static Optional<EnergieEnum> fromName(String name) {
        return Arrays.stream(values())
                .filter(val -> val.name.equalsIgnoreCase(name))
                .findFirst();
    }
}
