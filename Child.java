
class Parent{
    Parent(int a){
        System.out.println("Parent class Constructor");
    }
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void add(int a, int b) throws NullPointerException{
        System.out.println("Parent class sum = "+(a+b));
    }

    void show(){
        System.out.println("from parent show");
    }

}

public class Child extends Parent{

    Child(){
        this(5);
//        super(4);

        System.out.println("from default child");
    }
    Child(int a){
        super(5);
        System.out.println("from parameter child");

    }
    String education;

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    void add(int a, int b) throws NullPointerException{
        System.out.println("child class sum = "+(a+b));
    }

    void show(){
        System.out.println("from child show");
    }
    public static void main(String[] args) {
        Child obj = new Child();
        obj.setName("Mahesh");
        obj.setAge(67);
        obj.setEducation("MBA");
        obj.add(6,7);

        Parent p = new Child();
        p.show();

    }
}