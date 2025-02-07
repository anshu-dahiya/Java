//interfaces can extends(inherit) each other
//Class also have to implement inherited methods of interface
interface MyParent{
    void meth1();
    void meth2();
}
interface MyChild extends MyParent{
    void meth3();
    void meth4();
}
class MyGrandChild implements MyChild{
    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
    public void meth3(){
        System.out.println("Meth3");
    }
    public void meth4(){
        System.out.println("Meth4");
    }
}
public class Interface_Inheritance {
    public static void main(String[] args) {
        MyGrandChild mg = new MyGrandChild();
        mg.meth1();
        mg.meth2();
        mg.meth3();
        mg.meth4();
    }
}
