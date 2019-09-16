public class Main {

    public static void main(String[] args) {
        List<String> l = new List<>();
        l.size();
        l.add("a");
        l.add("b");
        l.add("c");
        Position<String> p = l.add("d");
    }

}
