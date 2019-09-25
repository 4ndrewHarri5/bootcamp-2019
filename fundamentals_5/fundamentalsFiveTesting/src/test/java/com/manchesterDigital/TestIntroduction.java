package com.manchesterDigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestIntroduction {

    @Test
    public void testThatABankAccountTakesAnInputWhenDeposited() {

    }

    @Test
    public void shouldTakeInputWhenDeposited() {

    }

    //BDD Style: business analysis will be writing stories like this
    @Test
    public void givenBankAccountWhenInputThenDeposited() {

    }

    @Test
    public void shouldAddTwoNumbers() {
        //Arrange
        int first = 23;
        int second = 23;
        //Act
        int result = first + second;
        //Assert
        assertThat(result).isEqualTo(46);
    }
}
