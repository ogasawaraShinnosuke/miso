package main.homepage.mail;

import main.homepage.common.Mail;
import main.homepage.common.Postfix;

public class Standard extends Postfix implements Mail{
    @Override
    public void send() {
        // スタンダードなメール送信の実装
    }
}
