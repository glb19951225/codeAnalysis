package CollectionsAnalysis;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther GeLinBo
 * @date 2019/9/11 15:56
 */

public class Analysis {


    public void test1() {

        List<Integer> list = Arrays.asList(1,2);
        for (int num : list) {
            System.out.println(num);
        }

        Integer[] arr = {1,2,3};
        List<Integer> list1 = Arrays.asList(arr); //此处数组的类型必须是包装类
        for(int num : list1){
            System.out.println(num);
        }

        List<String> list2 = Arrays.asList("hello,world");
        System.out.println(list2.size());

        ArrayList list3 = new ArrayList();
        list3.add(1);
        list3.add(null);
    }

    public Analysis(){
        System.out.println("11");
    }

    public Analysis(int num){
        System.out.println("222");
    }


    public static void main(String[] args){
        Analysis analysis = new Analysis(1);
    }

}
