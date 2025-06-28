package String;

public class vowel_consonant {
    public static void main(String[] args) {
        String s = "ramahire";
        int v=0,c=0;
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                v++;
            }else{
                c++;
            }
        }
        System.out.println(v+" "+c);
    }
}
