package String;

public class immutability {
    public static void main(String[] args) {
        String s = "Hello";
    //    The below thung is not appliaction as the strings are immutables
    //     .charAt(2)='d';
    //     if we want to change Hello to Heylo
       
       
 s = s.substring(0,3)+'Y'+s.substring(3);
 System.out.println(s);
 
        
        
    }
}
