import java.util.Scanner;

class FirstClass{
    public static void main(String[]args){
        System.out.println("Hello and welcome to Java programming");
        System.out.println("*\n**\n***\n****\n*****");

        String name="Virat Kohli";
        int age=34;
        double height=170.55;
        name = "Rohit Sharma";
        System.out.println(name);

        int a= 10;
        int b=5;
        int ans=(a*b)/(a-b);
        System.out.println(ans);

        Scanner sc=new Scanner(System.in);
        String place=sc.next();
        System.out.println(place);

        int g=sc.nextInt();
        int h=sc.nextInt();
        int sum=g+h;
        System.out.println(sum);

    }
}