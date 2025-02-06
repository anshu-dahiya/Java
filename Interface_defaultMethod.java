//Default Methods are used to implement method in Interface itself
//Private methods can also be implemented in interface but cannot be accessed by any other class

interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void flash(){     //it can only access by this interface
        System.out.println("Flash is ON");
    }
    default void record4KVideo(){
        flash();
        System.out.println("Recording in 4k...");
    }
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling..." + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyCamera,MyWifi{
    public void takeSnap(){
        System.out.println("Taking Snap...");
    }
    public void recordVideo(){
        System.out.println("Recording Video...");
    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"m34", "TpLink", "Airtel"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}

public class Interface_defaultMethod {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.takeSnap();
        ms.recordVideo();
        String[] arr = ms.getNetworks();
        for(String item : arr){     //Printing array with for each loop
            System.out.println(item);
        }
        ms.connectToNetwork("m34");
        ms.record4KVideo();

    }
}
