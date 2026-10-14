import java.util.Scanner;
class FourthClass{
    public static void main(String[]args){

        //for loop
        for(int i=0;i<3;i=i+1){
            System.out.println("Bonjour");
        }

        for(int a=1;a<=10;a++){
            System.out.print(a +"  ");
        }
        
        //while loop
        int num=0;
        while(num<11){
            System.out.println(num);
            num=num+1;
        }

        //do while loop
        int mark=0;
        do{
            System.out.println(mark);
            mark=mark+1;
        }
        while(mark<12);

       //sum of n numbers
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number: ");
       int num2=sc.nextInt();
       int sum=0;
       for(int num1=1;num1<=num2;num1++){
        sum=sum+num1;
       }
       System.out.println("The sum of " + num2 + " numbers is: " + sum);

       System.out.println("The first 10 even numbers are: ");
       for(int numTab=1;numTab<=10;numTab++){
        System.out.println(numTab*2);
       }
    }
}