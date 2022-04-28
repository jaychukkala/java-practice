import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExamole {
    static void arrayFunction(){
        List<String> li = new ArrayList<String>();
        li.add("Priyanka");
        li.add("Harshada");
        li.add("Ashwini");
        li.add("Ashwini");
        li.add(2,"Priya");

        for(String s:li){
            System.out.println("s =="+s);
        }
        for(int i=0;i<li.size();i++){
            System.out.println("li.get(i) = " + li.get(i));
        }
    }

    static void LinkedListFunction(){
        List<String> li = new LinkedList<String>();
        li.add("Priyanka");
        li.add("Harshada");
        li.add("Ashwini");
        li.add("Ashwini");
        li.add(2,"Priya");

        System.out.println("===================Linked List ====================");
        for(String s:li){
            System.out.println("s =="+s);
        }
    }

    static void PersonList(){
        List<Person1> personList  = new ArrayList<Person1>();
        Person1 p1 = new Person1();
        p1.setAge(35);
        p1.setName("Harshada");
        p1.setWeight(55.0f);

        Person1 p2 = new Person1();
        p2.setAge(26);
        p2.setName("chhavi");
        p2.setWeight(50.0f);

        personList.add(p1);
        personList.add(p2);

        for(Person1 p : personList){
            System.out.println(p.getName());
            if(p.getName().equals("chhavi")){
                p.setAge(24);
            }
            System.out.println(p.getAge());
            System.out.println(p.getWeight());

        }




    }
    public static void main(String[] args) {
//        arrayFunction();
//        LinkedListFunction();
        PersonList();
    }
}
