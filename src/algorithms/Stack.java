package algorithms;

public class Stack {
    private int size;
    private int [] a;
    public Stack(int size){
        this.size=size;
        a=new int[size];
    }
    void clear(){
        a=null;
    }
    int top(){
        return(a[size]);
    }
    int size(){
        return(size);
    }
    void push(int element){
        size=size+1;
        a[size]=element;
    }

    void pop(){
        a[size]=0;
    }
}
