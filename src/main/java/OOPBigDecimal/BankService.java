package OOPBigDecimal;

import java.math.BigDecimal;

public class BankService {

    public String openAccount(Client customer) {

        Account account = new Account(customer.customerNumber(), new BigDecimal(0), customer );
        return account.accountNumber;
    }

    public void transferMoney(Account from, Account to, BigDecimal amount) {
        from.accountBalance.subtract(amount);
        to.accountBalance.add(amount);
    }
}
