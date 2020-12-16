package ru.job4j.profession;

public class Surgeon extends Doctor{
    private boolean sharpScalpel;

    Surgeon(boolean sharpScalpel, String diagnostics, String name, String surname, String education, String birthday) {
        super(diagnostics, name, surname, education, birthday);
        this.sharpScalpel = sharpScalpel;
    }

    public boolean getSharpScalpel() {
        return sharpScalpel;
    }
}
