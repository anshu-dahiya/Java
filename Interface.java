//All Methods in Interface are Abstract Method
//Class Implement the Interface have to Implement all those Abstract Method
//Multiple Interfaces can be implemented together
//While Implementing interface methods in class they should be public access modifier
interface Bicycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface Accessories{
    void horn(boolean h);
}
class AvonCycle implements Bicycle, Accessories{
    int speed = 7;
    public void applyBrake(int decrement){
        speed = speed - decrement;
        System.out.println(speed);
    }
    public void  speedUp(int increment){
        speed = speed + increment;
        System.out.println(speed);
    }
    public void light(boolean n){
        if(n){
            System.out.println("Light is ON");
        }
        else{
            System.out.println("Light is OFF");
        }
    }
    public void horn(boolean h){
        if(h){
            System.out.println("Horn Blowing...");
        }
        else{
            System.out.println("Tap Button to Blow horn");
        }
    }
}
public class Interface {
    public static void main(String[] args) {
        Bicycle ac = new AvonCycle();  //Reference of Interface
        ac.applyBrake(3);
        ac.speedUp(1);

        AvonCycle av = new AvonCycle();
        av.light(true);

        Accessories aa = new AvonCycle();
        aa.horn(true);
    }
}
