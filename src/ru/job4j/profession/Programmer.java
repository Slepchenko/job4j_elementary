package ru.job4j.profession;

public class Programmer extends Engineer {
    private String project;

    public Programmer(String project, String qualification, String name, String surname, String education, String birthday) {
        super(qualification, name, surname, education, birthday);
        this.project = project;
    }

    public String getProject() {
        return project;
    }
}
