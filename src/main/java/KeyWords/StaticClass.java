package KeyWords;

import java.util.ArrayList;
import java.util.List;


/**
 * @auther GeLinBo
 * @date 2019/9/10 11:22
 */

public class StaticClass extends KeyWordsAnalysis{

    public int m = 1;

    public static List<String> LIST = new ArrayList(){{
        System.out.println("子类静态变量初始化");
    }};

    static{
//        int num = m;
        System.out.println("子类静态块初始化");
    }

    public StaticClass(){
        System.out.println("子类构造方法初始化");
    }

    public static void testStatic(){
        System.out.println("子类静态方法被调用");
    }

    public static void main(String[] args){


        System.out.println("main方法执行");
        new StaticClass();
    }
}
