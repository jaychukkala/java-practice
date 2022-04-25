import java.util.Scanner;

public class FunctionExample {//    access_specifier-public, protected, private and default
//    return type-- data type
//    access_specifier return_type function name(argument){
//    function body
//    }

    public void show(){  //defining the function
        System.out.println("this is called from function");
    }
    public float show(int a, int b){
        float c = a+b;
        return c;
    }
    public void show(float a, int b){
        System.out.println(a+b);
    }
    public void show(int a, int b, float c){
        System.out.println(a+b+c);
    }

    public float add(float f,float r){
        float y= f+r;
        return y;
    }

    public String abc(String mesg){
        return "Welcome";
    }

    public void xyz(String a){
        System.out.println("from function =" +a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A");
        int a = sc.nextInt();
        System.out.println("Enter value of B");
        int b = sc.nextInt();
        FunctionExample object = new FunctionExample();
        object.show();  // calling the f unction
        System.out.println(object.show(a,b));
        object.show(4,7, 3.4F);
        object.show(6.7f,5);
        System.out.println(object.add(6.7f,5.6f));
        String m = object.abc("hello");
        object.xyz(object.abc("hello"));
        System.out.println(m);
    }
}

class A{
    public static void main(String[] args) {
        FunctionExample obb = new FunctionExample();
        obb.show();
    }
}

class B{

}

