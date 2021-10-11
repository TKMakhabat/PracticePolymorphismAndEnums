package com.makhabatusen.animals;

public class Cat extends Animal {


    public Cat(String name, String favoriteFood) {
        super(name, favoriteFood);
    }

    @Override
    public String manageSelf() {
        return " MEEOW ";
    }

    @Override
    public void explainSelf() {
        super.explainSelf();
        System.out.println(manageSelf());

    }
}
