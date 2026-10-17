class FifthClass{
    public static void main(String[]args){
        for (int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        for(int j=1;j<=4;j++){
            for(int k=1;k<=5;k++){
                if(j==1 || j==4 || k==1 || k==5){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        for(int r=1;r<=4;r++){
            for (int c=1;c<=r;c++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int r=4;r>=1;r--){
            for (int c=1;c<=r;c++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int t=1;t<=10;t++){
            
            System.out.println("2*"+t+"="+(2*t));
        }

        
        int x=5;
        for(int z=1;z<=x;z++){
            for(int y=1;y<=z;y++){
                System.out.print( y + " ");
            }
            System.out.println();
        }

        int e=5;
        for(int f=5;f>=1;f--){
            for(int g=1;g<=f;g++){
                System.out.print(g+" ");
            }
            System.out.println();
        }


        int number=1;
        for (int v=1;v<=5;v++){
            for(int w=1;w<=v;w++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }


        for(int h=1;h<=5;h++){
            for(int i=1;i<=h;i++){
                int sum=i+h;
                if(sum%2==0){
                    System.out.print("1"+" ");
                }
                else{
                    System.out.print("0"+ " ");}
            }
            System.out.println();
        }
    }
}