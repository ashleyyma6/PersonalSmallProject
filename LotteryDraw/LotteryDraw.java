/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LotteryDraw;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LotteryDraw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of people, press ‘enter’ to end");
        boolean check = true;
        int numofpeople = 0;
        while (check) {
            if (input.hasNextInt() == false) {//check input
                System.out.println("Wrong input, please enter again");
                input.next();//wrong input then enter again
            } else {
                numofpeople = input.nextInt();
                check = false;
            }
        }

        String name[] = new String[numofpeople];
        System.out.println("Please enter the name of people with space between each name");
        for (int i = 0; i < numofpeople; i++) {
            name[i] = input.next();
            if (name[name.length - 1] != null) {//Check if the array is full
                System.out.println("Input complete");
                break;
            }
        }
        System.out.println("Lottery Draw result");
        check = true;
        while (check) {
            int num = 0 + (int) (Math.random() * (numofpeople));//get random number
                if (name[num] != null) {
                    System.out.print(name[num] + " ");
                    name[num] = null;   
                }
                check = !(name == null);
        }
    }
}
