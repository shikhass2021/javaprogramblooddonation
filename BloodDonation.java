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
        // System.out.println("3. Employee");
        System.out.println("4. Exit\n");
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
            // if (choice == 3){
            // Employee e1 = new Employee();
            // e1.login();
            // }
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
        D_email = "";
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
        String mail = new String();
        mail = D_email.concat("@gmail.com");
        // this.D_email = D_email;
        this.Admin_name = Admin_name;
        this.Hospital_assigned = Hospital_assigned;

        display(this.D_id, this.Dname, this.age, this.gender, this.phone_no, this.marital_status, this.address,
                this.date, mail, this.Admin_name, this.Hospital_assigned);

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
                        String D_email = sc.next();
                        System.out.println("Enter the Admin Name : ");
                        String Admin_name = sc.next();
                        System.out.println("Enter the Hospital Name : ");
                        String Hospital_assigned = sc.next();

                        D1[i] = new Donor_details();
                        D1[i].getdondetails(D_id, Dname, age, gender, phone_no, marital_status,
                                address, date, D_email, Admin_name,
                                Hospital_assigned);
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
// class Employee extends BloodDonation{

// }

// class Hospital {
// protected int hosp_id;
// public String hosp_name;
// protected float revenue;
// protected float expenses;

// void profit() {
// System.out.println("\n Net profit is : nothing right now!!");
// }

// // Anonymous Object
// {
// new Hospital().profit();
// }
// }

// class Bloodcamp extends Hospital {
// static int Bloodcamp_id = 10001;
// String Bloodcamp_name;
// // String hosp_name;
// String start_date;
// String end_date;
// String Deadline;
// String Bloodcamp_head;
// String Client_name;

// Bloodcamp() {
// Bloodcamp_id++;
// System.out.println("Bloodcamp id is " + Bloodcamp_id);
// }

// void show_active_Bloodcamp() {
// System.out.println("\nlist of active Bloodcamp");
// }

// }

// class Attendance extends Employee {
// static int total_leave;
// int no_leave_taken;
// // float attendance_count;
// static int total_working_days;

// // static method
// static void year(int year) {
// if (year == 365) {
// total_leave = 20;
// total_working_days = 250;
// } else if (year == 366) {
// total_leave = 22;
// total_working_days = 257;
// }
// }

// static void calculate_attandance(int no_of_days) {
// // this.no_of_days = no_of_days;
// System.out.println("Presend days " + no_of_days);
// System.out.println(total_working_days);
// float attendance_count = ((no_of_days / total_working_days) * 100);
// System.out.println("Attendance percentage: " + attendance_count);
// }

// static void calculate_attandance(int no_of_days, int no_leave_taken) {
// System.out.println("Presend days " + no_of_days);
// System.out.println("total working days " + total_working_days);
// System.out.println("leave taken " + no_leave_taken);
// float attendance_count = (((no_of_days - no_leave_taken) /
// total_working_days) * 100);
// System.out.println("Attendance percentage: " + attendance_count);
// }
// }

// class client extends Project {
// String org_name;
// String client_name;
// int c_phoneno;
// String email;
// float project_revenue;

// Scanner sc = new Scanner(System.in);

// void getdetails() {
// System.out.println("Enter the client's orginization : ");
// org_name = sc.next();
// System.out.println("Enter the Contanct number : ");
// c_phoneno = sc.nextInt();
// System.out.println("Enter the client name: ");
// client_name = sc.next();
// System.out.println("Enter the Email : ");
// email = sc.next();
// System.out.println("Project cost: ");
// project_revenue = sc.nextFloat();

// }

// void display() {
// System.out.println("Enter the client's orginization : " + org_name);
// System.out.println("Enter the Contanct number : " + c_phoneno);
// System.out.println("Enter the client name: " + client_name);
// System.out.println("Enter the Email : " + email);
// System.out.println("Project cost: " + project_revenue);
// }

// void min_max() {
// // min and max value project
// System.out.println("\n MIN and MAX is!!");
// }

// }

// class Payroll extends Employee_details {
// float basic_pay;
// float HRA;
// float DA;
// float pf;
// int ot;
// float gross_salary;
// float net_salary;

// // constructor overloading and chaining
// Payroll(String designation) {
// if (designation == "Nurse") {
// basic_pay = 15000;
// HRA = (float) (basic_pay * 0.4);
// ;
// DA = 1000;
// pf = 2100;
// } else if (designation == "Manager") {
// basic_pay = 21000;
// HRA = (float) (basic_pay * 0.5);
// DA = 1700;
// pf = 3500;
// } else {
// basic_pay = 12000;
// HRA = (float) (basic_pay * 0.3);
// ;
// DA = 1100;
// pf = 1450;
// }

// }

// Payroll(String week_day, int no_of_days, String designation) {
// this(designation);
// int total_ot;
// if (week_day == "Monday" || week_day == "monday" || week_day == "Tuesday" ||
// week_day == "tuesday"
// || week_day == "Wednesday" || week_day == "wednesday" || week_day ==
// "Thursday"
// || week_day == "thursday") {

// ot = 250;
// } else if (week_day == "Friday" || week_day == "friday" || week_day ==
// "Satuday" || week_day == "Saturday") {
// ot = 500;
// }
// total_ot = ot * no_of_days;
// calculate_salary(basic_pay, HRA, DA, pf, total_ot);

// }

// void calculate_salary(float basic_pay, float HRA, float DA, float pf, int ot)
// {
// float c_salary = 0;
// c_salary = ((basic_pay + HRA + DA + ot) - pf);
// System.out.println("Basic Pay : " + basic_pay);
// System.out.println("House rent allowance : " + HRA);
// System.out.println("Dearness Allowance : " + DA);
// System.out.println("Provident fund : " + pf);
// System.out.println("Pay for the month is: " + c_salary);

// }

// public Payroll() {
// System.out.println("Default constructor for payroll class");
// }

// void calculate_CTC() {
// float ctc = 0;
// ctc = ((basic_pay + HRA + DA) - pf) * 12;
// System.out.println("Basic Pay : " + basic_pay);
// System.out.println("House rent allowance : " + HRA);
// System.out.println("Dearness Allowance : " + DA);
// System.out.println("Provident fund : " + pf);
// System.out.println("The CTC is: " + ctc);

// Donor_details emp3 = new Donor_details() {
// void getdondetails() {
// System.out.println("Donor Name : " + Dname);
// System.out.println("Age : " + age);
// System.out.println("gender : " + gender);
// System.out.println("phone number : " + phone_no);
// System.out.println("status : " + marital_status);
// System.out.println("Address : " + address);
// }
// };
// don3.getdondetails();
// }

// }

// // Nested static Class
// class Hospital {
// static String org_name = "CMH";
// static String stateName = "karanataka";
// static String cityName = "Bangalore";

// static class Hospital1 {
// void info() {
// System.out.println(org_name + " is in " + stateName + cityName);
// }

// }

// }