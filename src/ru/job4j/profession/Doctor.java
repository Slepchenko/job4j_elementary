package ru.job4j.profession;

public class Doctor extends Profession {
    private String diagnostics;

    public Doctor(String diagnostics, String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.diagnostics = diagnostics;
    }

    public String getDiagnostics() {
        return diagnostics;
    }
}
