// Practice Problem 1
// Create an array of 5 floats and calculate their sum
/*  public class ArrayProblem1 {
    public static void main(String[] args)
    {
        float [] marks = {95.5f, 55.5f, 64.5f, 76.5f, 43.5f};
        float sum = 0;
        for(float element: marks){
            sum = sum + element;
        }
        System.out.println("The Sum of all marks is " + sum);
    }
}
*/


// Practice Problem 2 (find value in array)
/*public class ArrayProblem1 {
    public static void main(String[] args)
    {
        float [] marks = {95.5f, 55.5f, 64.5f, 76.5f, 43.5f};
        float num = 76.5f;
        Boolean isInArray = false;
        for(float element: marks){
            if(num == element){
                isInArray = true;
                break;
            }
        }
        if(isInArray) {
            System.out.println("The " + num + " is present in array");
        }
        else{
            System.out.println("The " + num + " is not present in array");
        }
    }
}
 */

// Practice Problem 3 (avg. of marks array)
/*public class ArrayProblem1 {
    public static void main(String[] args)
    {
        float [] marks = {95.5f, 55.5f, 64.5f, 76.5f, 43.5f};
        float sum = 0;
        for(float element: marks){
            sum = sum + element;
        }
        System.out.println("The Avg. of all marks is " + sum/marks.length);
    }
}
 */

// Practice Problem 4 (add 2 matrices)
//   public class ArrayProblem1 {
//       public static void main(String[] args)
//       {
//           int [][] mat1 = {{1,2,3},
//                            {4,5,6}};
//           int [][] mat2 = {{2,4,6},
//                            {8,10,12}};
//           int [][] result = {{0,0,0},
//                              {0,0,0}};
//
//           for(int i=0; i<mat1.length; i++){
//               for(int j=0; j<mat1[i].length; j++){
//                   result[i][j] = mat1[i][j] + mat2[i][j];
//               }
//           }
//
//           for(int i=0; i<result.length; i++){
//               for(int j=0; j<result[i].length; j++){
//                   System.out.print(result[i][j] + " ");
//               }
//               System.out.println(" ");
//           }
//       }
//   }


// Practice Problem 5 (reverse an array)
// Type-1 (By reverse loop)
//   public class ArrayProblem1 {
//    public static void main(String[] args) {
//        int [] marks = {12, 24, 36, 48, 60, 72, 84, 96, 108, 120};
//
//        for(int i=marks.length-1; i>=0; i--){
//            System.out.print(marks[i] + " ");
//        }
//    }
//}

// Type-2 (By swapping)
//    public class ArrayProblem1 {
//        public static void main(String[] args) {
//            int [] arr = {12, 24, 36, 48, 60, 72, 84, 96, 108, 120};
//
//            int l = arr.length;
//            int n = Math.floorDiv(l, 2);
//            int temp;
//
//            for(int i=0; i<n; i++){
//
//                temp = arr[i];
//                arr[i] = arr[l-1-i];
//                arr[l-1-i] = temp;
//            }
//
//            for(int element: arr){
//                System.out.print(element + " ");
//            }
//        }
//    }


////Problem 6 (maximum element of array)
// public class ArrayProblem1 {
//     public static void main(String[] args){
//
//         int [] arr = {43, 64, 90, 12, 53, 36};
//
//         int max = 0;
//
//         for(int element: arr){
//             if(element>max){
//                 max = element;
//             }
//         }
//         System.out.println("Maximum element in array is " + max);
//     }
//}


//Problem 7(minimum element of array)
//public class ArrayProblem1 {
//    public static void main(String[] args){
//
//        int [] arr = {43, 64, 90, 12, 53, 36};
//
//        int min = arr[0];
//
//        for(int element: arr){
//            if(element < min){
//                min = element;
//            }
//        }
//        System.out.println("Minimum element in array is " + min);
//    }
//}


//Problem 8 (array is Sorted or not)
public class ArrayProblem1 {
    public static void main(String[] args){

        int [] arr = {43, 64, 90, 12, 53, 36};

        Boolean isSorted = true;

        for(int i=0; i<arr.length-1; i++ ){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is Sorted");
        }
        else {
            System.out.println("The Array is Not Sorted");
        }
    }
}

