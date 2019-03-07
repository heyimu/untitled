package ch06.test;

public class Test2 {
    //所有的8中基本都有它对应的类类型，即包装器类型
    //我们将基本类型送给包装器称为装箱，反之叫拆箱
    //包装器可以去值为null，这是基本类型没有的
    //Number是所有赋值类型的父类 Number n = 1;
    public static void main(String[] args) {
        Byte b = 1;     byte b1 = b;//拆箱
        Short s =1;
        Integer i =1;
        Long l = 1L;

        Float f =3.14f;
        Double d =3.14;

        Character c ='a';
        Boolean bool = true;

    }
}
