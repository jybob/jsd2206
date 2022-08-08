package collection1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 增强型for循环,JDK1.5之后推出的一个新特性.
 * 可以让我们用相同的语法遍历集合或数组
 * 语法:
 * for(类型 变量名 : 集合或数组){
 *     ...
 * }
 *
 */
public class NewForDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        for(int i=0;i<array.length;i++){
            String str = array[i];
            System.out.println(str);
        }
        //新循环遍历数组会被编译器改回成普通for循环
        for(String str : array){
            System.out.println(str);
        }
        /*
            JDK5之后推出的另一个特性:泛型
            泛型也称为参数化类型,允许我们在使用一个类时,传入某个类型来规定其内部的属性,方法的参数或
            方法返回值的类型,使得我们使用时更加方便.
            在集合中泛型被广泛使用,用于规定集合中的元素类型.

            泛型原型为Object,编译器认可.
            赋值操作时,编译器会检查类型是否匹配.不匹配会编译不通过
            获取泛型的值时,编译器会补充造型操作.
         */
        //Collection<E>
        Collection<String> c = new ArrayList<>();
        c.add("one");//add(E e)==>add(String e)
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
//        c.add(123);//编译不通过,实参类型违背了当前集合指定的泛型E的实际类型String

        Iterator<String> it = c.iterator();//迭代器指定的泛型应当与其遍历的集合泛型一致
        while(it.hasNext()){
            String str = it.next();//指定泛型后,获取元素无需再手动造型
            System.out.println(str);
        }

        //新循环遍历集合会被编译器改回成迭代器遍历
        for(String str : c){//集合指定泛型后,可直接用元素类型接收元素,编译器会补充造型操作.
            System.out.println(str);
        }





    }
}








