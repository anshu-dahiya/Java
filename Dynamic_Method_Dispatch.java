class Phone{
    public void call(){
        System.out.println("Calling From Phone....");
    }
    public void off(){
        System.out.println("Switch off Phone....");
    }
}
class SmartPhone extends Phone{
    @Override
    public void call(){
        System.out.println("Calling Form SmartPhone...");
    }
    public void music(){
        System.out.println("Playing Songs...");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhone(); //Reference of Parent and Object of Child
        //Methods reference of Parent will only run
        obj.call();   //Child Class overrided call() will run
        obj.off();    //Child Class Inherited off() will run
//      obj.music();  //Child Class method will not run
    }
}
