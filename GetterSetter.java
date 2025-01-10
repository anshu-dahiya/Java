//class MyEmployee{
//    private int id;
//    private String name;
//
//    public void setId(int i){
//        id = i;
//    }
//    public void setName(String n){
//        name = n;
//    }
//    public int getId(){
//        return id;
//    }
//    public String getName(){
//        return name;
//    }
//}
//public class GetterSetter {
//    public static void main(String[] args) {
//        MyEmployee emp = new MyEmployee();
//        emp.setId(24);
//        emp.setName("Anshu");
//        System.out.println(emp.getId());
//        System.out.println(emp.getName());
//    }
//}


//Problem 1(Create Class Cylinder and set its height and radius)
//problem 2(Create Methods to calculate surface area and volume area of cylinder)
class Cylinder{
    private int radius;
    private int height;
    double pi = 3.14159265359;

    public void setRadius(int r){
        radius = r;
    }

    public int getRadius(){
        return radius;
    }

    public void setHeight(int h){
        height = h;
    }

    public int getHeight(){
        return height;
    }

    public double surfaceArea(){
        return 2*pi*radius*height + 2*pi*(radius*radius);
    }

    public double volumeArea(){
        return pi*(radius*radius)*height;
    }
}
public class GetterSetter{
    public static void main(String[] args) {
       Cylinder cy = new Cylinder();
       cy.setRadius(9);
       cy.setHeight(12);
       System.out.println(cy.getRadius());
       System.out.println(cy.getHeight());
       System.out.println(cy.surfaceArea());
       System.out.println(cy.volumeArea());
    }
}

