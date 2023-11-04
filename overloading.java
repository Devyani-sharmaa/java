public class overloading {
    /*static void telljoke(){
        System.out.println("i am ddebu");

    }
     public static void main(String[] args) {
        telljoke();
    }*/
    static void change(int a){
            a=98;
    }
    public static void main(String[] args) {
        int [] marks={23,45,76,64,43};
        int x=78;
        change(x);
        System.out.println(x);
    }
    
}
