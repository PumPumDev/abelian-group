package estructurasLineales;

public class Main {

    public static void main(String[] args) {
        List<String> ls = new DoubleLinkedList<>();

        Position<String> p1 = ls.addLast("a");
        Position<String> p2 = ls.addLast("b");

        String s = ls.remove(p2);
        System.out.println(s);

        Position<String> p3 = null;
        ls.remove(p3);

        List<String> ls2 = new DoubleLinkedList<>();
        Position<String> p4 = ls2.addLast("X");

    }

}
