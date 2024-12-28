public class Main {
    public static void main(String[] args){
        Mobile myPhone = new Mobile(6,"IOS",13,"Apple");
        myPhone.callNumber("1234567798");
        myPhone.chargePhone();
        myPhone.printValues();

        Mobile yourPhone = new Mobile(6, "Android",48,"Samsung");
        yourPhone.printValues();

        destroyPhone(myPhone);
        destroyPhone(yourPhone);

    }

    public static void destroyPhone(Mobile phone) {
        System.out.println("Phone is destroyed");
    }

}

