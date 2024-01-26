package main.com.iamcheslin.datastruct;

public class LinkedLists <T> implements List {

    private Node<T> head;

    public LinkedLists(){
        this.head = new Node<>();
    }

    @Override
    @SuppressWarnings("unchecked")
    public void add(Object data) {
        Node<T> node = new Node<>((T)data);
        if(head == null){
            head=node;
        } else {
            Node<T> currentNode = head;
            while(currentNode.getNext() != null){
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(node);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void add(int index, Object data) {
        Node<T> node = new Node<>((T) data);
        if(head == null){
            head=node;
        } else {
            Node<T> currentNode = head;
            for(int i=0;i<index;i++){
                currentNode = currentNode.getNext();
            }
            node.setNext(currentNode.getNext());
            currentNode.setNext(node);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean contains(Object data) {
        Node<T> node = head;
        T d = (T) data;
        while(node.getNext() != null) {
            if(data.equals(node.getData())){
                return true;
            }
            node = node.getNext();
        }
            return false;
    }

    @Override
    public void clear() {
        Node<T> node = head;
        while(node.getNext()!=null){
            node = node.getNext();
            head.setData(null);
            head.setNext(null);
        }
        head.setData(null);
        head.setNext(null);
        node = head;
    }

    @Override
    public T get(int index) {
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getNext().getData();
    }

    @Override
    @SuppressWarnings("unchecked")
    public int indexOf(Object data) {
        T d = (T) data;
        Node <T> node = head;
        int i=0;
        while(node.getNext()!=null){
            if(d.equals(node.getData())){
                return i-1;
            }
            i++;
            node = node.getNext();
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        Node<T> node = head;
        int size = 0;
        while(node.getNext() != null){
            node = node.getNext();
            size++;
        }
        return size==0;
    }

    @Override
    public void remove(int index) {
        Node<T> node = head;
        int i = 0;
        while(node.getNext()!=null){
            if(i==index){
                break;
            }
            i++;
            node = node.getNext();

        }



    }

    @Override
    public Object set(int index, Object data) {
        return null;
    }

    @Override
    public int size() {
        Node<T> node = head;
        int size = 0;
        while(node.getNext() != null){
            node = node.getNext();
            size++;
        }
        return size;
    }
}
