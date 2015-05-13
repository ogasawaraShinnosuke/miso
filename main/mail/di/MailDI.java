package main.homepage.main.di;

import main.homepage.common.Mail;

public class MailDI {
    Mail mail = null;

    public MailDI(Mail interfaceMail) {
        mail = interfaceMail;
    }

    public void send() {
        mail.send();
    }
}
