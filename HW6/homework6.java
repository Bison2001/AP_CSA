// Notice that all content of this file is originally created by Xuhui Liu (Bison). Please do not distribute it without my permission.
import java.lang.Math;

public class homework6 {
    public static void main(String args[]) {
        // Problem 1 test
        // double[] arr1 = {2, -2, 7, 4};
        // System.out.println("1: " + find_max(arr1));

        // // Problem 2 test
        // double[] arr2 = {2, -2, 7, 4};
        // System.out.println("2: " + find_mean(arr2));

        // Problem 3 test
        // double[] arr3a = {-2, 1, 4};
        // double[] arr3b = {1, 3, -1};
        // System.out.println("3: " + dot_product(arr3a, arr3b));

        // Problem 4 test
        // double[] arr4 = {2, 3};
        // System.out.println("4: " + norm(arr4));

        // // Problem 5 test
        // double[] arr5 = {2, 3};
        // System.out.println("5: " + norm_new(arr5));

        // Problem 6 test
        // double[] arr6 = {1, 2, 3};
        // double[] arr6_result = scale_array(arr6, 2, 1);
        // System.out.print("6: ");
        // for (double elem : arr6_result) {
        //     System.out.print(elem + " ");
        // }
        // System.out.println();

        // Problem 7 test
        // double[] arr7 = {4, 5, 3, 1};
        // System.out.print("7: ");
        // for (double elem : subscribe(arr7, 0, 2)) {
        //         System.out.print(elem + " ");
        // }
        // System.out.println();

        // // Problem 8 test
        // int[] arr8a = {1,3,4,6};
        // int[] arr8b = {-2,-1,2,5,10};
        // int[] arr8_result = merge(arr8a, arr8b);
        // System.out.print("8: ");
        // for (double elem : arr8_result) {
        //     System.out.print(elem + " ");
        // }
        // System.out.println();

        // // Problem 9 test
        // double[] arr9 = {1, 2, 4, 5};
        // double[] arr9_result = Reverse_array(arr9);
        // System.out.print("9: ");
        // for (double elem : arr9_result) {
        //     System.out.print(elem + " ");
        // }
        // System.out.println();

        // // Problem 10 test
        // double[] arr10 = {1, 3, 4, 5};
        // Reverse_array_inplace(arr10);
        // System.out.print("10: ");
        // for (double elem : arr10) {
        //     System.out.print(elem + " ");
        // }
        // System.out.println();
    }

    // Porblem 1
    public static double find_max(double[] input) {
        // return the max value of the given array
        // example: arr = {2, -2, 7, 4}
        // find_max(arr) should return 7
        // example: arr1 = {-3, 1, 5, 6, 3, 9}

        return 0;
    }


    // Porblem 2
    public static double find_mean(double[] input) {
        // return the mean value of the given array
        // example: arr = {2, -2, 7, 4}
        // find_mean(arr) should return 2.75
    
        return 0;
    }


    // Porblem 3
    public static double dot_product(double[] arr1, double[] arr2) {
        // the method takes two double arrays as input and return the dot product of these two arrays
        // the dot product of two arrays is to multiply two array element-wise and sum each element-wise product up
        // for example dot product of {1,2} and {3,4} is 1*3+2*4 = 11
        // the dot product of {-2, 1, 4} and {1, 3, -1} is (-2)*1 + 1*3 + 4*(-1) = -3

        return 0;
    }


    // Porblem 4
    public static double norm(double[] input) {
        // this method takes a double array as input and return the norm of this array
        // norm of an array is calculated as the following way: you first raise each element in this array to power 2
        // and sum all elements up and then take square root
        // for example norm of {2, 3} is square root of 2^2 + 3^2 = 根号13
        return 0;
    }


    // Porblem 5
    public static double norm_new(double[] input) {
        // can you think about a new way to calculate norm by using dot product?
        return 0;
    }


    // Porblem 6
    public static double[] scale_array(double[] input, double coef, double bias) {
        // this method takes in a double array, a double value called coef, and a double value called bias
        // you will need to multiply each element in the array by coef and add bias to each element
        // example:
        // input = {1, 2, 3}, coef = 2, bias = 1
        // then you should return {1*2+1, 2*2+1, 3*2+1} = {3, 5, 7}

        return new double[0];
    }


    // Porblem 7
    public static double[] subscribe(double[] input, int startIndex, int endIndex) {
        // this method subscribes the input array according to startIndex and endIndex
        // it returns a new array with startIndex to endIndex of original array
        // you can assume start index is greater than or equal to 0 and less than end index
        // the end index is less than array length
        // example input = {4, 5, 3, 1}
        // subscribe(input, 0, 2) should return {4, 5}
        // example input = {2, 3, 5, 1, 6, 7, 8}
        // subscribe(input, 2, 5) should return {5, 1, 6}
        
        return new double[0];
    }


    // Porblem 8
    public static int[] merge(int[] arr1, int[] arr2) {
        // this is another very challenging problem
        // suppose you are given two sorted array, and you
        // want to merge them to a single sorted array. Example below:
        // arr1 = {1,3,4,6}
        // arr2 = {-2,-1,2,5,10}
        // you should return {-2,-1,1,2,3,4,5,6,10}
        // another example
        // arr1 = {0,1}
        // arr2 = {3,4}
        // you should return {0,1,3,4}
        return new int[1];
    }


    // Porblem 9
    public static double[] Reverse_array(double[] input) {
        // This method takes a double array as input and return 
        // another double array which is reverse of original array
        // example input = {1,2,3,4}
        // reverse_array(input) should return {4,3,2,1}
        return new double[0];
    }


    // Porblem 10
    public static void Reverse_array_inplace(double[] input) {
        // This method takes a double array as input reverse it
        // inplace
        // hint: this is a challenging problem, you can consider swap every two element of the array
        // example arr = {1,2,3,4}
        // Reverse_array_inplace(arr)
        // your arr should then be {4,3,2,1} (notice that you are editing orginal array)
    }

    // Problem 11 
    public static double[] random_array(int size) {
        // generate a random array of given size
        return new double[size];
    }

    // Problem 12
    public static int find_max_index(double[] input) {
        // find the index of the max element of the input array
        return 0;
    }

    

    
}