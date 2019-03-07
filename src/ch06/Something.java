package ch06;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//
public class Something{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);//将数字1放在数组的第0个位置
        list.add(2);//将数字2放在数组的第1个位置
        list.add(3);//将数字3放在数组的第2个位置
        list.forEach(System.out::println);
        list.remove(0);//删除第0个位置的数字
        list.forEach(e -> System.out.printf("%-3d",e));

        System.out.println("\n"+list.get(0)+"\n");


        list.sort(Integer::compareTo);

        Optional<Integer> max =
                list.stream().max(Integer::compareTo);
        System.out.println("\n"+max.get());
    }



//    public void foo(){
//        System.out.println(super.i);
//        System.out.println(super.j);
//    }
//
//    public static void main(String[] args) {
//        Something something = new Something();
//        something.foo();
//    }
//
//
}
