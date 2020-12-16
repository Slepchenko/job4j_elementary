package ru.job4j.profession;

public class Dentist extends Doctor {
    private String brandOfDrill;

    Dentist(String brandOfDrill, String diagnostics, String name, String surname, String education, String birthday) {
        super(diagnostics, name, surname, education, birthday);
        this.brandOfDrill = brandOfDrill;
    }

    public String getbrandOfDrill() {
        return brandOfDrill;
    }
}
