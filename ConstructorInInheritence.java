class Parent{
    Parent(){
        System.out.println("Constructor of parent class");
    }
    Parent(int x){
        System.out.println("Constructor of Parent class with value x:" + x);
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Constructor of Child class");
    }
    Child(int x, int y){
        super(x);
        System.out.println("Constructor of Child class with value y:" + y);
    }
}
class GrandChild extends Child{
    GrandChild(){
        System.out.println("Constructor of Grand Child class");
    }
    GrandChild(int x, int y, int z){
        super(x,y);
        System.out.println("Constructor of Grand Child with value z:" + z);
    }
}
public class ConstructorInInheritence {
    public static void main(String[] args) {
        Child c1 = new Child(); //Call first parent class cons. then child class cons.

        Child c2 = new Child(4,6); //Call first parent class parameterized cons.
                                        // then child parameterized class cons.

        GrandChild gc1 = new GrandChild(); //Call first parent class cons. then child class cons.
                                            // and at last grandChild class cons.

        GrandChild gc2 = new GrandChild(9,3,7);
        //Call first parent class parameterized cons.
        // then child parameterized class cons.
        // and at last grandChild class parameterized cons.
    }
}
