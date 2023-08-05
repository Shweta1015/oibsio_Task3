package ATMProject;

public class Atm {

    private double balance;
    private double TransactionHistory;
    private double depositAmount;
    private double withdrawAmount;
    private double Transfer;

    public void Atm(){
        //default constructor
    }

    //getter and setter


    public double getTransfer() {
        return Transfer;
    }

    public void setTransfer(double transfer) {
        Transfer = transfer;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getTransactionHistory() {
        return TransactionHistory;
    }

    public void setTransactionHistory(double transactionHistory) {
        TransactionHistory = transactionHistory;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
