package Construction;

public class Bank {
    String BankName;
    String BankHolder;
    double initialBalance;

    public Bank(String Bank, String Holder, double inBalance) {
        this.BankHolder = Holder;
        this.BankName = Bank;
        this.initialBalance = inBalance;
    }

    public double  Withdraw(double value){
        if(value < 0 && value > initialBalance){
            System.out.println("Can't withdraw more or less");
        } else if (value > 0 && value <= initialBalance) {
            initialBalance -= value;
            
        } else {
            System.out.println("Can't perform.");
        }
        return initialBalance;
    }

    public double Deposit(double value){
        if (value < 0) {
            
        } else if(value > 0) {
            initialBalance += value;
        }
        return initialBalance;
    }

    public void Display(){
        System.out.println("BANK NAME: "+ BankName);
        System.out.println("Bank holder: "+BankHolder);
        System.out.println("Initial balance: "+initialBalance);
    }

}
