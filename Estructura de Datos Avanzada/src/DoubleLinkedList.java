public class DoubleLinkedList<E> implements List<E>{


    private class DNode<E> implements Position<E> { //Se puede quitar la <E>

        public DNode(DNode<E> prev ,DNode<E> next,E element){

            this.prev = prev;
            this.next = next;
            this.element = element;

        }

        private DNode<E> prev, next;
        private E element;

        public E getElement(){return element;}
        public DNode<E> getNext(){return next;}

        public void setNext(DNode<E> node) { this.next = node;}

        public void setPrev(DNode<E> node) { this.prev = node;}

        @Override
        public E getValue() {
            return this.element;
        }
    }

    private DNode<E> head, tail;
    private int size;

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Position<E> add(E value) {

        DNode<E> newNode;

        if(this.isEmpty()){

            newNode = new DNode<>(null,null,value);
            this.head = newNode;
            this.tail = newNode;

        }else{

            newNode = new DNode<>(this.tail,null,value);
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        return newNode;
    }

    public Position<E>  add(int index, E value) {
        return null;
    }

    public float remove() {
        return 0;
    }

    public float remove(int index) {
        return 0;
    }

    public float get() {
        return 0;
    }

    public float get(int index) {
        return 0;
    }

    public int search(E value) {
        return 0;
    }

    public boolean contains(E value) {
        return false;
    }
}
