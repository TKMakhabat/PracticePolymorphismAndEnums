package com.makhabatusen.banknotes;

public enum Banknotes {

    TWENTY(1),
    FIFTY(2),
    HUNDRED(3),
    TWO_HUNDRED(4),
    FIVE_HUNDRED(5),
    THOUSAND(6);

    private int number;

    public int getNumber() {
        return number;
    }

    Banknotes(int number) {
        this.number = number;
    }

}
