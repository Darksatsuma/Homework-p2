package algorithms;

import java.util.*;
import java.util.Stack;

/**
 * Created by asus pc on 08.04.2017.
 */
public class Dfs {
    int size;
    boolean[][] a;
    public Dfs(boolean[][] a,int size){
        this.a=a;
        this.size=size;
    }
    public void Dfs(int k){
        java.util.Stack<Integer> stack=new Stack<>();
        stack.push(k);
        boolean[] mark=new boolean[size];
        Arrays.fill(mark,false);
        mark[k]=true;
        while (!stack.isEmpty()){
            int v=stack.pop();
            for(int i=0;i<size;i++){
                if(a[v][i]&&(!mark[i])){
                    stack.push(i);
                }
            }
        }
    }
}
