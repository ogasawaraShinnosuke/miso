package main.homepage.main.di;

import main.homepage.common.Mail;
import main.homepage.mail.Standard;

public class AdminMail extends CommonMail {
    public AdminMail() {
        super(new Standard());
    }
    public int execute() {
        return execute_check(new Standard());
    }
}
