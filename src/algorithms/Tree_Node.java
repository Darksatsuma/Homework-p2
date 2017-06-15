package algorithms;

/**
 * Created by asus pc on 15.06.2017.
 */
public class Tree_Node<K extends Comparable, V> implements Comparable {
    K key;
    V value;
    Tree_Node father;

    public void setFather(Tree_Node father) {
        this.father = father;
    }

    public Tree_Node getFather() {

        return father;
    }

    Tree_Node left;
    Tree_Node right;

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setLeft(Tree_Node left) {
        this.left = left;
    }

    public void setRight(Tree_Node right) {
        this.right = right;
    }

    public K getKey() {

        return key;
    }

    public V getValue() {
        return value;
    }

    public Tree_Node getLeft() {
        return left;
    }

    public Tree_Node getRight() {
        return right;
    }

    public Tree_Node(K key, V value) {

        this.key = key;
        this.value = value;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Tree_Node))
            return -1;
        Tree_Node node = (Tree_Node) o;
        return this.key.compareTo(node.key);
    }
}