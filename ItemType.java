import java.util.Scanner;

public class ItemType {
   private String Name;
   private double Costperday;
   private double Deposit;

    public String getName() {return Name;}

    public void setName(String Name) {this.Name = Name;}

    public double getCostperday() {return Costperday;}

    public void setCostperday(double Costperday) {this.Costperday = Costperday;}

    public double getDeposit() {return Deposit;}

    public void setDeposit(double Deposit) {this.Deposit = Deposit;}
    public void display(){
        System.out.println("Item Type details");
        System.out.println("Name :" + getName());
        System.out.println("Deposit :" + String.format("%2f", getDeposit()));
        System.out.println("Costperday :" + String.format("%2f", getCostperday()));
    }

    public static void main(String[] args){
        ItemType i = new ItemType();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item type name");
        i.setName(sc.nextLine());
        System.out.println("Enter the cost per day");
        i.setCostperday(sc.nextDouble());
        System.out.println("Enter the deposit");
        i.setDeposit(sc.nextDouble());
        i.display();

    }
}
