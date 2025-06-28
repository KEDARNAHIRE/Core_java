package String.StringBuilder;

public class Practise {
    
    public static boolean ispalindrome(String str){
        int i=0;
        int j=str.length()-1;
        boolean flag=true;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
                i++;
                j--;
            }
        return true;
        }
    }
    public static void main(String[] args) {
        //PAlindrome
        String str="MADAM";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(ispalindrome(str.substring(i,j))==true){
                System.out.println("Palindome");
                }else{
                    System.out.println("Not Palindrome");
                }
            }
        }
    }
}
