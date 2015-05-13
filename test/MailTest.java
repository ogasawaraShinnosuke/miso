package test.main.homepage.common;

import junit.framework.TestCase;
import main.homepage.main.di.AdminMail;
import main.homepage.main.di.AdvertiseMail;
import main.homepage.main.di.UserMail;
import org.junit.Test;

public class MailTest extends TestCase {

    @Test
    public void testAdminMail() throws Exception {
        new AdminMail();
    }

    @Test
    public void testAdvertiseMail() throws Exception {
        new AdvertiseMail();
    }

    @Test
    public void testUserMail() throws Exception {
        new UserMail();
    }
}
