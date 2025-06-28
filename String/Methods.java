package String;
import java.util.*;
public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "RAM AHIRE";

        //lenghth()
        System.out.println(str.length());

        //charAt()
        System.out.println(str.charAt(4));

        //indexOf()
        System.out.println(str.indexOf('I'));

        //compareTO()
        String s = "Hello";
        String a = "Kello";
        System.out.println(s.compareTo(a));

        //contains()
        String g = "RAM AHIRE";
        System.out.println(g.contains("AM"));

        // startswith() & endswith()
        String k = "Kedar Ahire";
        System.out.println(k.startsWith("Ke"));
        System.out.println(k.endsWith("Re"));

        //toUpperCase() & toUpperCase()
        String w = "KeDAr AhIrE";
        System.out.println(w.toLowerCase());
        System.out.println(w.toUpperCase());

        //concat()
        String l1 = "RA";
        String l2 = "M";
        System.out.println(l1.concat(l2));

    }
}
