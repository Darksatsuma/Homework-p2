package informatics;
import java.util.Arrays;
/**
 * Created by asus pc on 15.06.2017.
 */
public class ComparableHeap <K extends Comparable,V> {
    private class Entry<K extends Comparable,V>{
        private K key;
        private V value;

        public void setValue(V value) {
            this.value = value;
        }

        public K getKey() {

            return key;
        }

        public V getValue() {
            return value;
        }

        public Entry(K key, V value) {

            this.key = key;
            this.value = value;
        }
    }
    Entry<K,V>[] data;
    int capacity=10;
    int size;
    public ComparableHeap() {
        size=0;
        data=new Entry[capacity];
    }

    public void add(K k, V v) {
        Entry<K,V>val=new Entry<>(k,v);
        if(size==capacity-1){
            expand();
        }
        data[size]=val;
        pushTop(size);
        size++;

    }

    public void swap(int a, int b) {
        Entry<K,V> k=data[a];
        data[a]=data[b];
        data[b]=k;
    }

    public V pop() {
        V a=data[0].getValue();
        size--;
        data[0]=data[size];
        pushBottom(0);
        return a;
    }

    public void pushTop(int i) {
        int p=(i-1)/2;
        if (i==0)return;
        if(data[i].getKey().compareTo(data[p].getKey())==1){
            swap(i,p);
            pushTop(p);
        }
    }

    public void pushBottom(int i) {
        int i1=i*2+1;
        int i2=i*2+2;
        if(i==size||(i1>size-1&&i2>size-1))return;
        if (data[i].getKey()==min(max(data[i1].getKey(), data[i2].getKey()), data[i].getKey())){
            if(data[i1].getKey().compareTo(data[i2].getKey())==1){
                swap(i,i1);
                pushBottom(i1);
            }else {
                swap(i,i2);
                pushBottom(i2);
            }
        }
    }
    K min(K k1,K k2){
        if(k1.compareTo(k2)==1)return k2;
        return k1;
    }
    K max(K k1,K k2){
        if(k1.compareTo(k2)==-1)return k2;
        return k1;
    }
    public void expand() {
        capacity*=2;
        Entry<K,V>[] b= Arrays.copyOf(data, capacity);
        data=b;
    }
}
