import java.util.Arrays;

public class Stack {
    private int index = -1;
    private Object[] arr;

    public Stack() {
        arr = new Object[0];
    }

    public Stack(int size) {
        arr = new Object[size];
    }

    public boolean push(Object object) {
        if (object == null) {
            throw new IllegalArgumentException();
        }

        if (index + 1 == arr.length) {
            return false;
        }
        try {
            index++;
            arr[index] = object;
            return true;
        } catch (IndexOutOfBoundsException e) {
        }
        return false;
    }

    public Object pop() {
            if (index == -1) {
                return null;
            }
        index--;
        return arr[index + 1];
    }

    public boolean isEmpty() {
        return index == -1;
    }

    public boolean isFull() {
        return index == arr.length - 1;
    }

    public void clear() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = null;
        }
    }

    public Object top() {
        try {
            return arr[index];
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public int size() {
        int count = 0;
        for (Object obj : arr) {
            if (obj != null) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Stack" + Arrays.toString(arr);
    }
}
