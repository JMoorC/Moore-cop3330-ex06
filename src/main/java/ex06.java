/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Moore
 */
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args){
        Scanner inScan = new Scanner(System.in);
        System.out.print("What is your current age? ");
        int ageNow = inScan.nextInt();
        System.out.print("At what age would you like to retire? ");
        int ageGoal = inScan.nextInt();
        int difference = ageGoal -ageNow;

        int currentYear = (int) (System.currentTimeMillis()/60000);
        currentYear /= 525600;
        currentYear += 1970;

        if (ageNow >= ageGoal){
            System.out.println("Enjoy your retirement you old geezer.");
        }
        else{
            System.out.printf(
                    "You have %d years before you can retire\nIt's %d, so you can retire in %d.\n",
                    difference, currentYear, currentYear + difference);
        }

    }
}
