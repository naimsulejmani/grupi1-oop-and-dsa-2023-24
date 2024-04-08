public class Main {
    public static void main(String[] args) {
        String a = "First variable";
        String b = "Second variable";

        System.out.printf("%1$s | %1$s \n", a); // First variable | First variable
        System.out.printf("%2$s | %1$s", a, b); // Second variable | First variable

    }
}