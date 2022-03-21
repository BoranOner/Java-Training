package com.company;

public class RecipeWithMicrowave extends AbstractRecipe{


    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Switch on the microwave");
    }

    @Override
    void doTheDish() {
        System.out.println("get stuff ready");
        System.out.println("put it to the microwave");
    }

    @Override
    void cleanup() {
        System.out.println("Clean the utensils");
        System.out.println("Switch off the microwave");
    }
}
