import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import java.util.Base64;

public class InloggningTest {
    private final Inloggning inloggning = new Inloggning();

    @ParameterizedTest
    @CsvSource(value = {"anna, losen, true", "berit, 123456, true", "kalle, password, true"})
    //@CsvSource(value = "anna, losen, true", "berit, 123456, true", "kalle, password, true")


    @Test
    public void base64Password(){
        String original = "losen";
        byte[] originalAsBytes = original.getBytes();
        byte[] base64bytes = Base64.getEncoder().encode(originalAsBytes);
        String base64String = new String(base64bytes);



      //  byte[] backAsBases64bytes = base64String1.getBytes();
      //  byte[] backAsBytes = Base64.getDecoder().decode(backAsBases64bytes);
      //  String backAsString = new String(backAsBytes);

       Assertions.assertEquals(base64bytes, base64bytes);
        Assertions.assertEquals(originalAsBytes, originalAsBytes);



    }









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
