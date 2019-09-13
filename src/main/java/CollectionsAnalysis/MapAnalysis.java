package CollectionsAnalysis;



import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


/**
 * @auther GeLinBo
 * @date 2019/9/13 14:26
 */

public class MapAnalysis {

    @Test
    public void test2() throws Exception {



        Map<String, String> map = new HashMap<String, String>(1);
//        map.put("hahaha", "hollischuang");

        Class<?> mapType = map.getClass();
        Field f = mapType.getDeclaredField("table");
        f.setAccessible(true);
        Object[] obj = (Object[])f.get(map);
        System.out.println(obj.length + "---");


        Method capacity = mapType.getDeclaredMethod("capacity");
        capacity.setAccessible(true);
        System.out.println("capacity : " + capacity.invoke(map));

    }

    @Test
    public void test1(){
        Map<String, Integer> map = new HashMap();
        map.put("hh", 1);
        map.put("jj", 2);
        map.put("hh", 11);
        map.put("pp", 13);
        map.put("yy", 12);
        HashMap map1 = new HashMap();





        //几种遍历方法的比较
        //1、对于key和value都需要的时候
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
        }
        System.out.println();
        //2、对map中的keys和values分别遍历  此方法效率较高 推荐
        for(String str : map.keySet()){
            System.out.print(str + " ");
        }
        System.out.println();
        for(Integer num : map.values()){
            System.out.print(num + " ");
        }
        System.out.println();
        //3、使用iterator迭代
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        Iterator iterator1 = map.entrySet().iterator();
        while(iterator1.hasNext()){
            System.out.print(iterator1.next() + " ");
        }
        System.out.println();

        //4、通过键值key遍历
        for(String s : map.keySet()){
            System.out.print(s + "=" + map.get(s) + " ");
        }

    }

}
