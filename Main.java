// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean machine = true;
        int totalAmountRemaining = 0;
        while(machine){
        System.out.println("\nPress");
        System.out.println("\n1.For Entering the Coins .");
        System.out.println("\n2. Select Product from the following :-");
        System.out.println("\n\t1. Coke - $25");
        System.out.println("\n\t2. Pepsi - $35");
        System.out.println("\n\t3. Soda - $45");
        System.out.println("\n3. to cancel this order");
        System.out.println("\n4. To Accept the order");
        System.out.println("\nEnter your Choice :-");
        int choice;
        choice = sc.nextInt();
        switch(choice){
            case 1 : {
                System.out.println("\nPlease Enter the coins (1, 5, 10, 25) :-");
                int coins = sc.nextInt();
                if(coins == 1 || coins == 5 || coins == 10 || coins == 25){
                      totalAmountRemaining += coins;   
                }
                else{
                    System.out.println("\nInvalid Coin Entered, Please Try Again!!!");
                }
                break;
            }
            case 2: {
                System.out.println("\nEnter the number of product you want:-");
                int prodNum = sc.nextInt();
                if(prodNum == 1){
                    if(totalAmountRemaining < 25){
                        System.out.println("\nSorry! Insufficient Funds.");
                    }
                    else{
                    System.out.println("\nYour Coke is Added.");
                    totalAmountRemaining -= 25;
                    }
                }
                else if(prodNum == 2){
                    if(totalAmountRemaining < 35){
                        System.out.println("\nSorry! Insufficient Funds.");
                    }
                    else{
                    System.out.println("\nYour Pepsi is Added.");
                    totalAmountRemaining -= 35;
                    }
                }
                else if(prodNum == 3){
                    if(totalAmountRemaining < 45){
                        System.out.println("\nSorry! Insufficient Funds.");
                    }
                    else{
                    System.out.println("\nYour Soda is Added.");
                    totalAmountRemaining -= 45;
                    }
                }
                break;
            }
            case 3 : {
                System.out.println("You have Cancelled this order");
                System.out.println("Amount Returned =" + totalAmountRemaining);
                totalAmountRemaining = 0;
                break;
            }
            case 4 : {
                System.out.println("Your Order has been Accepted!!!");
                System.out.println("Please take your Order");
                System.out.println("Please take the remaining Amount :- " + totalAmountRemaining);
                totalAmountRemaining = 0;
                break;
            }
            default : {
                System.out.println("No Choice or invalid choice Entered!!");
                System.out.println("Please try Again");
                break;
            }
        }
    }
}
}
