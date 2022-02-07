package ru.hw1;

public class MyArrayDataException extends RuntimeException {
    private int stroka;
    private int kolonka;

    public int getStroka() {
        return stroka;
    }

    public int getKolonka() {
        return kolonka;
    }

    public MyArrayDataException(String message, int stroka, int kolonka) {
        super(message);
        this.stroka = stroka;
        this.kolonka = kolonka;
    }
}
