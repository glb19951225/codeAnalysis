package stringAndLong;

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
        Scanner sc = new Scanner(System.in);
        String s9 = sc.nextLine();
        System.out.println(s9.hashCode());

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
    }

}
