package Assignment22;

public class Task7 {
    public static void main(String[] args) {
        signIn("Kazhmurat");
    }
    public static void signIn(String username){
        if ("user".equals(username)) {
            return;
        }
        System.out.println("Welcome " + username);
        System.out.println("Missed you very much, " + username);
    }
}
