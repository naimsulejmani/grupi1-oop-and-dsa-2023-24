package dsa.stacks;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> numrat = new Stack<>();
        Stack<String> emrat = new Stack<>();
        try {
            numrat.push(10);
            numrat.push(20);
            numrat.push(30);
            emrat.push("Naim");
            emrat.push("Loriku");
            System.out.println(numrat.size());
            System.out.println(emrat.size());
            String emri = emrat.pop();
            System.out.println(emri);
            System.out.println(emrat.size());
            emrat.pop();
            emrat.pop();

        } catch (StackOverflowException e) {
            System.out.println(e.getMessage());
        } catch (StackUnderflowException e) {
            System.out.println("Ruaje ne databaze dhe njofto menaxherin me email");
            System.out.println(e.getMessage());
        }

    }
}
