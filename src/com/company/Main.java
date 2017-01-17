package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Howdy, This is a Tower of Hanoi Game\nPlease state how many rings are in your game\n(up to 6).");
        boolean set = true;
        while (set) {
            int choice = input.nextInt();
            if(choice < 7) {
                set = false;
                break;
            }
            else {
                //Convert choice to a String, back to int to check for equality.
                continue;
            }


        }






    }
}