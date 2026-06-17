public class UserAccount {
    private double balance;
    public void deposit(double amount)throws InvalidAmountException{
        if(amount<=0){
            throw new InvalidAmountException(amount+" is not Invalid!");
        }
        balance = balance+amount;

    }
    public double withdraw(double amount)throws InsufficientFoundException{
        if(balance<amount){
            throw new InsufficientFoundException("Insufficint Found!");
        }
        balance -=amount;
        return amount;
    }
    public void blancceEnQairy(){
        System.out.println("Current Balance:"+balance);
    }
}
