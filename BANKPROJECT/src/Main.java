import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        try{
            Scanner in =new Scanner(System.in);
            UserAccount user = new UserAccount();
            String option="";

            do {
                System.out.println("1. DEPOSITE");
                System.out.println("2. WITHDRAW");
                System.out.println("3. BALANCE ENQUIRY");
                System.out.println("Enter Option:");
                option=in.next();
                switch(option){
                    case "1":{
                        System.out.println("Enter Deposit Amount:");
                        double amt=in.nextDouble();
                        user.deposit(amt);
                        user.blancceEnQairy();
                        break;
                    }
                    case "2":{
                        System.out.println("Enter Withdraw Amount:");
                        double amt =in.nextDouble();
                        double wdraw =user.withdraw(amt);
                        System.out.println("Withdraw Amount is:"+wdraw);
                        user.blancceEnQairy();
                        break;
                    }
                    case "3":{
                        user.blancceEnQairy();
                        break;
                    }
                    default:{
                        System.out.println("Invalid Option!");
                    }

                }
                System.out.println("Do You Want To Continue (yes/no):");
                option=in.next();
            }while(option.equalsIgnoreCase("yes"));
        }
        catch(InvalidAmountException in){
            System.out.println(in);
        }
        catch(InsufficientFoundException ins) {
            System.out.println(ins.getMessage());
        }

        catch(InputMismatchException inp) {
            System.out.println(inp.getMessage());
        }

        catch(NumberFormatException num) {
            System.out.println(num.getMessage());
        }



    }
}
