import java.util.Scanner;

public class index {

    String Language;
    String UserName;
    int Password;
    int Account;
    float AccountBalance;
    int Transactions;
    String History;

    public void newProfile(){
        System.out.println("Enter your username");
        Scanner sc = new Scanner(System.in);
        this.UserName = sc.next();
        System.out.println("Enter your password");
        this.Password = sc.nextLine();
        System.out.println("Enter your AccountNumber");
        this.Account = sc.nextInt();        
    }

    public void login(){
        
    }

    public void withdrraw(){

    }

    public void deposit(){

    }

    public void accountBalance(){

    }

    public void history(){

    }
    public static void main(String[] Args){
    System.out.println("Insert your Debit Card");   
    System.out.println("Select Language:");   
    System.out.println("Please Enter Pin");   
    System.out.println("Please Select a Transaction-");   
    System.out.println("Withdraw money");   
    System.out.println("Enter the amount of money");   
    System.out.println("Do you want to withdraw x money yes/no");   
    System.out.println("Please Collect Cash");   
    System.out.println("Deposit Money");   
    System.out.println("Transfer Money");   
    System.out.println("Account Balance");   
    System.out.println("Transactions History");   
    System.out.println("Quit");   
    System.out.println("Please Withdraw your card \n Happy Banking!!");   
    }
}