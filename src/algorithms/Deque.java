package algorithms;

public class Deque {
    Node tail;
    Node head;
    long size=0;

    public Deque() {
    }
    void pushTop(int v){
        Node n=new Node(v);
        if (size==0){
            head=n;
            tail=n;
            size++;
            return;
        }
        if(size==1){
            tail=n;
            head.setNext(n);
            n.setPrev(head);
            size++;
            return;
        }
        tail.setNext(n);
        n.setPrev(tail);
        tail=n;
        size++;
    }
    void pushBottom(int v){
        Node n=new Node(v);
        if (size==0){
            head=n;
            tail=n;
            size++;
            return;
        }
        if(size==1){
            head=n;
            tail.setPrev(n);
            n.setNext(tail);
            size++;
            return;
        }
        head.setPrev(n);
        n.setNext(head);
        head=n;
        size++;
    }
    int popTop(){
        int v;
        v=tail.getValue();
        tail=tail.getPrev();
        tail.setNext(null);
        size--;
        return v;
    }

    public long getSize() {
        return size;
    }

    int popBottom(){
        int v;
        v=head.getValue();
        head=head.getNext();
        head.setPrev(null);
        size--;

        return v;
    }
    int lookTop(){
        return tail.getValue();
    }
    int lookBottom(){
        return head.getValue();
    }
}
