package arboles;

public interface Tree<E> {

    int size();
    boolean isEmpty();

    boolean isLeaf(Position<E> p) throws RuntimeException;
    Position<E> addRoot(E e) throws RuntimeException;
    Position<E> add(Position<E> p, E e) throws RuntimeException;

}
