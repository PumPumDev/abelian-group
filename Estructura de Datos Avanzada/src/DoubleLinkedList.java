public class DoubleLinkedList<E> implements List<E>{


    private class DNode<E> implements Position<E> { //Se puede quitar la <E>

        public DNode(DNode<E> prev, DNode<E> next, E element, DoubleLinkedList<E> id){

            this.prev = prev;
            this.next = next;
            this.element = element;
            this.id = id;

        }

        private DNode<E> prev, next;
        private E element;
        private DoubleLinkedList<E> id;

        public E getElement(){return this.element;}
        public DNode<E> getNext(){return this.next;}
        public DNode<E> getPrev(){return this.prev;}
        public DoubleLinkedList<E> getId(){return this.id;}

        public void setNext(DNode<E> node) { this.next = node;}

        public void setPrev(DNode<E> node) { this.prev = node;}

        @Override
        public E getValue() {
            return this.element;
        }
    }

    private DNode<E> head, tail;
    private int size;

    private DNode<E> checkPosition(Position<E> p){
        if(p == null || !(p instanceof DNode)){
            throw new RuntimeException("The position is invalid.");
        }

        DNode<E> node  = (DNode<E>) p;

        if(node.getId() != this)
            throw new RuntimeException("The position dows not belong to this list.");

        return node;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Position<E> addLast(E value) {   //Protegido contra nulls

        DNode<E> newNode;

        if(this.isEmpty()){

            newNode = new DNode<>(null,null,value,this);
            this.head = newNode;
            this.tail = newNode;

        }else{

            newNode = new DNode<>(this.tail,null,value,this);
            this.tail.setNext(newNode);
            this.tail = newNode;

        }

        return newNode;
    }

    public Position<E>  add(int index, E value) {
        return null;
    }

    public E remove(Position<E> p) throws RuntimeException{
        DNode<E> node = checkPosition(p);
        E elem = p.getValue();

        if(this.head  == this.tail) {

            this.head = null;
            this.tail = null;

        }else if(node == this.head){

            this.head = this.head.getNext();
            this.head.setPrev(null);

        } else if(node == this.tail){

            this.tail = node.getPrev();
            this.tail.setNext(null);

        }else{

            DNode<E> nodePrev = node.getPrev();
            DNode<E> nodeNext = node.getNext();

            nodePrev.setNext(nodeNext);
            nodeNext.setNext(nodePrev);

        }
        this.size--;
        return elem;
    }

    public E remove(int index) {
        return null;
    }

    public E get() {
        return null;
    }

    public E get(int index) {
        return null;
    }

    public int search(E value) {
        return 0;
    }

    public boolean contains(E value) {
        return false;
    }
}
