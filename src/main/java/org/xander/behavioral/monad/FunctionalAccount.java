package org.xander.behavioral.monad;

import javafx.util.Pair;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalAccount {
    private final String owner;
    private final String number;
    private final Balance balance;

    public FunctionalAccount(String owner, String number, Balance balance) {
        this.owner = owner;
        this.number = number;
        this.balance = balance;
    }

    public FunctionalAccount credit(BigDecimal value) {
        return new FunctionalAccount(owner, number, new Balance(balance.amount.add(value)));
    }

    public Try<FunctionalAccount> debit(BigDecimal value) {
        if (balance.amount.compareTo(value) < 0) {
          return new Failure<>(new IllegalArgumentException());
        }
        return new Success<>(new FunctionalAccount(owner, number, new Balance(balance.amount.add(value))));
    }


    public String getOwner() {
        return owner;
    }

    public String getNumber() {
        return number;
    }

    public Balance getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        FunctionalAccount a = new FunctionalAccount("Alice", "123", new Balance(BigDecimal.ZERO));
        FunctionalAccount b = new FunctionalAccount("Bob", "456", new Balance(BigDecimal.ZERO));
        FunctionalAccount c = new FunctionalAccount("Charlie", "789", new Balance(BigDecimal.valueOf(150)));

        List<FunctionalAccount> unpaid = Stream.of(a, b, c)
                .map(account -> new Pair<>(account, account.debit(new BigDecimal(100))))
                .filter(t -> t.getValue().isFailure())
                .map(t -> t.getKey())
                .collect(Collectors.toList());

        List<FunctionalAccount> accounts = Stream.of(a, b, c)
                .filter(accout -> accout.debit(new BigDecimal(100)).isFailure())
                .collect(Collectors.toList());
    }
}
