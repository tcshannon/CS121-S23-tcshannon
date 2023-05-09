//*******************************************************************
// Activity 33 part 1 of 2
// Name: [Your name here]
// Date: [Date]
//*******************************************************************
// This class implements a queue using a linked list. It provides
// methods to add elements to the back of the queue, remove elements
// from the front of the queue, check if the queue is empty, get the
// number of elements in the queue, and peek at the element at the
// front of the queue without removing it.
//*******************************************************************


public class LinkedListQueue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedListQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    public void enqueue(T value) {
        Node<T> newNode = new Node<>(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public T dequeue() {
        if (head == null) {
            return null;
        }
        T value = head.getValue();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public T peek() {
        if (head == null) {
            return null;
        }
        return head.getValue();
    }

    private static class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }

        public T getValue() {
            return value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
