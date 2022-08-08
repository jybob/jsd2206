package day09;

import java.util.HashSet;
import java.util.Set;

/**
 * 生成10个0-100之间的不重复的随机数,并输出
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) {
		Set<Double> set=new HashSet<>();
		for (int i = 0; i < 10; i++) {
			set.add(Math.random()*100);
		}
		System.out.println(set);
	}
}
