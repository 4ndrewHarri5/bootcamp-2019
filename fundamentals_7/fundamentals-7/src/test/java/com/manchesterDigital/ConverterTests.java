package com.manchesterDigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ConverterTests {

    @Test
    public void whenMBIs1KilobyteIs1024() {
        //Arrange
        Bytes convertTo = Bytes.KB;
        int value = 1;

        //Act
        String result = Converter.convert(convertTo, value);

        //Assert
        Assertions.assertThat(result).isEqualTo("1024KB");


    }

    @Test
    public void whenMBIs2KilobyteIs2048() {
        //Arrange
        Bytes convertTo = Bytes.KB;
        int value = 2;

        //Act
        String result = Converter.convert(convertTo, value);

        //Assert
        Assertions.assertThat(result).isEqualTo("2048KB");

    }

    @Test
    public void whenKBIs2050MBIs2MBand2KB() {
        //Arrange
        Bytes convertTo = Bytes.KB;
        int value = 2;

        //Act
        String result = Converter.convert(convertTo, value);

        //Assert
        Assertions.assertThat(result).isEqualTo("2048KB");

    }

}
