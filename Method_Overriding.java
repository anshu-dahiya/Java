class Parent2{
    public void show(){
        System.out.println("Parent's Show()");
    }
}
class Child2 extends Parent2{
    @Override
    public void show(){
        super.show();   //It runs parent class show() first
        System.out.println("Child's Show()");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        Child2 c2 = new Child2();
        c2.show();
    }
}
