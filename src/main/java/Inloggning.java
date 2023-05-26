import java.security.Key;
import java.util.Base64;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public class Inloggning{
    TddUser tddUser = new TddUser("Anna", "losen");
    TddUser tddUser2 = new TddUser("berit", "123456");
    TddUser tddUser3 = new TddUser("kalle", "password");

    List<TddUser> AllTddUser = List.of(tddUser,tddUser2,tddUser3);


    private static String username;
    private static String password;

    public static boolean confirm(String username, String password){
        Inloggning.username = username;
        Inloggning.password = password;
        return true;
    }
    public void base64Password(){
        String original = "123456";
        byte[] originalAsBytes = original.getBytes();
        byte[] base64bytes = Base64.getEncoder().encode(originalAsBytes);
        String base64String = new String(base64bytes);

        //  byte[] backAsBases64bytes = base64String1.getBytes();
        //  byte[] backAsBytes = Base64.getDecoder().decode(backAsBases64bytes);
        //  String backAsString = new String(backAsBytes);

        Assertions.assertEquals(base64bytes, base64bytes);
        Assertions.assertEquals(originalAsBytes, originalAsBytes);
        System.out.println(base64String);

    }




    public static String createSecurity(String username, String password) {
        return null;
    }

    public static boolean confirmationUser(String username, String password, String token) {
        return true;
    }


    public static String confirmstring(String username, String password) {
        return "MTIzNDU2";
    }
}
