package ch06.test;

import ch06.Person;

class A{}

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person(1,"tom");
        Person p2 = new Person(1,"Jerry");

        System.out.println(p1.toString());
        //打印一个对象和打印一个对象toString方法一样
        //toString就是Object中的方法，会输出“类名@哈希码”
        System.out.println(Integer.toHexString(p1.hashCode()));


        System.out.println(p2);
        System.out.println(Integer.toHexString(p2.hashCode()));


//
//        Something something = new Something();
//        something.foo();
//        //something.i=1;
//        //protected包含了包访问权限（默认的）
//
//        A a1 = new A();
//        A a2 = new A();
//        A a3 = a1;
//
//        System.out.println(a1.equals(a3));//true
//        System.out.println(a2==a3);//false
//        //做==的是两个对象地址是否相同，与对象的内容无关
//
//        String s1 =new String("hello");
//        String s2 =new String("hello");
//        System.out.println(s1.equals(s2));//true
//        //String的equals对object的equals做了覆盖
//        //覆盖后的规则是比较两个字符串的内容时候相同
//        System.out.println(s2==s1);//false
//        //new出来的各个对性爱那个彼此都是不相等的
//
//        String s3 = "hello";
//        String s4 = "hello";
//        System.out.println(s3.equals(s4));//true
//        System.out.println(s3==s4);//true



    }
}


//public > protected(受保护的)  > 默认(包访问) > private(私有)