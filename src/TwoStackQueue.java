public class TwoStackQueue<T> {
    private Stack pushStack;
    private Stack popStack;
    private int index = -1;
    int size;

    public TwoStackQueue() {
        pushStack = new Stack();
        popStack = new Stack();
    }

    public TwoStackQueue(int size) {
        pushStack = new Stack(size);
        popStack = new Stack(size);
        this.size = size;
    }

    public boolean enqueue(T t) {
        if (t == null) {
            throw new IllegalArgumentException();
        }
        if (index == size - 1) {
            return false;
        }
        pushStack.push(t);
        index++;
        return true;
    }

    public T dequeue() {
        if (index == -1) {
            return null;
        }

        if (popStack.isEmpty()) {
            for (; !pushStack.isEmpty(); ) {
                popStack.push(pushStack.pop());
            }
        }
        index--;
        return (T) popStack.pop();  //Так нельзя((
    }

    public boolean isEmpty() {
        return index == -1;
    }

}
