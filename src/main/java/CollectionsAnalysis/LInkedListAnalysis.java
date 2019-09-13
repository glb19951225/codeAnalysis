package CollectionsAnalysis;

import java.util.*;

/**
 * @auther GeLinBo
 * @date 2019/9/13 10:13
 */

public class LInkedListAnalysis {


    public static void main(String[] args) {


        Integer[] arr = {1,2,4,1,2};
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr));

        String s = Arrays.toString(arr);
        System.out.println(s.length());


        LinkedList<Integer> list = new LinkedList<Integer>(list1);

        ListIterator iterator = list.listIterator(list.size());  //从尾部向前迭代

        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list.size());
        iterator.add(11);
        System.out.println(list.size());


        iterator = list.listIterator();   //从头向后迭代
        System.out.println(iterator.nextIndex() + "----");
        while(iterator.hasNext()){

            System.out.println(iterator.next());
        }

        System.out.println("--------------");
        iterator = list.listIterator(list.size());  //从尾部向前迭代
        System.out.println(iterator.previous());
//        System.out.println(list.size());
//        System.out.println(iterator.nextIndex());
//        while(iterator.hasPrevious()){
//            System.out.println(iterator.previous());
//        }

        if(iterator == null)
        {
            System.out.println("test");
        }

    }

}
