/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

import java.util.Scanner;

/**
 *
 * @author sa
 */
public class BankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Account acc = new Account();

        int choice;
        int amtW;
        int amtD;
        Scanner scan = new Scanner(System.in);

        int[] idNum = new int[10];

        for (int i = 0; i < 10; i++) {

            System.out.println("Enter an id");
            idNum[i] = scan.nextInt();

            while (idNum[i] > 0 && idNum[i] < 10) {

                System.out.println("Main menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.println("Enter a choice");
                choice = scan.nextInt();

                if (choice == 1) {

                    System.out.println("Your balance is " + acc.getBalance());
                    if (acc.getBalance() < 0) {
                    
                    System.err.println("YOU OWN THE BANK");
                    

                }

                } else if (choice == 2) {

                    System.out.println("Enter an amount to withdraw ");
                    amtW = scan.nextInt();
                    acc.withdraw(amtW);

                } else if (choice == 3) {

                    System.out.println("Enter an amount to deposit: ");
                    amtD = scan.nextInt();
                    acc.deposit(amtD);

                } else if (choice == 4) {

                    System.out.println("SEE YOU SOON...");
                    acc.exit();

                }else{
                    
                    System.err.println("Wrong Choice !! Try Again...");
                    
                    
                }
                
                
            }
            
            System.err.println("YOU ENTERED AN INVALID ID,Please enter the correct ID...: ");

        }

    }

}
