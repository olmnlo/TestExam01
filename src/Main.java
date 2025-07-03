import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //1. Write a Java program that accept three numbers from the user and print the largest number .
        System.out.println("1. Write a Java program that accept three numbers from the user and print the largest number .");
        System.out.print("Enter first number: ");
        int first_number = scn.nextInt();
        System.out.print("Enter second number: ");
        int second_number = scn.nextInt();
        System.out.print("Enter third number: ");
        int third_number = scn.nextInt();

        System.out.printf("the largest is %d\n", findLargest(first_number, second_number, third_number));



        //2. Write a Java program that accept a String and a number from the user,then print the character in the given index .
        System.out.println("2. Write a Java program that accept a String and a number from the user,then print the character in the given index .");
        System.out.print("Enter string: ");
        scn.nextLine(); // to fix bug of line scanner
        String string_number = scn.nextLine();
        System.out.print("Enter index of number you want to print: ");
        int index_number = scn.nextInt();
        printByIndex(string_number, index_number);



        //3. Write a program to enter the numbers till the user wants and at the end it should display the sum entered .
        System.out.println("3. Write a program to enter the numbers till the user wants and at the end it should display the sum entered .");
        boolean is_run = true;
        int total = 0;
        while (is_run){
            System.out.print("Enter number: ");
            int num = scn.nextInt();
            total += num;

            System.out.print("do you want to stop? enter \"yes\": ");
            String stop = scn.next();
            if (stop.equalsIgnoreCase("yes")) {
                is_run = false;
            }
        }
        System.out.printf("the total of numbers you write is: %d\n", total);



        //4. Write a Java program to find positive and negative numbers of a given array:
        //-  Original Array:
        //      [10, -21 , 30, 31, -25]
        //     -  Expected Output:
        //     10  is a positive number
        //     -21 is a negative number
        //      30 is a positive number
        //      31 is a positive number
        //     -25 is a negative number
        System.out.println("4. Write a Java program to find positive and negative numbers of a given array:");
        int[] ints_array = {10, -21 , 30, 31, -25};
        findPositiveNegative(ints_array);





        //5. Write a Java program to find the shortest word of a given array:
        // ["Tuwaiq", "Bootcamp" , "Student", "JAVA"]
        //    - Expected Output:
        //     JAVA
        System.out.println("5. Write a Java program to find a shortest word of a given array:");
        String[] strings_array = {"Tuwaiq", "Bootcamp", "Student", "JAVA"};
        int shortest_length = findShortestWord(strings_array);
        printShortest(strings_array, shortest_length);






    }
    //Q1--------------------------------------------------------------Q1//
    public static int findLargest(int num1, int num2, int num3){
        //check which number is largest
        if (num1 >= num2 && num1 >= num3){
            return num1;
        }else if (num2 >= num1 && num2 >= num3){
            return num2;
        }else {
            return num3;
        }
    }

    //Q2--------------------------------------------------------------Q2//
    public static void printByIndex(String stringNumber, int indexNumber) {
        //print by index of string
        System.out.println(stringNumber.charAt(indexNumber));
    }


    //Q4--------------------------------------------------------------Q4//
    public static void findPositiveNegative(int[] array){
        //check if positive or negative or zero
        for (int n : array){
            if (n > 0){
                //check positive
                System.out.printf("%d is positive\n", n);
            } else if (n == 0) {
                //check zero
                System.out.printf("%d is zero\n", n);
            } else {
                //check negative
                System.out.printf("%d is negative\n", n);
            }
        }
    }


    //Q5--------------------------------------------------------------Q5//
    public static int findShortestWord(String[] array){
        int minimum = array[0].length();

        for (int i = 1; i < array.length; i++) {

            if (array[i].length() <= minimum){
                //check if the length is shortest
                minimum = array[i].length();
            }
        }
        return minimum;
    }

    public static void printShortest(String[] array, int length){
        for (String s : array){
            if (s.length() == length){
                //check if string length equal to the shortest length print it
                System.out.print(s+" ");
            }
        }
    }
}