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
}
