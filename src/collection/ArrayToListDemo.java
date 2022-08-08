package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为集合
 * 数组的工具类java.util.Arrays提供了一个静态方法:asList
 * 该方法可以将一个数组转换为一个List集合
 */
public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        System.out.println("array:"+ Arrays.toString(array));

        //asList方法会返回Arrays定义的内部类ArrayList,该集合内部直接引用给定数组array
        List<String> list = Arrays.asList(array);
        System.out.println("list:"+list);
        //因为集合直接引用数组array,所以对该集合操作就是对array数组的操作
        list.set(1,"six");
        System.out.println("list:"+list);
        System.out.println("array:"+ Arrays.toString(array));
        //对数组操作后,集合也会改到改变.
        array[2] = "seven";
        System.out.println("array:"+ Arrays.toString(array));
        System.out.println("list:"+list);
        //添加元素相当于要对数组扩容,数组是定长的不可以真实的扩容,因此会抛出不支持该操作的异常.删除也是一样的
//        list.add("!!!!!");

        /*
            如果我们需要增删元素,可另行创建一个集合同时包含该集合元素即可.
         */
        List<String> list2 = new ArrayList<>(list);//等同于先new再addAll()
//        Set<String> set = new HashSet<>(list);//等同于先new再addAll()

        System.out.println("list2:"+list2);
        list2.add("!!!!");
        System.out.println("list2:"+list2);


    }
}
