package com.data;

public class SavingAccount extends BankAccount {

    private String accountHolderName;
    private String accountHolderIdProof;
    private String accountHolderAddress;

    public SavingAccount(int accountNumber, String accountOpeningDate, String modeOfOperation, boolean internetBanking, int availableBalance, String accountHolderName, String accountHolderIdProof, String accountHolderAddress) {
        super(accountNumber, accountOpeningDate, modeOfOperation, internetBanking, availableBalance);
        this.accountHolderName = accountHolderName;
        this.accountHolderIdProof = accountHolderIdProof;
        this.accountHolderAddress = accountHolderAddress;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderIdProof() {
        return accountHolderIdProof;
    }

    public void setAccountHolderIdProof(String accountHolderIdProof) {
        this.accountHolderIdProof = accountHolderIdProof;
    }

    public String getAccountHolderAddress() {
        return accountHolderAddress;
    }

    public void setAccountHolderAddress(String accountHolderAddress) {
        this.accountHolderAddress = accountHolderAddress;
    }

    @Override
    public int showAccountBalance() {
        return getAvailableBalance();
    }

    @Override
    public int creditBalance(int amount) {
        return getAvailableBalance();

    }

    @Override
    public int debitBalance(int amount) {
        return getAvailableBalance() - amount;
    }
}
