package com.manchesterDigital;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class SpotifyAccountServiceTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule(); // telling Junit to use mockito for mocking

    @Mock
    private AuthenticationService authenticationService;


    private SpotifyAccountService subject;

    @Before //before each test it will do this
    public void setUp() {
        //allows you to configure
        subject = new SpotifyAccountService(authenticationService);
    }

    @After
    public void tearDown() throws Exception {
        //can close down databases etc after using it in a test
    }

    @Test
    public void whenUsernameAndPasswordValidThenAccountReturned() {
        //Arrange
        String username = "john@test.com";
        String password = "124uhif";
        SpotifyAccount expectedAccount = new SpotifyAccount(username, password);

        BDDMockito.given(authenticationService.authenticate(Mockito.anyString(), Mockito.anyString()))
                .willReturn(true);

        //Act. should only have one act
        SpotifyAccount result = subject.verify(username, password);

        //Assert
        Assertions.assertThat(result.getUsername()).isEqualTo(expectedAccount.getUsername());

    }

    @Test
    public void whenUsernameAndPasswordInvalidThenExceptionThrown() {
        //Arrange
        String username = "john@test.com";
        String password = "12"; // at least 8 characters needed

        BDDMockito.given(authenticationService.authenticate(Mockito.anyString(), Mockito.anyString()))
                .willReturn(false);


        expectedException.expect(SpotifyAccountNotValidException.class);
        //Act
        subject.verify(username, password);

        //Assert
        BDDMockito.verify(authenticationService).authenticate(username, password);

    }


}
