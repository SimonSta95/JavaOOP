package OOPBigDecimal;

import java.math.BigDecimal;

public class Account {
    String accountNumber;
    BigDecimal accountBalance;
    Client customer;

    public Account() {
    }

    public Account(String accountNumber, BigDecimal accountBalance, Client customer) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customer = customer;
    }

    public void deposit(BigDecimal amount) {
        accountBalance = accountBalance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        accountBalance = accountBalance.subtract(amount);
    }
}
