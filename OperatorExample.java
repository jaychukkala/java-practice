public class OperatorExample { public static void main(String[] args) {
    int x =10;
    System.out.println("x = " + x);
    System.out.println("x++ = " + x++);
    System.out.println("x = " + x);
    System.out.println("++x = " + ++x);
    System.out.println("x = " + x);


//  T && T--> T    T ||T==T
//        T&& F-->F    T|| F-->T
//        F&&T --F     F||T-->T
//        F&&F=F   F||F==F
//        &&->|
    int age = 18;
    char Gender = 'F';
    int x1 = 6;
    if(++age>=18 | Gender == 'M'){
        System.out.println("you are inside");
    } else {
        System.out.println("else block");
    }

    System.out.println("age = " + age);
    System.out.println("x1 = " + x1);


    int var = 13;
    if(var%2 == 0){
        System.out.println("Even");
    } else{
        System.out.println("Odd");
    }

    System.out.println(var%2 == 0? "Even" : "Odd");

}
}
