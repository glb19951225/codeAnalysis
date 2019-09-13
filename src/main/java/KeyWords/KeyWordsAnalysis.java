package KeyWords;

import java.util.ArrayList;
import java.util.List;


/**
 * @auther GeLinBo
 * @date 2019/9/10 11:12
 */

public class KeyWordsAnalysis {

    public static int num = 0 ;


    public static List<String> LIST = new ArrayList<String>(){{
        System.out.println("父类静态变量初始化");
        System.out.println(KeyWordsAnalysis.num);
    }};


    static{

        System.out.println("父类静态块初始化");
    }

    public KeyWordsAnalysis(){
        System.out.println("父类构造器初始化");
    }


    public static void testStatic(){
        System.out.println("父类静态方法被调用");
    }

    public static void main(String[] args) {
        KeyWordsAnalysis.num = 1;
        System.out.println(num);
    }
}
