package com.makhabatusen;

import com.makhabatusen.animals.Cat;
import com.makhabatusen.animals.Dog;
import com.makhabatusen.banknotes.Banknotes;
import com.makhabatusen.math_operation.MathOperation;
import com.makhabatusen.shapes.Circle;
import com.makhabatusen.shapes.Rectangle;

public class Main {

    public static void main(String[] args) {

        // Task 1
        MathOperation math = new MathOperation();
        math.add(2, 2);
        math.add(3, 3, 3);
        math.add(4, 4, 4, 4);
        System.out.println("\n_____");

        //Task 2
        Circle circle = new Circle(5.4);
        circle.calculatePerimeter();
        circle.calculateArea();
        System.out.println("\n_____");


        Rectangle rectangle = new Rectangle(3.2, 5.3);
        rectangle.calculatePerimeter();
        rectangle.calculateArea();
        System.out.println("\n_____");

        //Task 3
        Dog dog = new Dog("Rocky", "Meat");
        dog.explainSelf();
        System.out.println("\n_____");

        Cat cat = new Cat("Peter", "Whiskas");
        cat.explainSelf();


        //Task 4
        Banknotes[] banknotes = Banknotes.values();
        for ( Banknotes banknote: banknotes) {
            System.out.printf("\nBanknote: %s + index number: %d ", banknote, banknote.getNumber());
        }



    }

}
