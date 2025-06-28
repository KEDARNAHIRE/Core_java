package String;

public class Print_all_subString {
    public static void main(String[] args) {
        String s = "abcd";
        for(int i=0;i<=3/*index is up to 3*/;i++){
            for(int j=i+1;/*j is excluded*/j<=4;/*j is exclded*/j++){
                System.out.print(s.substring(i,j)+" ");
            }
        }
    }
}
