package ATMProject;

import java.util.HashMap;
import java.util.Map;
public class operation implements mainInterface{
    Atm atm= new Atm();
    Map<Double,String>transtHis= new HashMap<>();

    @Override
    public void TransactionHistory() {
        for(Map.Entry<Double,String>t:transtHis.entrySet()) {
            System.out.println(t.getKey() + " " + t.getValue());
        }
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
         if(withdrawAmount<=atm.getBalance()){
             transtHis.put(withdrawAmount,"Amount withdrawn");
             System.out.println("Collect your Cash: "+withdrawAmount);
             atm.setBalance(atm.getBalance()-withdrawAmount);
             viewBalance();
         }else {
             System.out.println("Insufficient amount...!!");
         }
    }

    @Override
    public void depositAmount(double depositAmount) {
        transtHis.put(depositAmount,"Amount deposited");
        System.out.println(depositAmount+" amount deposited successfully.");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
    }

    @Override
    public void Transfer(double Transfer) {
        if(Transfer<=atm.getBalance()) {
            transtHis.put(Transfer, "Amount Transferred");
            System.out.println(Transfer + "amount transferred successfully.");
            atm.setBalance(atm.getBalance() - Transfer);
            viewBalance();
        }
        else {
            System.out.println("Insufficient Amount...!!");
            System.exit(0);
        }
    }

    @Override
    public void viewBalance() {
        System.out.println("Available Balance: "+atm.getBalance());
    }

    @Override
    public void withdrawAmount() {

    }

    @Override
    public void depositAmount() {

    }

    @Override
    public void Transfer() {

    }

}
