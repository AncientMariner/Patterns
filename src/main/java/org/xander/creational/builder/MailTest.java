package org.xander.creational.builder;

public class MailTest {
    public static void main(String[] args) {
        Mail.send(mailer ->
                mailer.from("address")
                        .to("to")
                        .subject("subject")
                        .body("body"));
    }
}
