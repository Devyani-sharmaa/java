public class methods {
    static int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*2;
        }
        return z;
    }
    public static void main(String[]args){
        int a=1;
        int b=2;
        int c;
        methods obj=new methods();
        c=obj.logic(a,b);
         System.out.println(c);
       
    }
}