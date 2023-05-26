public class Inloggning {
    private static String username;
    private static String password;

    public static boolean confirm(String username, String password){
        Inloggning.username = username;
        Inloggning.password = password;
        return true;
    }

}
