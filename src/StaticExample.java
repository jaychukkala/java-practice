public class StaticExample {
    static int a;
    int a2;

    //in static function u can use only static variable
    static void show(){
        StaticExample obj = new StaticExample();
        obj.a2 = 6;
        a= 9;
//       a2 =7;
        System.out.println("from static function");
    }

    public static void main(String[] args) {
        StaticExample obj= new StaticExample();
        obj.show();
        show();
        StaticExample.show();

        obj.a = 3;
        obj.a2 = 8;
        StaticExample obj2 = new StaticExample();
        obj2.a =7;
        obj2.a2=5;

        System.out.println(obj.a);  //7
        System.out.println(obj.a2);  //8

        System.out.println(obj2.a);  //7
        System.out.println(obj2.a2); //5

        System.out.println(StaticExample.a);

    }

}
