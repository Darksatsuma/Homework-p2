package algorithms;

import java.util.LinkedList;
import java.util.Scanner;

public class MinsOnSegments {
    public static void main(String[] args) {
        SpecialQueue queue = new SpecialQueue();
        int n, k;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < k; i++) {
            queue.push(a[i]);
        }
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.push(queue.min());
        for (int i = k; i < n; i++) {
            queue.push(a[i]);
            queue.pop();
            l.add(queue.min());
        }
        System.out.println(l.toString());
    }
}
