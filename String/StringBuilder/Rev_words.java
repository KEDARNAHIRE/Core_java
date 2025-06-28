package String.StringBuilder;

public class Rev_words {
    public static void main(String[] args) {
        String str = "I AM RAM AHIRE";
        String ans = "";
        StringBuilder s = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch != ' '){
                s.append(ch);
            }else{
                s.reverse();
                ans += s;
                ans += " ";
                s = new StringBuilder("");
            }
        }
        s.reverse();
        ans += s;
        System.out.println(ans);
    }
}
