import java.util.*;
import java.util.Scanner;

class BloodDonation {

    public static void main(String[] args) {
        for (String argument : args) {
            System.out.println(argument);
        }

        System.out.println("BLOOD DONATION MANAGEMENT SYSTEM");
        System.out.println("1. Donor");
        System.out.println("2. Admin");
        System.out.println("3. Exit\n");
        try (Scanner sc = new Scanner(System.in)) {
            int choice = sc.nextInt();

            if (choice == 1) {
                Donor d1 = new Donor();
                d1.login();
            }
            if (choice == 2) {
                Admin a1 = new Admin();
                a1.login();
            }
        }
    }
}

class Donor_details {
    protected String D_id;
    public String Dname;
    protected int age;
    protected String gender;
    protected long phone_no;
    protected String marital_status;
    protected String address;
    public String date;
    public String D_email;
    public String Admin_name;
    public String Hospital_assigned;

    {
        D_id = "101";
        Dname = " Sweety";
        age = 23;
        gender = "Female";
        phone_no = 98783913;
        marital_status = "Single";
        address = "bangalore";

        date = "08/08/2020";
        D_email = "sweety.shukla@gamail.org";
        Admin_name = "Dr. Aman";
        Hospital_assigned = "Johns medical hospital";
    }

    void getdondetails() {
        System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Donor ID : " + D_id);
        System.out.println("Donor Name : " + Dname);
        System.out.println("Age : " + age);
        System.out.println("gender : " + gender);
        System.out.println("phone number : " + phone_no);
        System.out.println("status : " + marital_status);
        System.out.println("Address : " + address);
        System.out.println("date of donation : " + date);
        System.out.println("Donor email : " + D_email);
        System.out.println("Admin Name : " + Admin_name);
        System.out.println("Hospital Assigned for blood donation : " + Hospital_assigned);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!\n");
    }

    // Function over loading
    void getdondetails(String D_id, String Dname, int age, String gender, long phone_no, String marital_status,
            String address, String date, String D_email, String Admin_name,
            String Hospital_assigned) {
        this.D_id = D_id;
        this.Dname = Dname;
        this.age = age;
        this.gender = gender;
        this.phone_no = phone_no;
        this.marital_status = marital_status;
        this.address = address;
        this.date = date;
        this.D_email = D_email;
        this.Admin_name = Admin_name;
        this.Hospital_assigned = Hospital_assigned;

        display(this.D_id, this.Dname, this.age, this.gender, this.phone_no, this.marital_status, this.address,
                this.date, this.D_email, this.Admin_name, this.Hospital_assigned);

    }

    // Update details of the donor
    void update_details(String Admin_name, String D_email, String Hospital_assigned) {

        this.D_email = D_email;
        this.Admin_name = Admin_name;
        this.Hospital_assigned = Hospital_assigned;

        System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Donor ID : " + D_id);
        System.out.println("Donor Name : " + Dname);
        System.out.println("Age : " + age);
        System.out.println("gender : " + gender);
        System.out.println("phone number : " + phone_no);
        System.out.println("status : " + marital_status);
        System.out.println("Address : " + address);
        System.out.println("date : " + date);
        System.out.println("email : " + this.D_email);
        System.out.println("Admin Name : " + this.Admin_name);
        System.out.println("Hospital Assigned : " + this.Hospital_assigned);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!\n");

    }

    public void display(String D_id, String Dname, int age, String gender, long phone_no, String marital_status,
            String address, String date, String D_email, String Admin_name,
            String Hospital_assigned) {
        System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Donor ID : " + D_id);
        System.out.println("Donor Name : " + Dname);
        System.out.println("Age : " + age);
        System.out.println("gender : " + gender);
        System.out.println("phone number : " + phone_no);
        System.out.println("status : " + marital_status);
        System.out.println("Address : " + address);
        System.out.println("date of donation : " + date);
        System.out.println("Donor email : " + D_email);
        System.out.println("Admin Name : " + Admin_name);
        System.out.println("Hospital Assigned for blood donation : " + Hospital_assigned);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
    }
}

