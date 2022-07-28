import java.util.Scanner;  
public class ATM_Interface   
{  
        
    public static void main(String args[] )
    {  
            
	int balance = 100000, withdraw, deposit;  
                   
    	Scanner sc = new Scanner(System.in); 
		
	System.out.println("\nPlease enter your credentials.");
	System.out.print("\nEnter User ID:");
	String uid=sc.nextLine();

	System.out.print("Enter Pin:");
	String pin=sc.nextLine(); 

	if(uid.equals("Alex") && pin.equals("1234")) 
	{
              
            while(true)  
            {  
                System.out.println("\nWelcome to ATM");  
                System.out.println("1. Withdraw");  
                System.out.println("2. Deposit");  
				System.out.println("3. Transfer"); 
                System.out.println("4. Check Balance");  
                System.out.println("5. Quit");  
                System.out.print("\nChoose the operation you want to perform:");  
                  
               
                int choice = sc.nextInt();  
                switch(choice)  
                {  
                case 1: 
					System.out.print("\nEnter amount to be withdrawn:");  
                   
					withdraw = sc.nextInt();  
                          
				
					if(balance >= withdraw)  
					{  
					
					balance = balance - withdraw;  
					System.out.println("\nPlease collect your amount");  
					}  
					else  
					{  
				
					System.out.println("\nInsufficient Balance");  
					}  
					System.out.println("");  
				break;  
       
                case 2: 
                          
					System.out.print("\nEnter amount to be deposited:");  
                          
					
					deposit = sc.nextInt();  
                          
					
					balance = balance + deposit;  
					System.out.println("\nYour amount has been successfully deposited");  
					System.out.println("");  
				break;  
				
				case 3: 
						System.out.print("\nEnter Receiver's Bank Account Number: ");
						int rac=sc.nextInt();
						System.out.print("Enter Amount to be transferred: ");
						int amttransfer=sc.nextInt();
						if(amttransfer<=balance)
						{
							System.out.println("\nAmount Successfully transferred.");
							balance=balance-amttransfer;
						}
						else
						{
							System.out.println("\nYou don't have enough balance in your account.");
						}
						System.out.println(""); 
				break;
				
                case 4:
					System.out.println("\nBalance : "+balance);  
					System.out.println("");  
				break;  
       
                case 5:  
					System.exit(0);  
                }  
            }  
        }
	else 
	{
	System.out.println("\nWrong Credentials");
	}
   	}  
}  