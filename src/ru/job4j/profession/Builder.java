package ru.job4j.profession;

public class Builder extends Engineer {
    private String drawing;

    public Builder(String drawing, String qualification, String name, String surname, String education, String birthday) {
        super(qualification, name, surname, education, birthday);
        this.drawing = drawing;
    }

    public String getDrawing() {
        return drawing;
    }
}
