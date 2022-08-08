package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * java.util.List接口
 * List继承自Collection,是可以存放重复元素且有序的集合.
 * 特点:可以通过下标操作元素,使用更灵活.
 * List常用实现类:
 * java.util.ArrayList:内部使用数组实现,查询性能更好(随机访问)
 * java.util.LinkedList:内部使用链表实现,增删元素性能更好,首尾增删性能最佳.
 *
 * 在对集合操作的性能没有特别苛刻要求时,通常ArrayList是最好的选择.
 *
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        List<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println("list:"+list);
        /*
            List接口中提供了一套可以通过下标操作元素的方法

            E get(int index)
            获取指定下标对应的元素
         */
        String e = list.get(2);
        System.out.println(e);

        for(int i=0;i<list.size();i++){
            e = list.get(i);
            System.out.println(e);
        }

        /*
            E set(int index, E e)
            将给定元素设置到指定位置,返回值为被替换的元素.
         */
        String old = list.set(2,"six");
        System.out.println(list);
        System.out.println(old);


        //将集合反转
//        Collections.reverse(list);
        // 0    1    2    3     4
        //[five, two, six, four, one]
        for(int i=0;i<list.size()/2;i++){
//            String str = list.get(i);//获取正数位置上的元素
//            str = list.set(list.size()-1-i,str);//将正数位置的元素设置到对应的倒数位置上
//            list.set(i,str);//将之前倒数位置的元素设置到正数位置完成交换

            list.set(i,list.set(list.size()-1-i,list.get(i)));
        }

//        for(int i=0;i<list.size()/2;list.set(i,list.set(list.size()-1-i,list.get(i++))));

        //java.util.Collections是集合的工具类
        Collections.reverse(list);//反转集合元素
        //[five,four,six,two,one]
        System.out.println(list);


    }
}








