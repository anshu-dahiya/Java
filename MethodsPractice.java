//Problem 1(Method to print multiplication table)
//public class MethodsPractice {
//    static void multiplication(int n){
//        for(int i=1; i<=10; i++){
//            System.out.format("%d X %d = %d\n", n, i, n*i);
//        }
//    }
//    public static void main(String[] args){
//        multiplication(6);
//    }
//}


//Problem 2(Function to Print following Pattern)
//*
//**
//***
//****
//public class MethodsPractice {
//    static void pattern1(int n){
//        for(int i=0; i<n; i++){
//            for(int j=0; j<i+1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args){
//        pattern1(7);
//    }
//}


//Problem 3(Function to Print following Pattern)
//****
//***
//**
//*
public class MethodsPractice {
   static void pattern2(int n){
       for(int i=n-1; i>=0; i--){
           for(int j=0; j<i+1; j++){
               System.out.print("*");
           }
           System.out.println();
       }
   }
   public static void main(String[] args){
       pattern2(5);
   }
}

