package OPPS;
class Class_Object{
    public static void main(String[] args) {
        Student s = new Student();
        s.rno=12;
        s.Name="KEDAR";
        s.marks=99.00F;
        System.out.println(s.Name);
        System.out.println(s.rno);
        System.out.println(s.marks);
    }
    public static class Student{
        int rno;
        String Name;
        float marks;
    }
}