package ru.job4j.ex;

public class ElementNotFoundException extends Exception {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;

        for(int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
            } else {
                throw new ElementNotFoundException();
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = new String[]{"one", "two", "three", "five"};
        int rsl = -1;
        try {
            rsl = indexOf(value, "four");
        } catch(ElementNotFoundException e) {
            System.out.println("Нет такого значения");
        }
        System.out.println(rsl);
    }
}
