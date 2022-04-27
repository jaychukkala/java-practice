


interface I1{
    default void show1(){
        System.out.println("show1");
    }
    static void show2(){
        System.out.println("from show2");
    }
    void show();

    default void display(){

    }
}

public class InterfaceExample implements I1  {

    @Override
    public void show() {
        System.out.println("from child class");
    }
    public static void main(String[] args) {
        I1 obj = new InterfaceExample();
        obj.show();
        obj.show1();
        I1.show2();
    }
}

@FunctionalInterface
interface I2{
    void add(int a);
    default void add1(){

    }
}
class Inter {
    public static void main(String[] args) {
        I2 obj2 = new I2() {
            @Override
            public void add(int a) {
                System.out.println("from add method");
            }
        };

        obj2.add(4);

        I2 obj3 =  (y) ->{
            System.out.println("from lambda add method  -  "+y);
        };

        obj3.add(6);


    }
}
