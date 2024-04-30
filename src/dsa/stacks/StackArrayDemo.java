package dsa.stacks;

public class StackArrayDemo {
    public static void main(String[] args) {
        StackArray<String> deshtimetEVitit = new StackArray<>();
        try {
            deshtimetEVitit.push("Barcelona");
            deshtimetEVitit.push("Real Madrid");
            String kushNukDeshton = deshtimetEVitit.pop();
            System.out.println(kushNukDeshton);

        } catch (StackOverflowException e) {
            System.out.println(e.getMessage());
        } catch (StackUnderflowException e) {
            System.out.println("Ski qka hjek prej stackut!");
            System.out.println(e.getMessage());
        }
    }
}
