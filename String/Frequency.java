package String;

public class Frequency {
    public static void main(String[] args) {
        //Count the frequency of a specific character.
        String s = "RAMAHIRE";
        int count=0;
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)=='A'){
                count++;
            }
        }
        System.out.println(count);
    }
}
