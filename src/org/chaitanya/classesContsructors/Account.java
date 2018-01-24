package org.chaitanya.classesContsructors;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailaddress;
    private String customerPhno;


    public Account(String number,double balance,String customerName, String customerEmailaddress, String customerPhno){
        this.number=number;
        this.balance=balance;
        this.customerEmailaddress=customerEmailaddress;
        this.customerName=customerName;
        this.customerPhno=customerPhno;
    }


    public void deposit(double amount){
        this.balance=amount;
    }

    public void withdraw(double amount){
        if(this.balance<=0){
            System.out.println("insufficient funds in the account");
        }else {
            this.balance -= amount;
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public String getCustomerEmailaddress() {
        return customerEmailaddress;
    }

    public void setCustomerEmailaddress(String customerEmailaddress) {
        this.customerEmailaddress = customerEmailaddress;
    }

    public String getCustomerPhno() {
        return customerPhno;
    }

    public void setCustomerPhno(String customerPhno) {
        this.customerPhno = customerPhno;
    }
}


