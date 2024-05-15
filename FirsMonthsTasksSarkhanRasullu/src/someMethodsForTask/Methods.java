package someMethodsForTask;

public class Methods {


    public static void printDivideByNum(int number, int divideBy) {
        for (int i = 0; i <= number; i++) {
            if (i % divideBy == 0) {
                System.out.println(i);
            }
        }

    }

    public static void printEvenNumberTillOurNumber(int number) {
        printDivideByNum(number, 2);
    }

    public static void printPrimeNumbersTillOurNumber(int number) {

        for (int i = 2; i <= number; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    count++;
                }
            }
            if (count <= 2) {
                System.out.println(i);
            }
        }
    }


    public static void verilmisEdedinReqCemi(int number) {
        int qaliq = 0;
        int cem = 0;


        while (number > 0) {
            qaliq = number % 10;
            cem += qaliq;
            number /= 10;

            if (number == 0) {
                System.out.print(qaliq);
            } else {
                System.out.print(qaliq + " + ");
            }
        }
        System.out.print(" = " + cem);
    }


    public static void countQuantityNum(int num) {
        int say = 0;
        while (num > 0) {
            num /= 10;
            say++;
        }
        System.out.println(say);
    }


    public static int factorial(int number) {

        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isPalindrom(String word) {

        int sag = 0;
        int sol = 0;
        boolean isPalindrom = true;

        for (sag = word.length() - 1, sol = 0; sag >= 0; sag--) {
            if (word.toLowerCase().charAt(sag) != word.toLowerCase().charAt(sol)) {
                isPalindrom = false;
                break;
            }
            sol++;
        }
        return isPalindrom;
    }


    public static int factorialWithoutFor(int num) {
        if (num == 0) {
            return 1;
        }

        return num * factorialWithoutFor(num - 1);
    }

    public static boolean isPalindromForNumbers(int num) {
        int qaliq = 0;

        int tersNum = 0;

        int duzNum = num;

        boolean polindrom = false;

        while (num > 0) {
            qaliq = num % 10;
            tersNum += qaliq;
            if (num / 10 == 0) {
                break;
            }
            tersNum *= 10;
            num /= 10;
        }

        if (duzNum == tersNum) {
            polindrom = true;
        }

        return polindrom;

    }

    public static void task9(int say, char simvol, boolean altAlta) {

        if (altAlta == true) {
            for (int i = 0; i < say; i++) {
                System.out.println(simvol);
            }
        } else {
            for (int i = 0; i < say; i++) {
                System.out.print(simvol);
            }
        }
    }

    public static void verilmisReqemeQederQuvveteYukselt(int start, int end, int quvvet) {

        int temp = quvvet;

        for (int i = start; start <= end; start++) {
            quvvet = temp;
            i = start;
            while (quvvet > 1) {
                i *= i;
                quvvet--;
            }

            System.out.println(i);
        }
    }

    public static void checkNegOrPos(double number) {
        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number == 0) {
            System.out.println("Number is zero");
        } else {
            System.out.println("Number is negative");
        }
    }

    public static void kvadratTenlikKokleri(double a, double b, double c) {
        double ds = b * b - (4 * a * c);

        if (ds > 0) {
            double r1 = (-b + Math.pow(ds, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(ds, 0.5)) / (2 * a);
            System.out.println("Tenliyin kokleri r1 = " + r1 + "  r2 = " + r2);
        } else if (ds == 0) {
            double r1 = -b / 2 * a;
            System.out.println("tenliyin 2 bareber koku var r1 = r2 = " + r1);
        } else {
            System.out.println(" Tenliyin heqiqi koku yoxdur");
        }
    }

    public static void findMaxBetween3(int n1, int n2, int n3) {
        int max;
        if (n1 > n2 && n1 > n3) {
            max = n1;
        } else if (n2 > n1 && n2 > n3) {
            max = n2;
        } else {
            max = n3;
        }
        System.out.println(max);
    }

    public static void numberOfDayWeek(int daysNum) {
        switch (daysNum) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Number should be between 1 and 7");
        }
    }

  public static void minlikHisseMuqayise(double num1 , double num2){


      int tamNum1 =  (int) (num1 * 1000);
      int qalNum1 = tamNum1 % 1000;
      System.out.println(qalNum1);

      int tamNum2 =  (int) (num2 * 1000);
      int qalNum2 = tamNum2 % 1000;
      System.out.println(qalNum2);

      if (qalNum1 == qalNum2){
          System.out.println("They are equal");
      }else {
          System.out.println("They are different");
      }
  }

  public static void countMonthOfDays(int numberOfDay , int year){
      String monthName;


      switch (numberOfDay) {
          case 1:
              monthName = "January";
              System.out.println(monthName + " " + year + " has 31 days ");
              break;
          case 2:
              monthName = "February";
              if (year % 4 == 0) {
                  System.out.println(monthName + " " + year + " has 29 days ");
              } else {
                  System.out.println(monthName + " " + year + " has 28 days ");
              }
              break;
          case 3:
              monthName = "Mart";
              System.out.println(monthName + " " + year + " has 31 days ");
              break;
          case 4:
              monthName = "April";
              System.out.println(monthName + " " + year + " has 30 days ");
              break;
          case 5:
              monthName = "May";
              System.out.println(monthName + " " + year + " has 31 days ");
              break;
          case 6:
              monthName = "June";
              System.out.println(monthName + " " + year + " has 30 days ");
              break;
          case 7:
              monthName = "Jule";
              System.out.println(monthName + " " + year + " has 31 days ");
              break;
          case 8:
              monthName = "Augustus";
              System.out.println(monthName + " " + year + " has 31 days ");
              break;
          case 9:
              monthName = "September";
              System.out.println(monthName + " " + year + " has 30 days ");
              break;
          case 10:
              monthName = "October";
              System.out.println(monthName + " " + year + " has 31 days ");
              break;
          case 11:
              monthName = "Novomber";
              System.out.println(monthName + " " + year + " has 30 days ");
              break;
          case 12:
              monthName = "December";
              System.out.println(monthName + " " + year + " has 31 days ");
              break;
          default:
              System.out.println("enter num between 1 and 12");
              break;

      }
  }

}
