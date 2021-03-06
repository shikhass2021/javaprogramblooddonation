// lab6
// Nested static Class
class Hospital {
    static final String org_name = "CMH ";
    static String stateName = "Karanataka ";
    static String cityName = "Bangalore";

    static class HospitalInner {
        void info() {
            System.out.printf(
                    "=========================================================================================================\n");
            System.out.printf("Hospital Name : " + org_name + "\nLocation: " + stateName + cityName + "\n");
            System.out.printf(
                    "==========================================================================================================\n");
            System.out.println("About Us");

            // StringBuilder class
            StringBuilder Str = new StringBuilder();
            Str.append(
                    "health care institution providing patient \ntreatment with specialized health science and auxiliary healthcare staff and medical equipment..");
            System.out.println(Str);
            System.out.printf(
                    "==========================================================================================================\n");
        }

        // StringBuffer class
        void end() {
            StringBuffer strang = new StringBuffer("__________________________________________________.");
            strang.capacity();
            strang = strang.append(" All rights reserved. Developed by Shikha.");
            System.out.println(strang);
            System.out.println(strang.capacity());
        }

    }
}

class Employee1 extends Hospital {
    public static void main(String args[]) {
        Hospital.HospitalInner obj = new Hospital.HospitalInner();
        obj.info();
        obj.end();
    }
}