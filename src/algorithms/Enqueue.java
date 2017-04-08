package algorithms;
//
public class Enqueue {
    Deque data;
    public void push(int val){
        data.pushTop(val);
    }
    public int pop(){
        return data.popBottom();
    }

    public Enqueue() {
        this.data = new Deque();
    }

    public int look(){
        return data.lookBottom();
    }
    public long getSize(){
        return data.getSize();
    }
}

