package com.manchesterDigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TemperatureConverterTest {

    @Test //This is a unit test
    public void whenFahrenheitIs0ThenCelsiusIsMinus17() {
        //Arrange
        String unitToConvertTo = "C";
        double temperature = 0;

        //Act
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);

        //Assert
        Assertions.assertThat(result).isEqualTo(-17.0);
    }

    @Test //This is a unit test
    public void whenFahrenheitIs100ThenCelsiusIs38() {
        //Arrange
        String unitToConvertTo = "C";
        double temperature = 100;

        //Act
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);

        //Assert
        Assertions.assertThat(result).isEqualTo(38.0);
    }
}
