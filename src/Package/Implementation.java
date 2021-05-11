package Package;

public class Implementation {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private Long phoneNumber;

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

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void depositfund(int amount){
        this.balance=this.balance+amount;
        System.out.println(this.balance);;
    }
    public void withdrawl(int money){
        if(money>this.balance){
            System.out.println("insufficient funds");
        }
        else{
            this.balance=this.balance-money;
        }
        System.out.println(this.balance);
    }
}