class Donor extends Donor_details {
    private String donorname;
    private String password;
    Scanner sc = new Scanner(System.in);

    void login() {
        System.out.println("donorname: ");
        donorname = sc.nextLine();
        System.out.println("Password: ");
        password = sc.nextLine();

        if ((donorname.equals("Shikha") && password.equals("shikha@123"))) {
            System.out.println("\nLogged in");
            while (true) {
                System.out.println("\n1. View donor details");
                System.out.println("\n2. Log out");
                int input = sc.nextInt();
                {
                    if (input == 1) {
                        Donor_details don1 = new Donor_details();
                        don1.getdondetails();
                    }

                    if (input == 2) {
                        System.out.println("\nlogged out successfully!\n");
                        System.exit(0);
                    }
                }

            }
        }
    }
}

class Admin extends Donor_details {
    public String AdminName;
    private String Admin_password;
    // private String Admin_email;
    Scanner sc = new Scanner(System.in);

    void login() {
        System.out.println("AdminName: ");
        AdminName = sc.nextLine();
        System.out.println("\nA_password: ");
        Admin_password = sc.nextLine();
        while (true) {
            if ((AdminName.equals("Admin") && Admin_password.equals("Admin1"))) {
                System.out.println("\n Logged In Successfully");
                System.out.println("1.Add Donors\n");
                System.out.println("2.Update donor details(Hospital mail, Admin name  only!!)\n");
                System.out.println("3.Terminate donor\n");
                System.out.println("4.logout\n");
                System.out.println("Enter your choice\n");
                int choice = sc.nextInt();
                if (choice == 1) {
                    System.out.println("\n No.of donor you want to add?\n");
                    int number = sc.nextInt();
                    Donor_details D1[] = new Donor_details[number];
                    for (int i = 0; i < number; i++) {
                        System.out.println("Enter the Donor ID : ");
                        String D_id = sc.next();
                        System.out.println("Enter the Donor Name : ");
                        String Dname = sc.next();
                        System.out.println("Enter the  Age : ");
                        int age = sc.nextInt();
                        System.out.println("Enter the  gender : ");
                        String gender = sc.next();
                        System.out.println("Enter the phone number : ");
                        Long phone_no = sc.nextLong();
                        System.out.println("Enter the status : ");
                        String marital_status = sc.next();
                        System.out.println("Enter the Address : ");
                        String address = sc.next();
                        System.out.println("Enter date of the Blood donation : ");
                        String date = sc.next();
                        System.out.println("Enter the donor email : ");
                        String D_mail = sc.next();
                        System.out.println("Enter the Admin Name : ");
                        String Admin_name = sc.next();
                        System.out.println("Enter the Hospital Name : ");
                        String Hospital_assigned = sc.next();

                        D1[i] = new Donor_details();
                        D1[i].getdondetails(D_id, Dname, age, gender, Hospital_assigned, marital_status, address, date,
                                D_mail, Admin_name, Hospital_assigned);
                    }

                } else if (choice == 2) {
                    System.out.println("\nYou have been logged out successfully!\n");
                    Donor_details don2 = new Donor_details();
                    System.out.println("Enter the hospital/don email : ");
                    String D_mail = sc.next();
                    System.out.println("Enter the Admin Name : ");
                    String Admin_name = sc.next();
                    System.out.println("Enter the Hospital Name : ");
                    String Hospital_assigned = sc.next();
                    don2.update_details(D_mail, Dname, Hospital_assigned);
                } else if (choice == 3) {
                    // delete(); to delete a record(donor)
                } else if (choice == 4) {
                    System.out.println("\nlogged out successfully!\n");
                    System.exit(0);
                }
            }
        }
    }
}
