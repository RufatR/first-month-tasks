import someMethodsForTask.Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static someMethodsForTask.Methods.*;

public class Main {
    public static void main(String[] args) {
        //1)  0  dan verilmis edede qeder butun 2 e bolune bilen ededleri cap et.


//        printEvenNumberTillOurNumber(5);

        // 2) 0 dan verilmis edede qeder sade ededleri cap et


//        printPrimeNumbersTillOurNumber(11);


       /*  3)  verilmis ededin butun ededleri cemini tap
       Mes: 1234
       1+2+3+4 = 10
        */


//     verilmisEdedinReqCemi(345);


        // 4)   3 cu  deyisen istifade etmeden 2 deyisenin yerini deyismek

//        int a = 5 ;
//
//        int b = 10;
//
//        a = a + b ; //15
//
//        b = a - b ; // 5
//
//        a = a - b ; //10
//
//        System.out.println("a = " + a + "\n" + "b = " + b);


        //  5) Ededin reqemlerinin sayini tapin

//       countQuantityNum(1234586982);


        // 6) faktorial hesablama fordan istifade etmeden


//        int factorial = factorial(4);


//       int factorial = factorialWithoutFor(5);
//
//
//
//        System.out.println(factorial);




        /*  7) verilmis Stringin tersi ile duzunun beraberliyini yoxla

        "SOS"  S O S
         */

//        boolean salam = isPalindrom("MaSasam");
//        System.out.println(salam);


        //  8) daxil edilen reqemin tersi ile duzunun beraberliyini yoxlayan


//        boolean palindromForNumbers = isPalindromForNumbers(454454);
//        System.out.println(palindromForNumbers);


      /*
       9) metot 1 reqem , char , boolean qebul etsin

       reqemin sayi qeder char chap etsin
       eger boolean true dursa alt alta
       deyilse yan yana


       */


//      task9(4,'a',false);


        /* 10) Metot 3 reqem qebul edir ,  a b c

            a-dan b-e qeder olan reqemleri c qeder quvvete yukseldir

         */

//        verilmisReqemeQederQuvveteYukselt(1, 10, 2);


        /*

        https://www.w3resource.com/java-exercises/conditional-statement/index.php

        linkdeki misallari hell edin
         */

      /*  1. Write a Java program to get a number from the user and print whether it is positive or negative.

                Test Data
        Input number:35
        Expected Output :
        Number is positive
*/
//     checkNegOrPos(-0.6);

       /*
       2. Write a Java program to solve quadratic equations (use if, else if and else).

        Test Data
        Input a:1
        Input b:5
        Input c:1
        Expected Output :
        The roots are - 0.20871215252208009 and - 4.7912878474779195

        kvadrat tenliyin koklerini tapmaq
        ax^2 + bx + x = 0

        D = b^2 - 4ac

        D > 0   2 koku var
        D < 0    heqiqi koku yoxdur
        D = 0    2 beraber koku
*/

//      kvadratTenlikKokleri(1,5,1);

     /*   3. Write a Java program that takes three numbers from the user and prints the greatest number.

        Test Data
        Input the 1st number: 25
        Input the 2nd number: 78
        Input the 3rd number: 87
        Expected Output :
        The greatest: 87

      */

//      findMaxBetween3(25,78,87);


       /* 4. Write a Java program that reads a floating -point number and prints "zero" if the number is zero.
        Otherwise, print "positive" or "negative".Add "small" if the absolute value of the number is less than 1, or
        "large" if it exceeds 1, 000, 000.

        Test Data
        Input a number: 25
        Expected Output :
        Input value: 25
        Positive number

        */

//        int number = 1000000 ;
//
//        if (number == 0){
//            System.out.println("Number is zero");
//        } else if (number > 0 && number >= 1000000) {
//            System.out.println("Positive large number");
//        } else if (number > 0 && number < 1000000) {
//            System.out.println("Positive Small number");
//        }else {
//            System.out.println("Negative small number");
//        }

 /*       5. Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays
        the weekday name.

        Test Data
        Input number:3
        Expected Output :
        Wednesday

  */


//        numberOfDayWeek(3);

   /*     6. Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.

                Test Data
        Input floating-point number: 25.586
        Input floating-point another number: 25.589
        Expected Output :
        They are different

    */

//      minlikHisseMuqayise(25.5866556 , 25.584529);


        /*7. Write a Java program to find the number of days in a month.

          Test Data
          Input a month number: 2
          Input a year: 2016
          Expected Output :
          February 2016 has 29 days

         */

//        countMonthOfDays(2,2022);

    /*    8. Write a Java program that requires the user to enter a single character from the alphabet.Print Vowel
        or Consonant, depending on user input.If the user input is not a letter (between a and z or A and Z),or is
        a string of length >1, print an error message.

        Test Data
        Input an alphabet:
        p
        Expected Output :
        Input letter is Consonant
     */

//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.next().toLowerCase();
//
//        boolean lowerCase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
//        boolean upperCase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
//        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
//                || input.equals("o") || input.equals("u");
//
//        if (input.length() > 1) {
//            System.out.println("Duzgun daxil edin");
//        } else if (!(lowerCase || upperCase)) {
//            System.out.println("Duzgun daxil edin");
//        } else {
//            if (vowels){
//                System.out.println("Input letter is vowel");
//            }else {
//                System.out.println("Input letter is Consonant");
//            }
//        }

     /*   13. Write a Java program to display the cube of the given number up to an integer.

        Test Data
        Input number of terms : 4
        Expected Output :

        Number is : 1 and cube of 1 is : 1
        Number is : 2 and cube of 2 is : 8
        Number is : 3 and cube of 3 is : 27
        Number is : 4 and cube of 4 is : 64

      */
//        int number = 9;
//        int say = 1;
//
//
//        for (int i = say; say <= number; say++) {
//            int quvvet = 3;
//            i = say;
//
//            while (quvvet > 1) {
//                i *= say;
//                quvvet--;
//            }
//            System.out.printf("Number is : %d and cube of %d is : %d" ,i , i , i);
//            System.out.println();
//        }


 /* 14. Write a Java program to display the multiplication table of a given integer.

                Test Data
        Input the number (Table to be calculated) : Input number of terms : 5
        Expected Output :

        5 X 0 = 0
        5 X 1 = 5
        5 X 2 = 10
        5 X 3 = 15
        5 X 4 = 20
        5 X 5 = 25

  */

//        int number = 5 ;
//
//        for (int i = 0; i <= number; i++) {
//
//            System.out.printf("%d X %d = %d",number,i,(number*i) );
//            System.out.println();
//        }

    /*    15. Write a Java program that displays the sum of n odd natural numbers.

                Test Data
        Input number of terms is: 5
        Expected Output :
        The odd numbers are :
        1
        3
        5
        7
        9
        The Sum of odd Natural Number upto 5 terms is: 25

     */

//        int say = 5 ;
//        int temp = say;
//        int [] odd  = new int[say];
//
//        for (int i = 1 ,k = 0; i <= say;i++ ) {
//            if (i % 2 != 0){
//                System.out.println(i);
//                odd[k++] = i;
//            }else{
//                say++;
//            }
//        }
//
//
//        int cem = 0;
//        for (int i = 0; i < odd.length; i++) {
//            cem += odd[i];
//        }
//        System.out.printf(" The Sum of odd Natural Number upto %d terms is: %d" , temp , cem);


       /* 16. Write a Java program to display the pattern like a right angle triangle with a number.

        Test Data
        Input number of rows : 10
        Expected Output :

            1
            12
            123
            1234
            12345
            123456
            1234567
            12345678
            123456789
            12345678910
        */

//        int num = 10;
//
//        for (int i = 1; i <= num  ; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

    /*    17. Write a program in Java to make such a pattern like a right angle triangle with a number which repeats
        a number in a row.

     The pattern is as follows :

        1
        22
        333
        4444

     */

//        int num = 4 ;
//
//        for (int i = 1; i <= num; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }

   /*     18. Write a Java program to make such a pattern like a right angle triangle with the number increased by 1.

        The pattern like:

        1
        2 3
        4 5 6
        7 8 9 10

    */


//        for (int i = 1 , reqem = 1; i <= 4 ; i++) {
//
//            for (int j = 0; j < i; j++) {
//                System.out.print(reqem++ + " ");
//            }
//            System.out.println();
//
//        }

   /*     19. Write a Java program to make such a pattern like a pyramid with a number that repeats in the same row.

           1
          2 2
         3 3 3
        4 4 4 4

   1
  2 2
 3 3 3
4 4 4 4

    */

//        int say = 7;
//
//
//        for (int i = 1; i <= say; i++) {
//           int k = say - i;
//            while (k > 0) {
//                System.out.print(" ");
//                k--;
//            }
//
//
//            for (int j = 0; j < i; j++) {
//
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }


