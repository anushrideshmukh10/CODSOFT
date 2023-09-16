import java.util.Scanner;  
   
public class ATM{  
public static void main(String args[] ) {  
    //declare and initialize balance, withdraw, and deposit  
    int balance = 100000, withdraw, deposit;  
          
    //create scanner class object to get choice of user  
Scanner scan = new Scanner(System.in);  
          
while(true){   
    System.out.println("        ATM");
    System.out.println("Choose the operation you want to perform:");
    System.out.println(); 
    System.out.println("Choose 1 for WITHDRAW");  
    System.out.println("Choose 2 for DEPOSIT");  
    System.out.println("Choose 3 for CHECK BALANCE");  
    System.out.println("Choose 4 for EXIT"); 
       
//get choice from user  
int choice = scan.nextInt();  
switch(choice){  
case 1:  
    System.out.println();
    System.out.print("Enter money to be withdrawn:");  

//get the withdrawl money from user  
withdraw = scan.nextInt();  
//check whether the balance is greater than or equal to the withdrawal amount 

if(balance >= withdraw) {   
    //remove the withdrawl amount from the total balance  
    balance = balance - withdraw;  
    System.out.println();
    System.out.println("Please collect your money and the card.");
    System.out.println("Your Account Balance Is : "+balance);   
}  
else {  
    //show custom error message
    System.out.println();   
    System.out.println("SORRY! Insufficient Balance.");  
}  
    System.out.println("");  
break;  
   
case 2:  
    System.out.println();              
    System.out.print("Enter money to be deposited:");              
    //get deposite amount from te user  
deposit = scan.nextInt();  
                      
    //add the deposit amount to the total balanace  
    balance = balance + deposit; 
    System.out.println(); 
    System.out.println("Your Money has been successfully depsited."); 
    System.out.println("Your Account Balance Is : "+balance);  
    System.out.println("");  
break;  
   
case 3:  
    //displaying the total balance of the user  
    System.out.println();
    System.out.println("Your Account Balance Is : "+balance);  
    System.out.println("");  
break;  
   
case 4:  
    //exit from the menu  
    System.exit(0);  
    }  
   }  
  }  
}