package String;
import java.util.Arrays;

 class Anagrams{

    public static boolean check(String str1,String str2){
        //Remove white spaces and convert to lowercase
        
        str1=str1.replaceAll("\\s", "").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();

        //checking length
        if(str1.length() != str2.length()){
            return false;
        }
        //coverting String to array of char
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //Compare
        return Arrays.equals(arr1,arr2);


    }
    public static void main(String[] args) {
        String str1 = "liste";
        String str2 = "silent";

        if(check(str1, str2)){
            System.out.println("Anarams");
        }else{
            System.out.println("Not Anagrams");
        }
    }
 }