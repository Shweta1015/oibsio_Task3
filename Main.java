package ATMProject;

import java.util.Scanner;
import java.util.SortedMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        mainInterface obj= new operation();
        int atmpin=1010;
        Scanner sc= new Scanner(System.in);
        System.out.print("Welcome to ATM!!! \n Pleaser insert the card and Enter the pin: ");
        int pin= sc.nextInt();

        if(pin == atmpin){
           while (true){
               System.out.println(" 1.Transaction History \n 2.Withdraw \n 3.Deposit \n 4.Transfer \n 5.Quit");
               System.out.print("Select Option: " );
               int option= sc.nextInt();
               if(option==1){                 //transaction history
                  obj.TransactionHistory();
               }

               else if(option==2){             //Withdraw
                   System.out.print("Enter the amount that you want to withdraw: ");
                   double withdrawCash=sc.nextDouble();
                   obj.withdrawAmount(withdrawCash);
               }

               else if (option==3) {          //deposit
                   System.out.print("Enter the amount that you want to deposit: ");
                   double depositCash=sc.nextDouble();
                   obj.depositAmount(depositCash);
               }

               else if(option==4){             //transfer
                   System.out.print("Enter the amount that you want to transfer: ");
                   double transferCash=sc.nextDouble();
                   obj.Transfer(transferCash);

               }
               else if(option==5){            //quit
                   System.out.print("Collect your card and thanks for using..!!");
                   System.exit(0);
               }
               else {
                   System.out.println("Please choose the correct option.");
               }
           }
        }
        else {
            System.out.println("Invalid pin..!!");
            System.exit(0);
        }
    }
}