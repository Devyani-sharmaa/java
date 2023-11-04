public class methods_string {
    public static void main(String[]args){
        String Name="Devyani";
        int value=Name.length();
        System.out.println(value);

        String lString=Name.toLowerCase();
        System.out.println(lString);

        String uStringString=Name.toLowerCase();
        System.out.println(uStringString);

        String nonTrimmedString="            nitesh";
        System.out.println(nonTrimmedString);

        String TrimmedString="            nitesh";
        System.out.println(TrimmedString);

        System.out.println(Name.substring(2));//STRATING WITH INDEX 2 TO END
        
        System.out.println(Name.substring(2,6));

        System.out.println(Name.replace('D','h'));

        System.out.println(Name.replace('h','d'));

        System.out.println(Name.replace("yani", "ansh"));

        System.out.println(Name.startsWith("Dev"));

        System.out.println(Name.endsWith("ansh"));//wrong

        System.out.println(Name.charAt(4));

        System.out.println(Name.lastIndexOf("ansh"));
        
       



    }
    
}
