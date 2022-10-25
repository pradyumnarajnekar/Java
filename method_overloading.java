import java.util.Scanner;
class methodoverload{
    public static void add(int a,int b){
        int sum=a+b;
        System.out.println("The sum of x and y is:"+sum);
    }
    public static void add(int a, int b, int c)
    {
        int sum=a+b+c;
        System.out.println("The sum of x, y and z is:"+sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x=sc.nextInt();
        System.out.println("Enter the value of y:");
        int y=sc.nextInt();
        System.out.println("Enter the value of z:");
        int z=sc.nextInt();
        add(x, y);
        add(x, y, z);
    }
}
