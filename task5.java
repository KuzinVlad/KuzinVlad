class Stack {
    private int mSize; 
    private int[] stackArray;
    private int top;

    public Stack(int m) {
        this.mSize = m;
        stackArray = new int[mSize];
        top = -1;

        public int deleteElement() {
            return stackArray[top--];
        }
