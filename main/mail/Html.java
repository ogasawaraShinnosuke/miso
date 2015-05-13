package main.homepage.mail;

import main.homepage.common.Mail;
import main.homepage.common.Postfix;

public class Html extends Postfix implements Mail {
    @Override
    public void send() {
        // HTMLメール送信の実装
    }
}