   /*     20. Write a Java program to print Floyd's Triangle.

        Test Data
        Input number of rows : 5
        Expected Output :

        Input number of rows :  5

        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15

    */

//        int row = 5;
//
//        for (int i = 1, reqem = 1; i <= row; i++) {
//
//            for (int j = 0; j < i; j++) {
//                System.out.print(reqem++ + " ");
//            }
//            System.out.println();
//        }

//        21. Write a Java program to display the pattern like a diamond.
//
//                Test Data
//        Input number of rows (half of the diamond) :7
//        Expected Output :
//

//                    *
//                   ***
//                  *****
//                 *******
//                *********
//               ***********
//              *************
//               ***********
//                *********
//                 *******
//                  *****
//                   ***
//                    *


//      *
//     ***
//    *****
//     ***
//      *


//        int dovr = 3;
//        int u = 1;
//
//        int u2 = (dovr*2) - 1 ;
//
//
//        for (int i = 1; i <= dovr; i++) {
//
//            int b = dovr - i;
//            while (b > 0) {
//                b--;
//                System.out.print(" ");
//            }
//            if (i == 1) {
//                System.out.print("*");
//            } else {
//                u = u + 2;
//             int   temp = u;
//
//                while (u > 0) {
//                    System.out.print("*");
//                    u--;
//                }
//                u = temp;
//            }
//            System.out.println();
//
//        }
//
//        for (int i = dovr-1; i > 0  ; i--) {
//            int b = dovr - i ;
//            while (b > 0) {
//                b--;
//                System.out.print(" ");
//            }
//            u2  -= 2;
//            int temp = u2;
//
//            while (u2 > 0){
//                u2 --;
//                System.out.print("*");
//            }
//            u2 = temp;
//            System.out.println();
//
//
//
//        }


