package com.makhabatusen.animals;

public class Dog extends Animal {

    public Dog(String name, String favoriteFood) {
        super(name, favoriteFood);
    }

    @Override
    public String manageSelf() {
        return " DJAAF ";
    }

    @Override
    public void explainSelf() {
        super.explainSelf();
        System.out.println(manageSelf());
    }
}
