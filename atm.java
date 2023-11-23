import java.util.*;
public class atm{
    int balance,amt;
    int pin=2005;

    atm(){

        balance=10000;
    }
    Scanner s=new Scanner(System.in);
    void deposit(){

        System.out.println("enter amt to add ");
        amt=s.nextInt();
        balance+=amt;
        System.out.println("balance after adding money \n"+balance);

    }
    void chkbalance(){

        System.out.println("the account holds the balance of "+balance);

    }
    void withdraw(){

        System.out.println("enter amount to withdraw ");
        amt=s.nextInt();
        if(balance>amt){
        balance-=amt;
        System.out.println("the balance amount \n"+balance);}
        else{
            System.out.println("insufficient balance");
        }

    }
    void changepin(){

        int currentpin;
        System.out.println("enter current pin ");
        currentpin =s.nextInt();
        if(currentpin==pin){
            System.out.println("enter new pin");
            pin=s.nextInt();
            System.out.println("pin after changing "+pin);
        }
        else{
            System.out.println("the current pin is incorrect");
        }


    }


    public static void main(String[] args) {
        int choice, pass;
        int pin = 2005;
        String ch, ch2;
        do {
            System.out.println("........WELCOME........");
            System.out.println("enter 's' after inserting card ");
            Scanner n = new Scanner(System.in);
            ch = n.nextLine().toLowerCase();
            if(ch.equals("s") ){
                System.out.println("1.deposit \n2.balance \n3.withdraw \n4.change pin");
                Scanner s = new Scanner(System.in);
                System.out.println("enter ur choice ");
                choice = s.nextInt();
                System.out.println("enter pin number ");
                pass = s.nextInt();
                atm a1 = new atm();
                if (pass == pin) {
                    switch (choice) {
                        case 1:
                            a1.deposit();
                            break;
                        case 2:
                            a1.chkbalance();
                            break;
                        case 3:
                            a1.withdraw();
                            break;
                        case 4:
                            a1.changepin();
                            break;
                    }

                }
                else {
                    System.out.println("incorrect pin...");
                }
            }
            System.out.println("do u want to continue ...(s/n)");
            ch2 = n.nextLine().toLowerCase();
        }while(ch2.equals("s"));
    }
 }
