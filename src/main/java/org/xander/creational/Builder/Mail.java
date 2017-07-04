package org.xander.creational.Builder;

import java.util.function.Consumer;

public class Mail {
    private Mail() {
    }

    public Mail from(final String address) {
        return this;
    }
    public Mail to(final String address) {
        return this;
    }
    public Mail subject(final String address) {
        return this;
    }
    public Mail body(final String address) {
        return this;
    }

    public static void send(final Consumer<Mail> block) {
        final Mail mail = new Mail();
        block.accept(mail);
        System.out.println("sending...");
    }
}
