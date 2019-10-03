package com.manchesterDigital;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;

public class ResturantTests {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();


    @Test
    public void whenRequestIsMexicanReturnTacoBurrito(){

        //Arrange
        String dishType = "MEXICAN";

        //Act
        Resturant resturant = new Resturant();
        String[] result = resturant.requestDish(dishType);

        //Assert

        String[] expected = {"Taco", "Burrito"};

        Assertions.assertThat(result).isEqualTo(expected);

    }


    @Test
    public void whenRequestIsIndianReturnTandooriChickenAndBhunaGhosht(){

        //Arrange
        String dishType = "Indian";

        //Act
        Resturant resturant = new Resturant();
        String[] result = resturant.requestDish(dishType);

        //Assert

        String[] expected = {"Tandoori Chicken", "Bhuna Ghosht"};

        Assertions.assertThat(result).isEqualTo(expected);

    }

    @Test
    public void whenRequestIsPanAsianReturnStirFryNoodlesAndDimSom(){

        //Arrange
        String dishType = "pan asian";

        //Act
        Resturant resturant = new Resturant();
        String[] result = resturant.requestDish(dishType);

        //Assert

        String[] expected = {"Stir Fry Noodles", "Dim Som"};

        Assertions.assertThat(result).isEqualTo(expected);

    }

    @Test
    public void whenRequestIsEnglishReturnBeefWellingtonAndFishAndChips(){

        //Arrange
        String dishType = "ENGLISH";

        //Act
        Resturant resturant = new Resturant();
        String[] result = resturant.requestDish(dishType);

        //Assert

        String[] expected = {"Beef Wellington", "Fish and Chips"};

        Assertions.assertThat(result).isEqualTo(expected);

    }

    @Test
    public void whenRequestIsNotValidReturnException(){

        expectedException.expect(DishNotValidException.class);
        //Arrange
        String dishType = "Polish";

        //Act
        Resturant resturant = new Resturant();
        resturant.requestDish(dishType);

        //Assert
        Assertions.assertThat(expectedException).isInstanceOf(DishNotValidException.class);


    }

}
