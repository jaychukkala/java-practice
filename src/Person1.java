public class Person1 { private float weight;
    private float height;
    private int age;
    private String name;

    Person1(){
        this.height = 5.5f;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }
    public float getWeight(){
        return weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.setAge(35);
        p1.setName("Harshada");

        p1.setWeight(55.0f);

        Person1 p2 = new Person1();
        p2.setAge(26);
        p2.setName("chhavi");

        p2.setWeight(50.0f);

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getWeight());
        System.out.println(p1.getHeight());

        System.out.println(p2.getName());
        System.out.println(p2.getAge());
        System.out.println(p2.getWeight());
        System.out.println(p2.getHeight());


    }
}
