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
            if(!set.add(i.next())){
                ans.add(i.next());
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
            if(i.add(it.next()))set.add(it.next());
        }
        while (it1.hasNext()){
            if(i.add(it1.next()))set.add(it1.next());
        }
        return set;
    }
}
