import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> firstClients = new LinkedList<>();
        firstClients.offer("Anya");
        firstClients.offer("Sveta");
        firstClients.offer("Olya");
        firstClients.offer("Alexandra");
        firstClients.offer("Ruslana");
        firstClients.offer("Olesya");
        firstClients.offer("Vika");


        while (!firstClients.isEmpty()) {
            String s = firstClients.poll();
            System.out.println(s + " сделала новый маникюр");

            if (Math.random() < 0.5) {
                firstClients.offer("a friends of " + s);
            } 
        }
    }
}