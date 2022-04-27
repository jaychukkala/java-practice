import java.util.Scanner;

public class swichcase { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter month number");
    int i = sc.nextInt();
    switch (i){
        case 1 :
            System.out.println("Jan");
            break;
        case 2:
            System.out.println("Feb");
            break;
        case 3:
            System.out.println("Mar");
            break;
        default:
            System.out.println("No such month");
            break;

    }
    System.out.println("out of the loop");

}
}
