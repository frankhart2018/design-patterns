package com.company;

public class Main {

    public static void main(String[] args) {
        // Making the chain first Fax -> Email
        ReceiverInterface faxHadler, emailHandler;

        // End of chain
        emailHandler = new EmailErrorHandler();

        // Fax handler is before email
        faxHadler = new FaxErrorHandler();
        faxHadler.setNextChain(emailHandler);

        // Starting point: raiser will raise issues and set the first handler
        IssueRaiser raiser = new IssueRaiser(faxHadler);

        Message m1 = new Message("Fax is reaching late to the destination", MessagePriority.Normal);
        Message m2 = new Message("Email is not going", MessagePriority.High);
        Message m3 = new Message("In Email, BCC field is disabled occasionally", MessagePriority.Normal);
        Message m4 = new Message("Fax is not reaching destination", MessagePriority.High);

        raiser.raiseMessage(m1);
        raiser.raiseMessage(m2);
        raiser.raiseMessage(m3);
        raiser.raiseMessage(m4);
    }
}
