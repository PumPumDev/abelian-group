package estructurasLineales;

public interface List<E> {

    int size();
    boolean isEmpty();
    Position<E> addLast(E value);
    Position<E> add(int index, E value);
    E remove(Position<E> p) throws RuntimeException;
    E remove(int index);
    E get();
    E get(int index);
    int search(E value);
    boolean contains(E value);
}
