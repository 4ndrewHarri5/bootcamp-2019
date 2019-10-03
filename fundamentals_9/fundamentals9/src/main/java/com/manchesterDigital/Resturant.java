package com.manchesterDigital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Resturant {

    private Map<Type , String[]> allDishes = new HashMap<>();

    public Resturant() {
        fillDishes();
    }

    public String[] requestDish(String dishType) {

        Type newType = null;

        try {
            newType = Type.convertStringToType(dishType);
        }catch (DishNotValidException e) {
            throw e;
        }

        return allDishes.get(newType);

    }

    private void fillDishes() {
        //Map<Type , String[]> allDishes = new HashMap<>();
        String [] indianDishes = {"Tandoori Chicken", "Bhuna Ghosht"};
        String [] mexicanDishes = {"Taco", "Burrito"};
        String [] panAsianDishes = {"Stir Fry Noodles", "Dim Som"};
        String [] englishDishes = {"Beef Wellington", "Fish and Chips"};
        allDishes.put(Type.INDIAN, indianDishes);
        allDishes.put(Type.MEXICAN, mexicanDishes);
        allDishes.put(Type.ASIAN, panAsianDishes);
        allDishes.put(Type.ENGLISH, englishDishes);
    }
}
