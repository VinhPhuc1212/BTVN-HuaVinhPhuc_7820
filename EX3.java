
package LEC_07_STRING;

public class EX3 {
    public static String concatenateWithPlus (String first, String second){
     return first + " " + second;    
}    
    public static String concatenateWithconcat (String first, String second){
        return first.concat(" ").concat(second);
    }
    public static void main(String[] args) {
        String first = " Duy Tan";
        String second = "University";
        System.out.println("Using + : " + concatenateWithPlus ( first, second));
        System.out.println("Using concat: " + concatenateWithconcat (first, second) );
        first.concat("University");
        System.out.println("first after concat without reassignment: " + first);
    }
            
}
