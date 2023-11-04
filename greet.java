import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class greet {
    public static void main(String[]args){
    System.out.println("what is ur name");
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
    System.out.println("hello" + name + "have a good day!!!");
    
}
}
