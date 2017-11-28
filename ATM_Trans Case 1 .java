import java.util.Scanner;
class ATM_Trans{
    public static void main(String[] args){
        int balance=6000, withdraw, deposit;
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("Welcome to ATM (Atumated Teller Machin)");
            System.out.println("press 1 For withdraw");
            System.out.println("press 2 for deposit");
            System.out.println("press 3 for Checking Balance");
            System.out.println("press 4 for EXIT");
            System.out.println("Select the operation you want");
            int n=input.nextInt();
            switch(n)
            {
                case 1:
                    System.out.println("Enter your amount to Withdraw");
                    withdraw = input.nextInt();
                    if(balance>=withdraw)
                    {
                        System.out.println("Please Take your money from Cash Dispenser");
                    }
                    else 
                    {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;
                          
            }
            
        }
    }
    
}