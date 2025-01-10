//problem 1 (Constructor)
//class Student{
//    private String name;
//    private int age;
//
//    public Student(){
//        this.name = "unknown";
//        this.age = 0;
//    }
//    public String getName(){
//        return this.name;
//    }
//    public int getAge(){
//        return this.age;
//    }
//}
//public class ConstructorPractice {
//    public static void main(String[] args) {
//        Student st = new Student();
//        System.out.println(st.getName());
//        System.out.println(st.getAge());
//    }
//}


//problem 2 (Parameterized Constructor)
//class Student{
//    private String name;
//    private int age;
//
//    public Student(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//    public String getName(){
//        return this.name;
//    }
//    public int getAge(){
//        return this.age;
//    }
//}
//public class ConstructorPractice {
//    public static void main(String[] args) {
//        Student st = new Student("Anshu",23);
//        System.out.println(st.getName());
//        System.out.println(st.getAge());
//    }
//}



//problem 3 (Constructor Overloading)
class Student{
    private String name;
    private int age;
    private double CGPA;

    public Student(){
        this.name = "unknown";
        this.age = 0;
        this.CGPA = 0;
    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
        this.CGPA = 0;
    }
    public Student(String name, int age,double CGPA){
        this.name = name;
        this.age = age;
        this.CGPA = CGPA;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getCGPA(){
        return this.CGPA;
    }
}
public class ConstructorPractice {
    public static void main(String[] args) {
        Student st1 = new Student("Anshu",23,8.33);
        System.out.println(st1.getName());
        System.out.println(st1.getAge());
        System.out.println(st1.getCGPA());

        Student st2 = new Student("Anshu",23);
        System.out.println(st2.getName());
        System.out.println(st2.getAge());
        System.out.println(st2.getCGPA());

        Student st3 = new Student();
        System.out.println(st3.getName());
        System.out.println(st3.getAge());
        System.out.println(st3.getCGPA());
    }
}
