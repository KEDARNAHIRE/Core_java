package String;

public class rev {
    public static void main(String[] args) {
        //rev String Manually
        String s = "Ram";
        String a = "";
        for(int i=s.length()-1;i>=0;i--){
            a=a+s.charAt(i);
        }
        System.out.println(a);
    }
}
