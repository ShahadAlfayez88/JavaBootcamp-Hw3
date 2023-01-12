import com.sun.jdi.FloatType;

import javax.naming.Name;
import java.sql.Array;
import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1
        System.out.println("1.Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2");
        int[] numbers = {50, -20, 0, 30, 40, 60, 10};
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {

            if (numbers.length >= 2 && numbers[i] == numbers[numbers.length - 1]) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
            break;

        }
        System.out.println(" - - - - - - - - - - - - -- - - - - -");

        // 2
        System.out.println("2.Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.");
        Integer array2[] = {1, 4, 17, 7, 25, 3, 100};
        System.out.println(Arrays.toString(array2));
        int k = 3;
        Arrays.sort(array2, Collections.reverseOrder());
        System.out.print("the " + k + " largest elements of the said array are: ");
        for (int i = 0; i < k; i++) {
            System.out.print(array2[i] + "  ");
        }

        System.out.println();
        System.out.println(" - - - - - - - - - - - - -- - - - - -");

        // 3
        System.out.println("3.Write a Java program to find the numbers greater than the average of the numbers of a given array.");
        int array3[] = {1,4, 17, 7, 25, 3, 100};
        int sum = 0;
        for (int a = 0; a < array3.length; a++) {
            sum = sum + array3[a];
        }

        double Avg = sum / array3.length;
        System.out.println("The average of the said array is: " + Avg);
        System.out.println("numbers that are larger than the average : ");
        for (int x = 0; x < array3.length; x++) {
            if (array3[x] > Avg) {
                System.out.println(array3[x]);
            }
        }
        System.out.println(" - - - - - - - - - - - - -- - - - - -");

        // 4
        System.out.println("4.Write a Java program to get the larger value between first and last element of an array of integers.");
        int[] array4 = {20, 30, 40};
        System.out.println(Arrays.toString(array4));
        for (int y = 0; y < array4.length; y++) {
            if (array4[y] > array4[array4.length - 1]) {
                System.out.println(array4[y] + " is greater");
            } else if (array4[array4.length - 1] > array4[y]) {
                System.out.println(array4[array4.length - 1] + " is greater");
            }
            break;
        }
        System.out.println(" - - - - - - - - - - - - -- - - - - -");

        // 5
        System.out.println("5.Write a Java program to swap the first and last elements of an array and create a new array.");
        int[] array5 = {20, 30, 40};
        System.out.println("The array before swap");
        System.out.println(Arrays.toString(array5));
        System.out.println("The array after swap");
        int first = array5[0];
        int last = array5[array5.length - 1];
        array5[array5.length - 1] = first;
        array5[0] = last;
        System.out.print(" " + Arrays.toString(array5) + "\n");
        System.out.println(" - - - - - - - - - - - - -- - - - - -");

        // 6
        System.out.println("6.Write a Java program to find all of the longest word in a given dictionary.");
        ArrayList<String> Dictionary = new ArrayList<>();
        String[] words = {"cat", "dog", "red", "is", "am"};
        int Longestword = 0;
        for (String s : words) {
            int length = s.length();
            if (length > Longestword) {
                Longestword = length;
            }
            if (length == Longestword) {
                Dictionary.add(s);
            }
        }
        System.out.println(Dictionary);
        System.out.println(" - - - - - - - - - - - - -- - - - - -");

        // 7

        System.out.println("7.Write a menu driven Java program with following option:");
        ArrayList<String> UserArray = new ArrayList<>();
        boolean exit = true;

        while (exit != false) {
            System.out.println("Welcome the array program please select from the following menu:" +
                    "\n a. Please select the size of the array and add the elements" +
                    "\n b. Display elements of an array" +
                    "\n c. Search the element within array." +
                    "\n d. Sort the array the size of the array should be entered by the user." +
                    "\n e. exit the program."
            );
            char UserInput = input.next().charAt(0);

            // choice 1
            if (UserInput == 'a') {
                System.out.println("please enter the size of the array");
                int arraysize = input.nextInt();
                System.out.println("Please enter elements to the array");
                for (int e = 0; e < arraysize; e++) {
                    String addElement = input.next();
                    UserArray.add(addElement);
                }

                // choice 2
            } else if (UserInput == 'b') {
                System.out.println(UserArray);

                // choice 3
            } else if (UserInput == 'c') {
                System.out.println("Please enter the element that you want to search about it:");
                String SearchElement = input.next();
                if (UserArray.contains(SearchElement)) {
                    System.out.println(SearchElement + " is in the array");
                } else {
                    System.out.println(SearchElement + "is not in the array");
                }

                // choice 4
            } else if (UserInput == 'd') {
                Collections.sort(UserArray);
                System.out.println("The result after sorting" + UserArray);
            } else if (UserInput == 'e') {
                exit = false;
            }
        }

        // 8
        System.out.println(" - - - - - - - - - - - - -- - - - - -");

        System.out.println("8. Write a program that displays the number of occurrences of an element in the array.");
        int[] array8 = {1,1,1,3,3,3,3,5};
        int [] newarray8= new int[array8.length];
        int x = 9 ;
        int Frequency = -1;
        boolean NotinArray = false;

        for(int i = 0; i < array8.length; i++){
            int count = 1;

            for(int j = i+1; j < array8.length; j++){

                if(array8[i] == array8[j]){
                    count++;
                    newarray8[j] = Frequency;
                }
                else if (x == array8[i]){
                    NotinArray = true;
                }
            }

            if(newarray8[i] != Frequency)
                newarray8[i] = count;
        }


        System.out.println(" the number of occurrences of an element in the array is  ");

        for(int i = 0; i < newarray8.length; i++){
            if(newarray8[i] != Frequency)
                System.out.println(array8[i] + " Occurs " + newarray8[i]); }

        for (int i = 0 ; i<newarray8.length; i++){
            if (NotinArray==false){
                System.out.println(x+" Occurs 0");
                break;
            }

        }






        // 9
        System.out.println(" - - - - - - - - - - - - -- - - - - -");
        System.out.println("9. Write a program that places the odd elements of an array before the even elements.");

        int[] array9 = {2, 3, 40, 1, 5, 9, 4, 10, 7};
        int[] Newarray9 = new int[array9.length];
        int count = 0;
        for (int v = 0; v < array9.length; v++)
        {
            if (array9[v] % 2 != 0)
            {
                Newarray9[count] = array9[v];
                count++;
            }
        }
        for (int v = 0; v < array9.length; v++)
        {
            if (array9[v] % 2 == 0)
            {
                Newarray9[count] = array9[v];
                count++;
            }
        }

        for (int c : Newarray9)
        {
            System.out.print(c+ " ");
        }
        System.out.println("\n"+" - - - - - - - - - - - - -- - - - - -");




        // 10
        System.out.println("10. Write a program that test the equality of two arrays.");
        int [] array10 = {2,3,6,6,4};
        int [] array11 = {2,3,6,6,4} ;
        System.out.println("Does Array 1 "+Arrays.toString(array10)+" equal Array 2 "+Arrays.toString(array11));
        System.out.println(Arrays.equals(array10, array11));
    }}