 /*     22. Write a Java program to display Pascal 's triangle.

        Test Data
        Input number of rows:5
        Expected Output :

        Input number of rows:5
           1
          1 1
         1 2 1
        1 3 3 1
       1 4 6 4 1
  */


//        int numRows = 5;
//
//        for (int i = 0; i < numRows; i++) {
//            // Add spacing for alignment
//            for (int j = 0; j < numRows - i; j++) {
//                System.out.print(" ");
//            }
//
//            int number = 1;
//            for (int j = 0; j <= i; j++) {
//                System.out.print(number + " ");
//                number = number * (i - j) / (j + 1);
//            }
//            System.out.println();
//        }


     /*   23. Write a Java program to generate the following *triangles.

                Test Data
        Input the number:
        6
        Expected Output :

           ******
            *****
             ****
              ***
               **
                *

      */


//        int rowNum = 6;
//        for (int i = rowNum; i > 0; i--) {
//
//            int b = rowNum - i ;
//            while (b>0){
//                System.out.print(" ");
//                b--;
//            }
//
//            for (int j = i; j > 0 ; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }


   /*     24. Write a Java program to generate the following @ 's triangle.

        Test Data
        Input the number:
        6
        Expected Output :

              @
             @@
            @@@
           @@@@
          @@@@@
         @@@@@@

    */

//        int rowNum = 6;
//
//        for (int i = 1; i <= rowNum; i++) {
//
//
//            int b = rowNum - i;
//
//            while (b >0){
//                System.out.print(" ");
//                b--;
//            }
//
//            for (int j = 0; j < i ; j++) {
//                System.out.print("@");
//            }
//            System.out.println();
//        }


