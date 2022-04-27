

class C{
    int a;
    void show(){
        System.out.println("from show function");
    }
    public void add(int a, int b){
        System.out.println("form add = "+ (a+b));
    }

}
public class InheritanceExample extends C {

    public void disaplay(){
        System.out.println("from mdisaply");
    }
    public void add(int a , int b){
        System.out.println("form add from sub  class = "+(a+b));
    }
    void show2(){
        System.out.println("from show2");
    }
    public static void main(String[] args) {

        System.out.println(args[0]+"  "+args[1]);
        C obj = new C();
        obj.add(3,4);
//      obj.disaplay();
        obj.show();// this function calling from same class no inheritance

        InheritanceExample obj1 = new InheritanceExample();
        obj1.show(); // this function calling from super class this is inheritance
        obj1.add(3,6);
        obj1.show2();

//        you can call only function which are available in C class.
//        function which not available C but available in child class can not call that function
//        if you want  to call function that function should be available in parent class then only u can call
        C obj3 = new InheritanceExample();
        obj3.add(7,8);  //sub class
//        obj3.show2();
        obj3.show();

    }
}
class D extends  InheritanceExample{

    public static void main(String[] args) {
        D obj = new D();
        obj.show();
        obj.disaplay();
    }

}