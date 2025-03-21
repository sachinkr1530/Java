
import java.lang.reflect.Array;


public class string_1_len {
    public static void main(String[] args) {
        String name="Sachin";
        String name1="Ku:m:a:r";
        System.out.println("length of name= "+name.length());
        System.out.println("same as input of name= "+name.equals("Sachin"));
        System.out.println("Upper case of name= "+name.toUpperCase());
        System.out.println("concat of name= "+name.concat("Thakur"));
        System.out.println("concat of name= "+name+"Thakur");  // without using concat 
        System.out.println("substring of name= "+name.substring(0,3));
        System.out.println("split of name= "+name.split(":"));
        
    }    
}
