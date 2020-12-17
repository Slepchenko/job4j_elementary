package ru.job4j;

public class encapsulation {
    private String name;
    private int position;
    private String[] properties;

    public void Config(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(position);
    }

    public String getProperty(String key) {
        return search(key);
    }

    private String search(String key) {
        return key;
    }
}
