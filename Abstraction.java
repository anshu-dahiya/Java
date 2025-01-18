//A Method which do not have body is Abstract Method
//A Class which contain Abstract Method is Abstract Class
//Object of Abstract Class can not be form
//Child class have to implement all abstract method of abstract class by overriding to form object
//Or Child class can also be Abstract(either implement all abstract methods or make it abstract)

abstract class Parent3{
    public void show(){
        System.out.println("Parent Show()");
    }
    abstract public void play();   //Abstract Method
    abstract public void num(int n);
}

class Child3 extends Parent3{
    @Override
    public void play(){
        System.out.println("Implemented Abstract Method Play");
    }
    @Override
    public void num(int n){
        System.out.println(n);
    }
}

abstract class Child4 extends Parent3{
    public void run(){
        System.out.println("Run()");
    }
}

public class Abstraction {
    public static void main(String[] args) {
//      Parent3 p = new Parent3();  //not valid bcoz Abstract Class
        Child3 c3 = new Child3();
//      Child4 c4 = new Child4();   //not valid bcoz Abstract Class
        c3.play();
        c3.num(5);
    }
}
