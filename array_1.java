public class array_1 {
    public static void main(String[] args) {
       /*  int []marks= new int [4];
        marks[0]=20;
        marks[1]=40;
        marks[3]=29;
        System.out.println(marks[3]);
    }*/
    int [] marks={34,56,53,23,9,56};
    System.out.println(marks.length);
    //displaying using for loop 
    for(int i=0;i<marks.length;i++){
        System.out.println(marks[i]);
    }
    //display arrary in reserve order
    for(int i=marks.length -1;i>=0;i--){
        System.out.println(marks[i]);
    }
    }
}
