import material.linear.ArrayQueue;
import material.linear.LinkedQueue;
import material.linear.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> q = new ArrayQueue<>();


        System.out.println(q.isEmpty());

        q.enqueue("Hola");

        q.enqueue("Muy buenas");
        q.enqueue("Que tal");
        q.enqueue("Yo bien");

        while(!q.isEmpty())
            System.out.println(q.dequeue());


    }
}
