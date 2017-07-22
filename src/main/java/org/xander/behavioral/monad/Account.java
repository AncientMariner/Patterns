package org.xander.behavioral.monad;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Account {
    private final String owner;
    private final String number;
    private Balance balance = new Balance(BigDecimal.ZERO);

    public Account(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    public void credit(BigDecimal value) {
        balance = new Balance(balance.amount.add(value));
    }

    public void debit(BigDecimal value) {
        if (balance.amount.compareTo(value) < 0) {
            throw new IllegalArgumentException("not enough money");
        }
        balance = new Balance(balance.amount.subtract(value));
    }

    public static void main(String[] args) {
        Account a = new Account("Alice", "123");
        Account b = new Account("Bob", "456");
        Account c = new Account("Charlie", "789");

        List<Account> unpaid = new ArrayList<>();
        Stream.of(a, b, c).forEach(account -> {
            try {
                account.debit(new BigDecimal(100));
            } catch (IllegalArgumentException e) {
                unpaid.add(account);
            }
        });
    }
}
