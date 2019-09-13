package CollectionsAnalysis;

import java.util.*;

/**
 * @auther GeLinBo
 * @date 2019/9/11 21:58
 */

public class ArrayListAnalysis {

    public static void test2(){
        System.out.println("hh");
    }

    public static void test1(){
        test2();
    }


    public static void main(String[] args) {

        ArrayList list = new ArrayList(4);
        System.out.println(list.size());

        list.add(1);
        System.out.println(list.size());
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list.size());

        System.out.println("--------------");

        Object[] obj = new Object[4];
        System.out.println(obj.length);

        Set set = new HashSet();
        ArrayList list1 = new ArrayList(set);

        System.out.println(list1.size());

        list1.add(null);
        System.out.println(list1);


    }

}
