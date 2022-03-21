package com.company;

public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public Account(){
        this("56789",2.50,"Default name","Default address","default phone");
        System.out.println("Empty constructor called");
    }
    public Account(String number, double balance,String customerName,String customerEmail,String customerPhoneNumber){
        this.accountNumber = number;
        this.balance = balance;
        this.customerName= customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber= customerPhoneNumber;
    }

    public Account(String customerName, String customerEmail, String customerPhoneNumber) {
        this("99999",100.55,customerName,customerEmail,customerPhoneNumber);
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
    }
    public void withdrawal(double withdrawal){
        if(this.balance - withdrawal <0){
            System.out.println("Only "+this.balance+" available. Withdrawal not processed");
        }else{
            this.balance -=withdrawal;
            System.out.println("Withdrawal of "+ withdrawal+" processed. Remaining balance "+ this.balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
