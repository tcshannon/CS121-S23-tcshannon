//*******************************************************************
// Activity 33 part 2 of 2
// Name: [Your name here]
// Date: [Date]
//*******************************************************************
// This class tests the functionality of the LinkedListQueue class.
// It creates an instance of the LinkedListQueue class and uses its
// methods to add or remove values to the queue or other operations
// so that various results are printed to the console. These results
// are described in the comments within the file.
//*******************************************************************

public class LinkedListQueueTester {
    public static void main(String[] args) {
        LinkedListQueue<String> queue = new LinkedListQueue<>();

        // Add values to the queue
        queue.enqueue("Tom");
        queue.enqueue("Jane");
        queue.enqueue("Beth");
        System.out.println(queue.peek()); // Tom
        System.out.println(queue.dequeue()); // Tom
        queue.enqueue("John");
        queue.enqueue("Mary");
        System.out.println(queue.peek()); // Jane
        System.out.println(queue.isEmpty()); // false
        System.out.println(queue.size()); // 4
        System.out.println(queue.peek()); // Jane
        System.out.println(queue.dequeue()); // Jane
        System.out.println(queue.peek()); // Beth
        System.out.println(queue.dequeue()); // Beth
        System.out.println(queue.peek()); // John
        System.out.println(queue.dequeue()); // John
        System.out.println(queue.peek()); // Mary
        System.out.println(queue.dequeue()); // Mary
        System.out.println(queue.isEmpty()); // true
        System.out.println(queue.peek()); // null
    }
}
