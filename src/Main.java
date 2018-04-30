public class Main {

    public static void main(String[] args) {
        TwoStackQueue<Integer> queue = new TwoStackQueue<>(10);

        for (int i = 0; i <10; i++) {
            queue.enqueue(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(queue.dequeue());
        }
    }
}
