package main.homepage.main.di;

import main.homepage.common.Mail;
import main.homepage.mail.Html;

public class UserMail extends CommonMail {
    public UserMail() {
        super(new Html());
    }
    public int execute() {
        return execute_check(new Html());
    }
}
