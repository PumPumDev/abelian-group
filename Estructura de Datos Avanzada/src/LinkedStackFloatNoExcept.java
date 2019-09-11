public class LinkedStackFloatNoExcept {
    private class Node{
        private float element;
        private Node next;

        public Node(float element, Node next) {
            this.element = element;
            this.next = next;
        }

        public float getElement() {
            return element;
        }

        public void setElement(float element) {
            this.element = element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public boolean isEmpty(){
            return this==null;
        }
    }


    private int size;
    private Node top;

    public LinkedStackFloatNoExcept() {
        size = 0;
        top = null;
    }

    public float top(){
        if(!isEmpty()){
            return top.getElement();
        }
        System.out.println("The stack is empty");
        return 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public float pop(){
        if (!isEmpty()) {
            float elem = top.getElement();
            top = top.getNext();
            size--;
            return elem;
        }
        System.out.println("The stack is empty");
        return 0;
    }

    public void push(float elem){
        Node node = new Node(elem,top.getNext());
        top = node;
        size++;
    }
}
