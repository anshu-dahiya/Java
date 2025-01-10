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


//Problem 1 (Create Class Cylinder and set its height and radius)
class Cylinder{
    private int radius;
    private int height;

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
}
public class GetterSetter{
    public static void main(String[] args) {
       Cylinder cy = new Cylinder();
       cy.setRadius(9);
       cy.setHeight(12);
       System.out.println(cy.getRadius());
       System.out.println(cy.getHeight());
    }

}