      /*  25. Write a Java program to display the number rhombus structure.

        Test Data
        Input the number: 7
        Expected Output :


             1
            212
           32123
          4321234
         543212345
        65432123456
       7654321234567
        65432123456
         543212345
          4321234
           32123
            212
             1

       */

//        int rowNum = 7;
//
//        for (int i = 1; i <= rowNum; i++) {
//
//            int b = rowNum - i;
//            while (b > 0) {
//                System.out.print(" ");
//                b--;
//            }
//
//
//            if (i == 1) {
//                System.out.print("1");
//            } else {
//
//                for (int j = i, k = 0; j >= 0; j--) {
//
//
//                    if (i - k == 0) {
//
//                        for (int l = 2; l <= i ; l++) {
//                            System.out.print(l);
//
//                        }
//
//
//                    } else {
//                        System.out.print(i - k);
//                        k++;
//                    }
//
//
//                }
//            }
//
//            System.out.println();
//        }
//
//
//        for (int i = rowNum - 1; i > 0 ; i--) {
//
//            int b = rowNum - i ;
//            while (b > 0){
//                b--;
//                System.out.print(" ");
//            }
//
//            if (i == 1) {
//                System.out.print("1");
//            } else {
//
//                for (int j = i, k = 0; j >= 0; j--) {
//
//
//                    if (i - k == 0) {
//
//                        for (int l = 2; l <= i ; l++) {
//                            System.out.print(l);
//
//                        }
//
//
//                    } else {
//                        System.out.print(i - k);
//                        k++;
//                    }
//
//
//                }
//            }
//
//            System.out.println();
//
//        }

 /*       26. Write a Java program to display the following character rhombus structure.

                Test Data
        Input the number: 7
        Expected Output :


                 A
                ABA
               ABCBA
              ABCDCBA
             ABCDEDCBA
            ABCDEFEDCBA
           ABCDEFGFEDCBA
            ABCDEFEDCBA
             ABCDEDCBA
              ABCDCBA
               ABCBA
                ABA
                 A

  */

//        int rowNum = 4;
//        for (int i = 1; i <= rowNum; i++) {
//            int b = rowNum - i;
//
//            while (b > 0) {
//                b--;
//                System.out.print(" ");
//            }
//
//            if (i == 1) {
//                System.out.print("A");
//            } else {
//
//                for (int j = 0, k = 65; j < i; j++) {
//
//                    char herf = (char) k++;
//                    System.out.print(herf);
//                    if (i - j == 1){
//
//                        for (int l = i-1 , s = k - 2 ; l > 0 ; l--) {
//
//
//                            herf = (char) s--;
//                            System.out.print(herf);
//
//
//                        }
//
//
//                    }
//
//
//                }
//            }
//            System.out.println();
//
//        }
//
//        for (int i = rowNum - 1; i > 0 ; i--) {
//
//            int b = rowNum - i ;
//            while (b > 0) {
//                b--;
//                System.out.print(" ");
//            }
//            if (i == 1) {
//                System.out.print("A");
//            } else {
//
//                for (int j = 0, k = 65; j < i; j++) {
//
//                    char herf = (char) k++;
//                    System.out.print(herf);
//                    if (i - j == 1){
//
//                        for (int l = i-1 , s = k - 2 ; l > 0 ; l--) {
//
//
//                            herf = (char) s--;
//                            System.out.print(herf);
//
//
//                        }
//
//
//                    }
//
//
//                }
//            }
//            System.out.println();
//
//
//        }


        /*
        1. Write a Java program to sort a numeric array and a string array.
         */
//
//        int [] arr = {1, 2, 5, 6, 90, 7, 1, 45, 6,-1};
//
//        Arrays.sort(arr);
//        String string = Arrays.toString(arr);
//        System.out.println(string);
//
//        String [] strArr = {"Rufat" , "Mehman" ,  "Elcan" , "ve s."};
//
//        Arrays.sort(strArr);
//
//        System.out.println(Arrays.toString(strArr));

        //2. Write a Java program to sum values of an array.


//        int[] arr = {1, 2, 3};
//
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println(sum);



    /*    3. Write a Java program to print the following grid.

                Expected Output :

        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -

     */

//        int [][] arr = new int[10][10];
//
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < arr[i].length; j++) {
//
//                System.out.print("- ");
//
//            }
//            System.out.println();
//
//        }

        //  4. Write a Java program to calculate the average value of array elements.

        int[] arr = {20, 30, 25, 35,-16,60,-100};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avarage = sum / arr.length;



    }
}