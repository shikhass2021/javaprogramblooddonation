
// lab7
import java.util.*;

//abstract Class
abstract class Hospital {
    protected int dept_id;
    public String dept_name;
    protected float revenue;
    protected float expenses;

    {
        dept_id = 10001;
        dept_name = "bloodbank";
        revenue = 74499;
        expenses = 72882;
    }

    Hospital() {
        dept_id++;
        System.out.println("Hospital ID is " + dept_id);
    }

    Scanner sc = new Scanner(System.in);

    void get_data() {
        System.out.println("Enter the Hospital name: ");
        dept_name = sc.next();
        System.out.println("Enter the revenue generated: ");
        revenue = sc.nextFloat();
        System.out.println("Enter the total expenses: ");
        expenses = sc.nextFloat();
        profit(revenue, expenses);
    }

    void depart_display() {
        System.out.println("Hospital id : " + dept_id);
        System.out.println("Hospital name: " + dept_name);
        System.out.println("Hospital revenue: " + revenue);
        System.out.println("Hospital expences : " + expenses);
    }

    abstract void profit(float rev, float expen);
    // // Anonymous Object
    // {
    // new Hospital().profit();
    // }
}

// inheritance
class bloodcamp extends Hospital {
    static int bloodcamp_id = 10001;
    String bloodcamp_name;
    // String dept_name;
    String start_date;
    String end_date;
    String Deadline;
    String bloodcamp_head;
    String Client_name;

    bloodcamp() {
        // super key word to access parent class method
        super();
        super.get_data();
        bloodcamp_id++;
        System.out.println("bloodcamp id is " + bloodcamp_id);
        System.out.println("From Hospital \n");
        // super.depart_display();
    }

    // bloodcamp(int bloodcamp_id)
    // {
    // this.bloodcamp_id = bloodcamp_id;
    // }
    void show_active_bloodcamps() {
        System.out.println("\nlist of active bloodcamps");
    }

    public void profit(float rev, float expen) {
        float net_profit = (rev - expen);
        System.out.println(" Profit of the Hospital : " + net_profit);
    }

}

class Hospital1 {
    public static void main(String args[]) {
        bloodcamp obj1 = new bloodcamp();
        obj1.depart_display();
    }
}