import io.jsonwebtoken.security.Keys;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Map;
import io.jsonwebtoken.Jwts;


public class Base64Test {

    @Test
    public void base64Password(){
        String original = "password";
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

    @Test
    public void createJwtToken(){
        String password = "kalle";
        Key key = Keys.hmacShaKeyFor("XtraHemligKodKommerNogInteAttFungeraIAF".getBytes());

            String token = Jwts.builder()
                                .setSubject(password)
                                .addClaims(Map.of("kalle", "password"))
                                .signWith(key)
                                .compact();
            System.out.println(token);
    }



}
