package String;

public class equals{
    public static void main(String[] args) {
        String s = "Hello";
        String a = "Hello";
        String d = new String("Hello");
        //Both the ans are diff where if String is same because == comapre memory aadd location
        System.out.println(s==a);
        System.out.println(s==d);
        //equals() comapre actual content and give the ans
        System.out.println(s.equals(a));
        System.out.println(s.equals(d));
    }
}
