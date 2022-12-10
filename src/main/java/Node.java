public class Node<T> {


    private Node<T> prev;

    private final T value;

    private Node<T> next;

    public Node(T value) {
        this.value = value;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
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

    @Override
    public String toString() {
        return "Elements[ " +
                "prev: " + prev +
                ", value: " + value +
                ", next: " + next +
                " ] ";
    }
}
