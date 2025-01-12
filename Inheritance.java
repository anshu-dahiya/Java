class Animal{
    public void eat(){
        System.out.println("eating....");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("barking....");
    }
    public void jump(){
        System.out.println("jumping....");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.jump();
        d1.eat();
    }
}
