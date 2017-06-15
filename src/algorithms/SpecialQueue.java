package algorithms;

public class SpecialQueue {
    SpecialStack a;
    SpecialStack b;

    public SpecialQueue() {
        a = new SpecialStack();
        b = new SpecialStack();
    }

    public void push(int val) {
        a.push(val);
    }

    public int pop() {
        if (b.getSize() == 0) {
            while (a.getSize() > 0) {
                b.push(a.pop());
            }
        }
        return b.pop();
    }

    public int look() {
        if (b.getSize() == 0) {
            while (a.getSize() > 0) {
                b.push(a.pop());
            }
        }
        return b.look();
    }

    public int min() {
        return Math.min(a.min(), b.min());
    }
}
