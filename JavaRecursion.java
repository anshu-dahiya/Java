////Problem 1 (Factorial Of Value)
//public class JavaRecursion {
//    static int factorial(int n){
//        if(n==0 || n==1){
//            return 1;
//        }
//        else{
//            return n * factorial(n-1);
//        }
//    }
//    public static void main(String[] args){
//        int x= 5;
//        System.out.println("The factorial of "+ x +"
//        is: " + factorial(x));
//    }
//}


//Problem 2 (Fibonacci Sequence)
//public class JavaRecursion {
//    static int fibonacci(int n){
//        if(n==0){
//            return 0;
//        }
//        else if (n==1) {
//            return 1;
//        }
//        else{
//            return fibonacci(n-1) + fibonacci(n-2);
//        }
//    }
//    public static void main(String[] args){
//        int terms = 10;
//        System.out.println("Fibonaaci Sequence up to "+ terms +" terms is:");
//        for(int i=0; i<terms; i++){
//            System.out.print(fibonacci(i) + " ");
//        }
//    }
//}


//Problem 3(Calculate sum of first n Natural number)
//public class JavaRecursion {
//    static int sumNatural(int n){
//        if(n==1){
//            return 1;
//        }
//
//        return n + sumNatural(n-1);
//    }
//    public static void main(String[] args){
//
//        int sum = sumNatural(6);
//        System.out.println(sum);
//    }
//}


//Problem 4(Recursive Function to Print following Pattern)
//*
//**
//***
//****
//public class JavaRecursion {
//    static void pattern1(int n){
//        if(n>0){
//            pattern1(n-1);
//            for(int i=0; i<n; i++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[]args){
//        pattern1(5);
//    }
//}


//Problem 5(Recursive Function to Print following Pattern)
//****
//***
//**
//*
public class JavaRecursion {
    static void pattern2(int n){
        if(n>0){
            for(int i=0; i<n; i++){
                System.out.print("*");
            }
            System.out.println();
            pattern2(n-1);
        }
    }
    public static void main(String[]args){
        pattern2(5);
    }
}