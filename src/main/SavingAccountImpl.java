package main;

import com.data.SavingAccount;

public class SavingAccountImpl {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(80804545, "20-02-2022", "self", true, 50000, "Sam", "404055555", "New York");
        savingAccount.setAccountNumber(696920202);
        savingAccount.setAccountHolderName("Rocky");
        savingAccount.setAccountOpeningDate("27-04-2021");
        savingAccount.setAccountHolderIdProof("828240040");
        savingAccount.setAvailableBalance(5000);
        savingAccount.setModeOfOperation("self");
        savingAccount.setInternetBanking(true);

        System.out.println(savingAccount.getINTEREST_RATE());
        System.out.println(savingAccount.creditBalance(2000));
        System.out.println(savingAccount.debitBalance(1000));
        System.out.println(savingAccount.showAccountBalance());
    }

}