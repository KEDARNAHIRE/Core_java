package String.StringBuilder;

public class Functions {
    public static void main(String[] args) {
        //we can use StringBuilder in 3 ways
        //1
                //StringBuilder str= new StringBuilder();
                //Default capasity is 16 

                //StringBuilder str1 = new StringBuilder("Hello");
                //we can directly write our string 

                //StringBuilder str2 = new StringBuilder(100);
                //we can set the capasity of the string to stored in the Stringbuilder
                
                //setCatAt(index,char);
                StringBuilder str = new StringBuilder("Hello");
                str.setCharAt(0, 'm');
                System.out.println(str);

                //append 
                str.append("World");
                str.append(10);
                System.out.println(str);

                //insert(ind,ch)

                StringBuilder s = new StringBuilder("Hello");
                s.insert(2, 'b');
                System.out.println(s);

                //deleteChatAt(inx);
                StringBuilder d = new StringBuilder("Hello");
                d.deleteCharAt(1);
                System.out.println(d);
                
                //delete(i,j)
                d.delete(0,2);
                
                //reverse
                d.reverse();
                System.out.println(d);
    }
}
