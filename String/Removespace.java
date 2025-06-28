package String;

public class Removespace {
    public static void main(String[] args) {
        //Remove all spaces from a String.
        String s = "RAM AHIRE";
        String a = s.replaceAll(" ", "");
        System.out.println(a);
        //Replace all spaces with underscores or @.
        String d = "KEDAR AHIRE";
        String h = d.replaceAll(" ", "_");
        System.out.println(h);
    }
}
