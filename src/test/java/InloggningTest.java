import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class InloggningTest {
    private final Inloggning inloggning = new Inloggning();

   @Test
    public void userLoggInTest(){

        //Given
        TddUser tddUser = new TddUser("anna", "losen");
        TddUser tddUser1 = new TddUser("berit", "123456");
        TddUser tddUser2 = new TddUser("kalle", "password");

        //When
        boolean result = Inloggning.confirm(tddUser.getUsername(), tddUser.getPassword());

        //Then
        Assertions.assertTrue(result);

    }
}
