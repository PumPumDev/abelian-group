package arboles;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Tree<String> tree = new LinkedTree<>();

        System.out.println(tree.isEmpty());

        System.out.println(tree.size());

        tree.addRoot("B");

        System.out.println(tree.size());
    }
}
