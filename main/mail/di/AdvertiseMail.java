package main.homepage.main.di;

import main.homepage.common.Asp;
import main.homepage.mail.OISAsp;

public class AdvertiseMail extends CommonMail{
    public AdvertiseMail() {
        super(new OISAsp());
    }
}
