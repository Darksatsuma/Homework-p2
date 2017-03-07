package algorithms;

public class Deque {
    private int size;
    private int [] a;
    public Deque(int size){
        this.size=size;
        a=new int[size];
    }
    void clear(){
        a=null;
    }
    int first(){
        return(a[0]);
    }
    int last(){
        return (a[size]);
    }
    int size(){
        return(size);
    }
    void push(int element){
        size=size+1;
        a[size]=element;
    }
    void popFirst(){
        for(int i=0;i<size-1;i++){
            a[i]=a[i+1];
        }
    }
    void popLast(){
        a[size]=0;
    }
}
