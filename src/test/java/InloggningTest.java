import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import java.util.Base64;

public class InloggningTest {
    private final Inloggning inloggning = new Inloggning();

    @ParameterizedTest
    //@CsvSource(value = {"anna, losen, true", "berit, 123456, true", "kalle, password, true"})
   // @CsvSource(value = {"anna, losen, bG9zZW4=", "berit, 123456, MTIzNDU2", "kalle, password, cGFzc3dvcmQ="})
    @CsvSource(value = {"berit, 123456, MTIzNDU2"})
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
    @Test
    public void userLoggInTest(String username, String password, String expected){
        String result = Inloggning.confirmstring(username, password);
        Assertions.assertEquals(expected, result);
    }


    @Test
    public void autentiseringTest(String username, String password, boolean expected){
        String token = Inloggning.createSecurity(username, password);
        boolean result = Inloggning.confirmationUser(username, password, token);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void throwException(){
        String username = "berit";
        String password = "123456";
        ArithmeticException err = Assertions.assertThrows(ArithmeticException.class, () -> Inloggning.confirm(username, password));
        Assertions.assertEquals("Sorry, no can do!", err.getMessage());

    }




}
