public class ConstructorExample {  ConstructorExample(){
    System.out.println("THis is from constructor");
}
    ConstructorExample(int a){
        System.out.println("THis is from constructor"+a);

    }
    ConstructorExample(int a, float b){
        System.out.println("THis is from constructor"+(a+b));
    }

    public static void main(String[] args) {
        ConstructorExample c1 =  new ConstructorExample();
        ConstructorExample c2 =  new ConstructorExample(5);
        ConstructorExample c3 =  new ConstructorExample(5,7.8f);
    }
}
