public class ArrayStackFloatNoExcept {
    private int top;
    private int MAX_SIZE;
    private float[] s;

    public ArrayStackFloatNoExcept(int cap){
        this.s = new float[cap];
        this.top = 0;
        this.MAX_SIZE = cap;
    }

    public boolean isEmpty(){
        return this.top == 0;
    }

    public int size(){
        return top;
    }

    public float top(){
        return s[top-1];
    }

    public void push(float e){
        s[top] = e;
        top++;
    }

    public float pop(){
        top--;
        return s[top];
    }


}
