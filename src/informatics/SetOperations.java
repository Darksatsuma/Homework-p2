package informatics;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by asus pc on 08.04.2017.
 */
public class SetOperations {
    public static Collection fusion(Collection a,Collection b){
        TreeSet set=new TreeSet();
        set.addAll(a);
        set.addAll(b);
        return set;
    }
    public static Collection interselection(Collection a,Collection b){
        TreeSet set =new TreeSet();
        TreeSet ans=new TreeSet();
        set.addAll(a);
        Iterator i=b.iterator();
        while (i.hasNext()){
            Object o=i.next();
            if(!set.add(o)){
                ans.add(o);
            }
        }
        return ans;
    }
    public static Collection difference(Collection a,Collection b){
        TreeSet i= (TreeSet) interselection(a,b);
        TreeSet set=new TreeSet();
        Iterator it=a.iterator();
        Iterator it1=b.iterator();
        while (it.hasNext()){
            Object o=it.next();
            if(i.add(o))set.add(o);
        }
        while (it1.hasNext()){
            Object o=it1.next();
            if(i.add(o))set.add(o);
        }
        return set;
    }
}
