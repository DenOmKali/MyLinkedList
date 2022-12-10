public class LinkedList<T> {

    private Node<T> head;

    public void addFirst(T value){
        final Node<T> element = new Node<>(value);
        element.setNext(head);
        head = element;
    }

    public void addLast(T value){
        if (head == null){
            head = new Node<>(value);
        }

        Node<T> element = head;
        while (element.getNext() != null){
            element = element.getNext();
        }
        element.setNext(new Node<>(value));
    }

    public void add(T add, T delete){

        Node<T> element = head;
        while (element.getNext() != null){
            if (element.getNext().getValue().equals(delete)){
                remove(delete);
                element = new Node<>(add);
                element.setNext(head);
                head = element;
            }
            element = element.getNext();
        }
    }

    public void remove(T value){
        Node<T> element = head;
        while (element.getNext() != null){

            if (element.getNext().getValue().equals(value)){
                element.setNext(element.getNext().getNext());
            }
            element = element.getNext();
        }
    }

    public int get(T t){
        if (head == null){
            return -1;
        }

        if (head.getValue() == t){
            return 0;
        }

        Node<T> element = head;
        int result = 0;
        while(element.getNext() != null){
            ++result;
            if (element.getNext().getValue() == t){
                return result;
            }
            element = element.getNext();
        }

        return -1;
    }

    public int size(){
        int size = 0;
        Node<T> element = head;
        while (element.getNext() != null){
            element = element.getNext();
            size++;

        }

        return size + 1;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}
