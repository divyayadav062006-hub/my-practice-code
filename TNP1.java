// class Student {
// static String college_name = "JNCT";

// String name;//instance variable

// void display() {
//     int rollNo = 20;//local variable

//     System.out.println("Name: " + name);
//     System.out.println("Roll No: " + rollNo);
//     System.out.println("College Name: " + college_name);
//     System.out.println();
// }
// }
// class TNP1 {
// public static void main(String[] args) {
// Student s1 = new Student();
// s1.name = "John";
// s1.display();

//     Student s2 = new Student();
//     s2.name = "Smith";
//     s2.display();

//     int marks = 40;//local variable
//     float marks1=marks;
//     System.out.println("Marks: " + marks1);
// }
// }
/*local variable=A local variable can declare iside a method, constructor, or block. 
It is created when the method, constructor, or block is called and destroyed when it exits the method, constructor, or block.
Local variables are visible only within the method, constructor, or block in which they are declared.*/


//Instance variable=Instance variables are declared in a class, but outside a method, constructor or any block.

//Static variable=Static variables are also known as class variables. 
// They are declared with the static keyword in a class, but outside a method, constructor or a block.-

class TNP1{
    public static void main(String[]args){
        char a='A';
        int b=a;
        System.out.println(b);

        int d=16777217;
        float e=d;
        System.out.println(e);
        double b1=d;
        System.out.println(b1);

        float marks=90.5f;
        int marks1=(int)marks;
        System.out.println(marks1);

        int num=260;
        byte num1=(byte)num;
        System.out.println(num1);

        long num2=1000000L;
        float num3=(float)num2;
        System.out.println(num3);

        int g=100;
        int h=200;
        System.out.println(g+h);
        System.out.println(g-h);
        System.out.println(g/h);
        System.out.println(g*h);
        System.out.println(h%g);

        int age=62;
        if(age>=18 && age<=60){
            System.out.println("Eligible for working");
        }
        else{
            System.out.println("Not eligible for working");
        }

        int number=35;
        if(number%5==0 || number%7==0){
            System.out.println("Divisible by 5 or 7");
        }
        else{
            System.out.println("Not divisible by 5 or 7");
        }
    }
}