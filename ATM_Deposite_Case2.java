import java.util.Scanner;
class ATM_Pra{
    public static void main(String[] args){
        int balance=6000, withdraw, deposit;
        Scanner input=new Scanner(System.in);
        while(true)
        {
            System.out.println("Welcome to ATM(Automated Teller Machin)");
            System.out.println("Press 1 for withdraw");
            System.out.println("Press 2 for deposit");
            System.out.println("press 3 for Check Balance");
            System.out.println("press 4 for Exit");
            System.out.println("Choose the Operation you want");
            int n=input.nextInt();
            switch(n)
            {
                case 1:
                    System.out.println("Enter money to withdrawn: ");
                    withdraw =input.nextInt();
                    if(balance>=withdraw)
                    {
                        balance=balance - withdraw;
                        System.out.println("Please collect your money");
                    }
                    else
                    {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Enter money to be deposited");
                    deposit=input.nextInt();
                    balance=balance+deposit;
                    System.out.println("Your money has successfully Deposited");
                    System.out.println("");
                    break;
                
            }
        }
        
    }
}