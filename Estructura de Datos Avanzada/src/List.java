public interface List<E> {

    int size();
    boolean isEmpty();
    Position<E> add(E value);
    Position<E> add(int index, E value);
    float remove();
    float remove(int index);
    float get();
    float get(int index);
    int search(E value);
    boolean contains(E value);
}
