public class AccountManager {
    private double balance;
    //para yatırma
    public void deposit(double amount){
        balance = getBalance() + amount;
    }
    //para çekme
    public void withdraw(double amount) throws BalanceInsufficentException {
        if (balance>=amount){
            balance = getBalance() - amount;
        }else {
            throw new BalanceInsufficentException("bakiye yetersiz");
        }

    }
//hesaptaki parayı getir
    public double getBalance() {
        return balance;
    }
}
