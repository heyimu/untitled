package ch06.test;

public class Test3 {
    void foo(int i , double...d){
        System.out.print(i+"...");
        for(int j=0; j<d.length; j++)
            System.out.printf("%-3f", d[j]);

    }

    public static void main(String[] args) {
        Test3 t3 =new Test3();
        t3.foo(1);
        System.out.println("\n*******************************\n");
        t3.foo(1, 2,3,4,5,6);
    }

}
