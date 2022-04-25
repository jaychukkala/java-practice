public class Person {
    float weight;
    float height;
    int age;
    String name;

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.weight=55.0f;
        p1.height =5.5f;
        p1.age =35;
        p1.name = "Harshada";

        Person p2 = new Person();
        p2.weight=50.0f;
        p2.height= 5.6f;
        p2.age = 26;
        p2.name="chhavi";

        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.height);
        System.out.println(p1.weight);

        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.height);
        System.out.println(p2.weight);



    }
}
