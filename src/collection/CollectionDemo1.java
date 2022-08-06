package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);
        int size=c.size();
        System.out.println(size);
        boolean isEmpty=c.isEmpty();
        System.out.println(isEmpty);
        c.clear();
        System.out.println(c.size());
        System.out.println(c.isEmpty());
    }
}

