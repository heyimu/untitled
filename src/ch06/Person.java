package ch06;

import java.util.Objects;

public class Person {

    public String name;
    public int i;



    public Person(int i, String name) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return i == person.i &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, name);
    }
//
//    //public private 默认不写
//    protected int i = 1;
//    //protected指在之类中可以访问父类的受保护成员和方法
//
//    int j =1;
//    public Person(){}
//
//     void foo(){
//
//    }
//    //1.一个类中如果有抽象类，这个类就必须是抽象类
//    //2.抽象爱那个方法没有方法体，既没有{}
//    //3.抽象方法必须在之类中覆盖（重写），如果不覆盖那么之类就需要变得抽象
//    //4.父类的方法是普通方法，之类可以对其覆盖，甚至可以将其覆盖为为抽象的。
//
//    //抽象类能有构造器，给子类使用super
//    public static void main(String[] args) {
//
//        //Person person = new Person();
//  }
}
