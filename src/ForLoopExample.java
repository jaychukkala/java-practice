public class ForLoopExample {
    public static void main(String[] args) {
//        for(initialise value; condition; incrementer or decrement){
//        body of loop
//        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(" i ========" + i);
        }

//        while loop
//        initialise
//        while(condition){
//        loop body
//        increment or decrement
//        }

        int i = 0;
        while (i <= 10) {
            System.out.println("i = " + i);
            i++;
        }
        System.out.println(i);

//        do while
//        initialise
//        do{
//        loop body
//        increment or decrement
//        } while(condition)

        int i1 = 12;
        do {
            System.out.println("i1 = " + i1);
            i1++;
        } while (i1 <= 10);
    }
}
