package informatics;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by asus pc on 08.04.2017.
 */
public class Billiards {
    public static void main(String[] args) {
        TreeSet<Integer> t=new TreeSet<Integer>();
        Scanner in=new Scanner(System.in);
        while (true){
            String s=in.next();
            if(s.equals("add")){
                t.add(in.nextInt());
            }else if(s.equals("min")){
                int i=t.first();
                System.out.println(i);
                t.remove(i);
            }
            else break;
        }
    }
}
