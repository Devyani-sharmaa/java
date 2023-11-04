
import javax.swing.*;

class Framess{
    public static class abc
{    JFrame jf;
    JLabel l;
    abc(){
        jf=new JFrame("testing");
        l=new JLabel("devyani");
        
        jf.setVisible(true);
        jf.setSize(400,400);
        l.setSize(400,400);
        jf.add(l);
    }
    
}
    public static void main(String[]args){
        
        new abc();
        
        
        
    }
    

//public static class abc
//{
//    JLabel l;
//    abc(){
//        
//        l=new JLabel("devyani");
//        
//        l.setVisible(true);
//        l.setSize(400,400);
//    }
//}

}
