package algorithms;

public class SpecialStack {
    java.util.Stack data;

    public SpecialStack() {
        data = new java.util.Stack();
    }

    public void push(int val) {
        data.push(new Pair(val, Math.min(val, min())));
    }

    public int pop() {
        int a;
        Pair b = (Pair) data.pop();
        a = b.getA();
        return a;
    }

    public int look() {
        int a;
        Pair b = (Pair) data.peek();
        a = b.getA();
        return a;
    }

    public int min() {
        int a;
        Pair b = (Pair) data.peek();
        a = b.getB();
        return a;
    }

    public long getSize() {
        return data.size();
    }
}
