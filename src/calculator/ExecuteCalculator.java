/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Daffodi PC
 */
public class ExecuteCalculator {

    public void runCalculator() {

        while(true){
            Calculator obj = new Calculator();
            System.out.println("Please insert ur choice:\n1.Add,\n2.Sub,\n3.Multilication,\n4.Div,\n5.Quit");
            Scanner scn = new Scanner(System.in);
            int choice = scn.nextInt();
            if (choice == 5) {
                break;
            }else if (choice == 1) {
                System.out.println("Insert first number.");
                int x = scn.nextInt();
                System.out.println("Insert second number.");
                int y = scn.nextInt();
                System.out.println("Summation is -- "+ obj.add(x,y));
            }


        }
        System.out.println("Done");
        
    }
}
