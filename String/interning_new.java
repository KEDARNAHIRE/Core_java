package String;

public class interning_new {
    public static void main(String[] args) {
        String s = "Hello";
        String a = "Hello";
        //This is interning problem cause both the variables are pointing to the same location the heap section 
        //but if we use new we can solve the problem
        String k= new String("Hello");
        //Now both the variables are pointing to the diff locations in the heap along with the same string in it
    }
}
