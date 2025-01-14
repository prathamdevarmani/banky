import java.util.*;

class Bank {

    float Balance;
    int PIN = 143;

    public void CheckPin() {
        System.out.println("\n\n\t\tWelcome to our Bank  \n");
        System.out.print("\nEnter Your Pin : ");
        Scanner sc = new Scanner(System.in);
        int Pin = sc.nextInt();
        System.out.println(" ");

        if (Pin == PIN) {

            Menu();
        } else {
            System.out.println("Enter Valid Pin");
            CheckPin();
        }
        sc.close();

    }

    public void Menu() {
        System.out.println("Enter Your Choice ");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Transfer Amount");
        System.out.println("4. Check Account Balance");
        System.out.println("5. Exit");

        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        int enteredchoice = sc.nextInt();

        if (enteredchoice == 1) {
            Deposit();
        } else if (enteredchoice == 2) {
            Withdraw();
        } else if (enteredchoice == 3) {
            Transfer();
        } else if (enteredchoice == 4) {
            CheckBalance();
        } else if (enteredchoice == 5) {
            System.out.println("Thank you!!");
            sc.close();
        } else {
            System.out.println("Enter valid choice");
        }
    }

    public void CheckBalance() {
        System.out.println("Balance : "+Balance);
        System.out.println(" ");
        Menu();

    }

    public void Withdraw() {
        System.out.println("Enter Amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        float withdrawAmount = sc.nextFloat();
        if (withdrawAmount <= Balance) {
            System.out.println("Your Amount "+withdrawAmount+" is Withdraw Successfully: ");
        } else {
            System.out.println("Insufficient Amount. Your balance is "+Balance);
        }
        System.out.println(" ");

        Balance = Balance - withdrawAmount;
        Menu();
        sc.close();

    }

    public void Deposit() {
        System.out.println("Enter Amount to Deposit; ");
        Scanner sc = new Scanner(System.in);
        float DepositAmount = sc.nextFloat();
        System.out.println("Your Amount "+DepositAmount+" is Deposite Successfully: ");

        System.out.println(" ");

        Balance = Balance + DepositAmount;
        Menu();
        sc.close();

    }

    public void Transfer() {
        System.out.println("Enter Amount to Transfer: ");
        Scanner sc = new Scanner(System.in);
        Float TransferAmount = sc.nextFloat();
        System.out.println("Your Amount "+TransferAmount+" is Transfer Successsfully: ");
        System.out.println(" ");

        Balance = Balance - TransferAmount;
        Menu();
        sc.close();
    }

}

public class Banky {

    public static void main(String[] args) {

        Bank obj = new Bank();
        obj.CheckPin();

    }

}