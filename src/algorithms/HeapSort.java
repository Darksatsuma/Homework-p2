package algorithms;

/**
 * Created by asus pc on 15.06.2017.
 */
public class HeapSort {
    void Sort(int[] a){
        Heap b=new Heap();
        for (int i=0;i<a.length;i++){
            b.add(a[i]);
        }
        for(int i=0;i<a.length;i++){
            a[i]=b.pop();
        }
    }
}
