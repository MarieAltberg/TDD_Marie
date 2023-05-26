import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class InloggningTest {
    private final Inloggning inloggning = new Inloggning();

    @ParameterizedTest
    @CsvSource(value = {"anna, losen, true", "berit, 123456, true", "kalle, password, true"})


   /* @Test
    public void userLoggInTest() {
        //Given
        TddUser tddUser = new TddUser("anna", "losen");
        TddUser tddUser1 = new TddUser("berit", "123456");
        TddUser tddUser2 = new TddUser("kalle", "password");
        //When
        boolean result = Inloggning.confirm(tddUser.getUsername(), tddUser.getPassword());
        //Then
        Assertions.assertTrue(result);

    }
*/
    public void userLoggInTest(String username, String password, boolean expected){
        boolean result = Inloggning.confirm(username, password);
        Assertions.assertEquals(expected, result);
    }

    public void autentiseringTest(String username, String password, boolean expected){
        String token = Inloggning.createSecurity(username, password);
        boolean result = Inloggning.confirmationUser(username, password, token);
        Assertions.assertEquals(expected, result);
    }

}
