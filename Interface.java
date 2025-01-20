//All Methods in Interface are Abstract Method
//Class Implement the Interface have to Implement all those Abstract Method
interface Bicycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements Bicycle{
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
}
public class Interface {
    public static void main(String[] args) {
        Bicycle ac = new AvonCycle();  //Reference of Interface
        ac.applyBrake(3);
        ac.speedUp(1);

        AvonCycle av = new AvonCycle();
        av.light(false);
    }
}
