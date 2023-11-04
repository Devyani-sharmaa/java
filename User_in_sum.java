import java.util.Scanner;

public class User_in_sum {
    public static void main(String[]args){
        System.out.println("taking input from users");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first no.");
        int a=sc.nextInt();
        System.out.println("enter the second no.");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.print("the sum of two no is:");
        System.out.print(sum);

    }
    
}

