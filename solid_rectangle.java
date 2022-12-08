import java.util.Scanner;

class solid_rectangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows:");
        int row=sc.nextInt();
        System.out.print("Enter no. of columns:");
        int col=sc.nextInt();
        sc.close();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}