package ru.job4j.profession;

public class Engineer extends Profession {
    private String qualification;

    public Engineer(String qualification, String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }
}
