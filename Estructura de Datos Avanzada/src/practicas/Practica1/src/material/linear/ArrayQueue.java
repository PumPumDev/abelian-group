package material.linear;

import java.util.Arrays;

public class ArrayQueue<E> implements Queue<E> {

    final static int DEFAULT_CAPACITY = 2;

    E[] array;
    int size;
    int front, tail;
    int capacity;

    public ArrayQueue() {

        this(DEFAULT_CAPACITY);

    }

    public ArrayQueue(int capacity) {

        this.array = (E[]) new Object[capacity];

        this.capacity = capacity;
        this.front = 0;
        this.tail = 0;
        this.size = 0;


    }


    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {

        return this.size == 0;

    }

    private boolean isFull() {
        return this.size == this.capacity;
    }

    private boolean reSizeing() {

        try {
            E[] aux = (E[]) new Object[2 * this.capacity];

            int i = 0;
            while (!this.isEmpty()) {
                aux[i] = this.dequeue();
                i++;
            }

            this.size = this.capacity;
            this.capacity *= 2;
            this.array = aux;
            this.tail = i;
            this.front = 0;

        } catch (Exception e) {
            return false;
        }

        return true;

    }

    @Override
    public E front() throws RuntimeException {

        if (this.isEmpty())
            throw new RuntimeException("Queue is empty");

        return this.array[this.front];

    }

    @Override
    public void enqueue(E element) {

        //Caso Array lleno -> Redimensionamiento
        if (this.isFull())
            reSizeing();

        //Caso normal
        this.array[this.tail] = element;
        this.tail = (this.tail + 1) % this.capacity;

        this.size++;


    }

    @Override
    public E dequeue() {

        if (this.isEmpty())
            throw new RuntimeException("Queue is empty");

        E element = this.front();
        this.front = (this.front + 1) % this.capacity;
        this.size--;

        return element;

    }
}
