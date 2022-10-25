import java.util.Scanner;
class studentdetails {
    int enrollment;
    String name;
    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of student : ");
        name = sc.nextLine();//next line is written for the     `
        System.out.println("Enter the enrollment number of student : ");
        enrollment = sc.nextInt();
    }
    public void year() {
        if (210000 <= enrollment && enrollment <= 211000) {
            System.out.println(name + " is in year 1");
        } else if (211000 <= enrollment && enrollment < 212000) {
            System.out.println(name + " is in year 2");
        } else if (212000 <= enrollment && enrollment < 213000) {
            System.out.println(name + " is in year 3");
        } else if (213000 <= enrollment && enrollment < 214000) {
            System.out.println(name + " is in year 4");
        }
    }
}
public class student {
    public static void main(String[] args) {
        studentdetails S1 = new studentdetails();
        studentdetails S2 = new studentdetails();
        studentdetails S3 = new studentdetails();
        S1.getdata();
        S2.getdata();
        S3.getdata();
        S1.year();
        S2.year();
        S3.year();

    }
}
