package algorithms;
//
public class Enqueue {
    private int size;
    private int [] a;
    //
    public Enqueue(int size){
        this.size=size;
        a=new int[size];
    }
    void clear(){
        a=null;
    }
    int top(){
        return(a[0]);
    }
    int size(){
        return(size);
    }
    void push(int element){
        size=size+1;
        a[size]=element;
    }
    void pop(){
        for(int i=0;i<size-1;i++){
            a[i]=a[i+1];
        }
    }
}

