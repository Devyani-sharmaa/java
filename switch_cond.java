import java.util.Scanner;

public class switch_cond {

    public static void main(String[] args) {
        int age;
        System.out.println("enter your age");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        switch  (age){
            case 18:
            System.out.println("U r an adult");
            break;
        
        case 11:
            System.out.println("u r teenager");
            break;

        case 1:
            System.out.println("u r child");
            break;
        
        case 30:
            System.out.println("u r man");
            break;
        
       case 50:
            System.out.println("u r old");
            break;
        case 90:
            System.out.println("u may die");
            break;
        
        default:
        System.out.println("happy life!!!!");
        }
    
    }
}
    