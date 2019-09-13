package stringAndLong;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @auther GeLinBo
 * @date 2019/9/9 9:38
 */

public class StringAnalysis {

    public static void main(String[] args) throws Exception{
        String s = "hello";
        System.out.println(s.hashCode());
        s = "world";
        System.out.println(s.hashCode());   //赋值前后s的hashcode值发生变化

        s.replace("w", "p");

        s.replace('w', 'q');
        System.out.println(s);

        String s1 = s.replace('w', 'o');
        System.out.println(s);
        System.out.println(s1);


        String s2 = "这是乱码一个测试";
        byte[] bytes = s2.getBytes("ISO-8859-1");
        String s3 = new String(bytes,"ISO-8859-1"); //ISO-8859-1编码对中文支持有限
        System.out.println(s3);

        byte[] bytes1 = s2.getBytes("utf-8");
        String s4 = new String(bytes1);
        System.out.println(s4); //成功输出正确结果 utf-8编码


        String s5 = new String("test");
        String s6 = "test";
        String s7 = "test";
        String s8 = new String("test");
        System.out.println(s5.hashCode());
        System.out.println(s6.hashCode());
        System.out.println(s7.hashCode());
        System.out.println(s8.hashCode());
        System.out.println("test".hashCode());
//        Scanner sc = new Scanner(System.in);
//        String s9 = sc.nextLine();
//        System.out.println(s9.hashCode());

        System.out.println(s5.equals(s6));
        System.out.println(s5.equals(s7));
        System.out.println(s5.equals(s8));

        String s10 = "hello world ll";

        String s11 = s10.replace("l", "5");
        String s12 = s10.replaceAll("l", "5");
        System.out.println(s11);
        System.out.println(s12);

        String s13 = "hello:world:6 5";
        String[] strings = s13.split(":",2);
        for(String ss : strings){
            System.out.println(ss);
        }
//        int i=0;
//        for(int i = 0; i < 10; i++){
//
//        }



        /*
        * String str1= “abc”； 在编译期，JVM会去常量池来查找是否存在“abc”，如果不存在，
        * 就在常量池中开辟一个空间来存储“abc”；如果存在，就不用新开辟空间。
        * 然后在栈内存中开辟一个名字为str1的空间，来存储“abc”在常量池中的地址值。

          String str2 = new String("abc") ;在编译阶段JVM先去常量池中查找是否存在“abc”，
        * 如果过不存在，则在常量池中开辟一个空间存储“abc”。在运行时期，通过String类的构造器在堆内存中new了一个空间，然后将String池中的“abc”复制一份存放到该堆空间中，在栈中开辟名字为str2的空间，存放堆中new出来的这个String对象的地址值。
          也就是说，前者在初始化的时候可能创建了一个对象，也可能一个对象也没有创建；后者因为new关键字，至少在内存中创建了一个对象，也有可能是两个对象。

        * */

        String s14 = new String("test");
        String s17 = new String("test");
        String s16 = "test";
        String[] strings1 = {"test","test","ss"};

        for (int i = 0; i < strings1.length; i++) {
            System.out.println(strings1[i].hashCode());
        }

        System.out.println(s14 == strings1[0]);
        System.out.println(s16 == strings1[0]);
        System.out.println(s14 == s16);
        System.out.println(strings1[0] == strings1[1]);

        System.out.println(s14.equals(strings1[0]));
        System.out.println(strings1[0].equals(strings1[1]));

        System.out.println(s14 == s17);
        System.out.println(s14.equals(s17));

//        ArrayList<Integer> list;
//        list.add(1);
    }

//    public String replaceSpace(StringBuffer str) {
//        String s = str.replace()
//        return s;
//    }

}
