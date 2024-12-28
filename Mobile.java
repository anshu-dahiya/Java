public class Mobile {
    // state(property) -> variables of this class
    // behaviour -> methods/functions of this class


    private double screenSize;
    private String operatingSystem;
    private int cameraMegaPixel;
    private String companyName;

    public Mobile(double _screenSize, String _operatingSystem, int _cameraMegaPixel, String _companyName) {
        screenSize = _screenSize;
        operatingSystem = _operatingSystem;
        cameraMegaPixel = _cameraMegaPixel;
        companyName = _companyName;

    }

    public void printValues() {
        System.out.println("Scree size : "+screenSize);
        System.out.println("Operating System : "+operatingSystem);
        System.out.println("Camera MP : "+cameraMegaPixel);
        System.out.println("Company Name : "+companyName);
    }

    public void callNumber(String phoneNumber){
        System.out.println("Calling to number : " + phoneNumber);
    }

    public void chargePhone(){
        System.out.println("Phone is charging");
    }

}
