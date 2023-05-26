import java.security.Key;
import java.util.List;
import java.util.UUID;

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





    public static String createSecurity(String username, String password) {
        return null;
    }

    public static boolean confirmationUser(String username, String password, String token) {
        return true;
    }


}
