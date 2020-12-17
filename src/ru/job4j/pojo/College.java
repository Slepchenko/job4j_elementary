package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alexander Slepchenko");
        student.setGroup(1);
        Date dateEntrance = new Date();
        dateEntrance.setDate(16);
        dateEntrance.setMonth(10);
        dateEntrance.setYear(2020);
        student.setEntrance(dateEntrance);

        System.out.println(student.getName());
        System.out.println(student.getGroup());
        System.out.println(student.getEntrance());
    }
}
