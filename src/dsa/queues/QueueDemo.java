package dsa.queues;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> ekipetMeTeMira = new Queue<>();
        try {
            ekipetMeTeMira.enqueue("Real Madrid");
            ekipetMeTeMira.enqueue("Barcelona");
            String ekipiMeIMire = ekipetMeTeMira.dequeue();
            System.out.println(ekipiMeIMire);
        } catch (QueueOverflowException e) {
            System.out.println(e.getMessage());
        } catch (QueueUnderflowException e) {
            System.out.println("Queue underflow");
        }
    }
}
