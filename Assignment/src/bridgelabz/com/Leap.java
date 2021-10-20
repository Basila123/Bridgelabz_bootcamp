package bridgelabz.com;

import java.util.Scanner;
public class Leap {



        public static void main(String args[])
        {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter any year:");
            int year = s.nextInt();//2001
            int l=String.valueOf(year).length();
            boolean flag = false;
            if(l==4) {
                if (year % 400 == 0) {
                    flag = true;
                } else if (year % 100 == 0) {
                    flag = false;
                } else if (year % 4 == 0) {
                    flag = true;
                } else {
                    flag = false;
                }
                if (flag) {
                    System.out.println("Year " + year + " is a Leap Year");
                } else {
                    System.out.println("Year " + year + " is not a Leap Year");
                }
            }
            else
            {
                System.out.println("Enter a 4 didgit number");
            }
        }
    }

