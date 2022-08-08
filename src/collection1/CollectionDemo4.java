package collection1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合之间的操作
 */
public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
//        Collection c1 = new HashSet();
        c1.add("java");
        c1.add("c++");
        c1.add(".net");
        System.out.println("c1:"+c1);

        Collection c2 = new ArrayList<>();
        c2.add("android");
        c2.add("ios");
        c2.add("java");
        System.out.println("c2:"+c2);
        /*
            boolean addAll(Collection c)
            将参数给定的集合中所有元素添加到当前集合中.添加后当前集合发生了改变则返回true.
         */
        c1.addAll(c2);
        System.out.println("c1:"+c1);
        System.out.println("c2:"+c2);

        Collection c3 = new ArrayList();
        c3.add("c++");
        c3.add("android");
        c3.add("php");
        System.out.println("c3:"+c3);
        /*
            boolean containsAll(Collection c)
            判断当前集合是否包含参数集合中的所有元素
         */
        boolean contains = c1.containsAll(c3);
        System.out.println("包含所有:"+contains);


        System.out.println("c1:"+c1);
        System.out.println("c3:"+c3);
        /*
            取交集,仅保留c1中与c3的共有元素.
         */
//        c1.retainAll(c3);
        /*
            删交集,将c1中与c3的共有元素删除.
         */
        c1.removeAll(c3);
        System.out.println("c1:"+c1);
        System.out.println("c3:"+c3);

    }
}
