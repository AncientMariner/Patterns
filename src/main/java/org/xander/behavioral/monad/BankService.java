package org.xander.behavioral.monad;

import java.math.BigDecimal;

public class BankService {
    private final static Balance initialBalance = new Balance(BigDecimal.ZERO);

    public static Try<FunctionalAccount> open(String owner, String number, BigDecimal balance) {
        if (initialBalance.amount.compareTo(BigDecimal.ZERO) < 0) {
            return new Failure<>(new IllegalArgumentException("initial amount is negative"));
        }
        return new Success<>(new FunctionalAccount(owner, number, new Balance(balance)));
    }

    public static FunctionalAccount credit(FunctionalAccount account, BigDecimal value) {
        return new FunctionalAccount(account.getOwner(), account.getNumber(), new Balance(account.getBalance().amount.add(value)));
    }

    public static Try<FunctionalAccount> debit(FunctionalAccount account, BigDecimal value) {
        if (account.getBalance().amount.compareTo(value) < 0) {
            return new Failure<>(new IllegalArgumentException("not enough money"));
        }
        return new Success<>(new FunctionalAccount(account.getOwner(), account.getNumber(), new Balance(account.getBalance().amount.subtract(value))));
    }

    public static void main(String[] args) {
        Try<FunctionalAccount> account = open("Alice", "123", new BigDecimal(100))
                .map(acc -> credit(acc, new BigDecimal(200)))
                .map(acc -> credit(acc, new BigDecimal(300)))
                .flatMap(acc -> debit(acc, new BigDecimal(400)));
        Try<FunctionalAccount> failure = open("Alice", "123", new BigDecimal(50))
                .map(acc -> credit(acc, new BigDecimal(20)))
                .map(acc -> credit(acc, new BigDecimal(30)))
                .flatMap(acc -> debit(acc, new BigDecimal(120)));
    }
}
