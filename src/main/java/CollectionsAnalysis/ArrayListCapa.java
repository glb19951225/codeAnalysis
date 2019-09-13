package CollectionsAnalysis;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * @auther GeLinBo
 * @date 2019/9/11 22:33
 */

public class ArrayListCapa {
    public static void main(String[] args){
        ArrayList<Integer> squares = new ArrayList<Integer>(3);
        squares.add(1);

        Class c=((Object)squares).getClass();
        Field f;
        try {
            f = c.getDeclaredField("elementData");
            f.setAccessible(true);
            try {
                Object[] o=(Object[]) f.get(squares);
                System.out.println(o.length);

            } catch (IllegalArgumentException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (NoSuchFieldException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}