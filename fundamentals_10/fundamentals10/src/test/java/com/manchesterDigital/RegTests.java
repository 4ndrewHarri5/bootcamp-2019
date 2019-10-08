package com.manchesterDigital;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RegTests {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Test
    public void WhenRegIsMoreThen7CharsThrowException() {
        expectedException.expect(RegInvalidException.class);
        //Arrange
        String reg = "hsjancjsmxksc";
        //Act
        Reg.ConvertReg(reg);
        //Assert
        Assertions.assertThat(expectedException).isInstanceOf(RegInvalidException.class);
    }
    @Test
    public void whenSomeNumbersAndSpecialCharsShouldThrowException() {
        String input = "43/@124";
        expectedException.expect(RegInvalidException.class);
        Reg.ConvertReg(input);
        Assertions.assertThat(expectedException).isInstanceOf(RegInvalidException.class);
    }
    @Test
    public void whenRegIsLessThan5ThrowException() {
        String input = "4342";
        expectedException.expect(RegInvalidException.class);
        Reg.ConvertReg(input);
        Assertions.assertThat(expectedException).isInstanceOf(RegInvalidException.class);
    }
    @Test
    public void whenRegContainsCharacterThatNeedsToBeConvertThenConvert() {
        String reg = "SAGBI2";
        String result = Reg.ConvertReg(reg);
        Assertions.assertThat(result). isEqualTo("549812");
    }
    @Test
    public void whenRegContainsBothCharactersThatNeedsToBeConvertAndCharactersThatDontNeedToBeConvertedThenConvertOnlyOnesThatNeedToBeConverted() {
        String reg = "S1GHIO";
        String result = Reg.ConvertReg(reg);
        Assertions.assertThat(result). isEqualTo("519H1O");
    }
    @Test
    public void whenRegIsLowerCaseThrowException() {
        String reg = "ashjsa";
        expectedException.expect(RegInvalidException.class);
        Reg.ConvertReg(reg);
        Assertions.assertThat(expectedException).isInstanceOf(RegInvalidException.class);
    }
}
