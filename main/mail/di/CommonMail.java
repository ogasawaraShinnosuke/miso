package main.homepage.main.di;

import main.homepage.common.Mail;

public class CommonMail {
    protected void execute(Mail mail) {
        new MailDI(mail).send();
    }
    protected CommonMail(Mail mail) {
        execute(mail);
    }

    // test code.
    public static final int SUCCESS_VALUE = 1;
    public static final int FAIL_VALUE = 0;
    protected int execute_check(Mail mail) {
        try {
            execute(mail);
        } catch (Exception e) {
            return fail();
        }
        return success();
    }
    protected int success() {
        return SUCCESS_VALUE;
    }
    protected int fail() {
        return FAIL_VALUE;
    }
}
