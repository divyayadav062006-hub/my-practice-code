import java.util.Scanner;

class ThirdClass{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        //if else statement
        if(age>=18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }

        if(age%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }



        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println("Equal");
        }else{
            if(num1>num2){
                System.out.println("num1 is greater");
            }
            else{
                System.out.println("num2 is greater");
                }
            }
        

        if(2%2==0)
            System.out.println("Bazinga!");

       //switch statement  
       char button=sc.next().charAt(0);
       switch(button){
        case 'a':System.out.println("Hello");
        break;
        case 'b':System.out.println("Namaste"); 
        break;
        case 'c':System.out.println("Bonjour");
        break;
        default:System.out.println("Invalid button");
        break;
       }

        
    }
    }
