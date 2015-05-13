package main.homepage.main.di;

import main.homepage.common.Mail;

public class CommonMail {
    private void execute(Mail mail) {
        new MailDI(mail).send();
    }
    protected CommonMail(Mail mail) {
        execute(mail);
    }
}
