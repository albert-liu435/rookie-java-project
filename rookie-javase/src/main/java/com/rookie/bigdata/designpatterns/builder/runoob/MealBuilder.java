package com.rookie.bigdata.designpatterns.builder.runoob;

/**
 * @Class MealBuilder
 * @Description
 * @Author rookie
 * @Date 2025/5/15 16:03
 * @Version 1.0
 */
public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
