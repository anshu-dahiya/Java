//problem 1
//Create a class Employee with following attributes and methods
//Attributes - salary(int), name(String)
//Methods- getSalary(return salary), getName(return name),setName(change name)
//class Employee{
//    int salary;
//    String name;
//
//    public int getSalary(){
//        return salary;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String n){
//        name = n;
//    }
//}
//public class OopsPractice {
//    public static void main(String[] args){
//        Employee obj = new Employee();
//        obj.setName("Anshu");
//        obj.salary = 56000;
//        System.out.println(obj.getName());
//        System.out.println(obj.getSalary());
//    }
//}

//problem 2
//Create Class CellPhone With methods to print "ringing","vibrating","Calling"
//class CellPhone{
//    public void ring(){
//        System.out.println("Ringing...");
//    }
//    public void vibrate(){
//        System.out.println("Vibrating...");
//    }
//    public void call(){
//        System.out.println("Calling Anshu...");
//    }
//}
//public class OopsPractice {
//    public static void main(String[] args) {
//        CellPhone m34 = new CellPhone();
//        m34.call();
//        m34.vibrate();
//        m34.ring();
//    }
//}


//Problem 3
//Create class Square and method to initialize its side,calculating area,perimeter
//class Square{
//    int side;

//    public int area(){
//        return side*side;
//    }
//    public int perimeter(){
//        return 4*side;
//    }
//}
//public class OopsPractice {
//    public static void main(String[] args) {
//        Square sq = new Square();
//        sq.side = 3;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());
//    }
//}


//Problem 4
//Create class Rectangle and method to initialize its length-breadth,calculating area,perimeter
//class Rectangle{
//    int length;
//    int breadth;
//
//    public int area(){
//        return length*breadth;
//    }
//    public int perimeter(){
//        return (length+breadth)*2;
//    }
//}
//public class OopsPractice {
//    public static void main(String[] args) {
//        Rectangle rect = new Rectangle();
//        rect.length = 7;
//        rect.breadth = 3;
//        System.out.println(rect.area());
//        System.out.println(rect.perimeter());
//    }
//}


//Problem 4
//Create class Circle and method to initialize its radius,calculating area,perimeter
class Circle {
    int radius;
    double pi = 3.14;

    public int diameter(){
        return radius*2;
    }
    public double area(){
        return pi*(radius*radius);
    }
    public double perimeter(){
        return (2*pi)*radius;
    }
}
public class OopsPractice {
    public static void main(String[] args) {
        Circle cr = new Circle();
        cr.radius = 7;
        System.out.println(cr.diameter());
        System.out.println(cr.area());
        System.out.println(cr.perimeter());
    }
}