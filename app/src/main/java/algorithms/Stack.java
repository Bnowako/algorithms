package algorithms;

// Stack implemented using linkedList
class Stack<T> {

    private Node<T> first;
    private int N;


    public void push(T item) {
        Node<T> oldFirst =  first;
        first = new Node<>();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    public Node<?> pop() {
        Node<T> oldFirst =  first;
        first = oldFirst.next;
        N--;
        return oldFirst;
    }

    private static class Node<T> {
        T item;
        Node<T> next;

    }

}
