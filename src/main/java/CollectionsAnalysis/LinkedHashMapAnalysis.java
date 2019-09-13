package CollectionsAnalysis;

import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * @auther GeLinBo
 * @date 2019/9/13 21:11
 */

public class LinkedHashMapAnalysis {

    @Test
    public void test1(){

        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>(0,0.75f,true);
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 3);
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        map.get("1");

        Set<String> set = map.keySet();
        for(String s : set){
            System.out.println(s);
        }

    }
}
