package algorithms;

import java.util.Arrays;

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
        if(size==a.length-1){
            this.expansion();
        }
        size=size+1;
        a[size]=element;
    }
    void pop(){
        a[size]=0;
    }
    void expansion(){
        int [] b;
        b= Arrays.copyOf(a,a.length*2);
        a=b;
    }
}
