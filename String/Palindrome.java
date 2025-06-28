package String;

public class Palindrome {
    public static void main(String[] args) {
        //Check whether a String is a palindrome.
        String s = "MARKRM";
        String a = "";
        String temp = s;
        for(int i=s.length()-1;i>=0;i--){
            a = a+s.charAt(i);
        }
        if(a.equals(temp)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
