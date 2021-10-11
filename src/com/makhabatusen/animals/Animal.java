package com.makhabatusen.animals;

public abstract class Animal {
    private String name;
    private  String favoriteFood;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
    }

    public  abstract String manageSelf();

    public void  explainSelf() {
        System.out.printf("\nI am %s and my favorite food is: %s", name, favoriteFood);
    };
}
